// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g 2011-05-15 18:58:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROG", "NIL_TOKEN", "ANY", "LAMBDA", "SQUARE_LIST", "ROUND_LIST", "LIST_CONS", "COMPARE", "APPLY", "IF", "MAP_OR_SET_OR_OBJ", "EMPTY_MAP", "EXCEPTION", "MATCH", "TRY", "CASES", "OBJ", "FOR_EXPR", "WHILE_DO", "MESSAGE_SEND", "UMINUS", "POW", "PARENTS_PLUS", "PARENTS_MUL", "BLOCK", "BEGIN", "WITH", "VAL", "OBJELEM_ASSIGN", "ASSIGN", "ARROW", "DEF", "YIELD", "PRIVATE", "TYPEDEF", "TYPEDEF_CLAUSE", "GETTYPE", "MEMOIZE", "MEMOID_STRONG", "MEMOID_WEAK", "PRIVATEID", "IF_PATTERN", "TYPE_PATTERN", "INNERVALUE_PATTERN", "TYPEID", "MODULEID", "TYPE_EXPR", "TYPEOF", "CONVERSION", "IMPORT_PREFIX", "IMPORT_ALL", "IMPORT_SET", "IMPORT_PLUS", "IMPORT_MINUS", "Newline", "NotNewline", "COMMENT", "LINECOMMENT", "SmallLetter", "BigLetter", "Letter", "Digit", "Hex", "L_begin", "L_end", "L_obj", "L_with", "L_if", "L_then", "L_else", "L_elseif", "L_while", "L_for", "L_do", "L_yield", "L_match", "L_case", "L_as", "L_val", "L_def", "L_in", "L_exception", "L_to", "L_downto", "L_try", "L_catch", "A_infinity", "U_infinity", "L_concurrent", "L_choose", "L_lazy", "L_memoize", "L_true", "L_false", "L_this", "L_random", "L_nil", "L_div", "L_mod", "L_module", "L_typedef", "L_typeof", "L_private", "L_import", "L_unittest", "A_EQUAL", "U_EQUAL", "A_NOT_EQUAL", "U_NOT_EQUAL", "LESS", "A_LESS_EQ", "U_LESS_EQ", "GREATER", "A_GREATER_EQ", "U_GREATER_EQ", "SC", "PLUS", "MINUS", "TIMES", "QUOTIENT", "POW_tok", "A_OR", "A_AND", "A_NOT", "U_OR", "U_AND", "U_NOT", "A_DOUBLE_COLON", "U_DOUBLE_COLON", "TIMESTIMES", "QUOTIENTQUOTIENT", "PLUSPLUS", "MINUSMINUS", "A_DOUBLE_ARROW", "U_DOUBLE_ARROW", "A_ARROW", "U_ARROW", "A_ELLIPSIS", "U_ELLIPSIS", "COMMA", "PERIOD", "QUESTION_MARK", "L_force", "WsChar", "WS", "NL", "Constr", "Id", "Num", "Charcode", "String", "ROUND_BRACKET_OPEN", "ROUND_BRACKET_CLOSE", "SQUARE_BRACKET_OPEN", "SQUARE_BRACKET_CLOSE", "CURLY_BRACKET_OPEN", "CURLY_BRACKET_CLOSE", "UNDERSCORE", "COLON", "PRAGMA_LOG", "PRAGMA_PRINT", "PRAGMA_ASSERT", "PRAGMA_PROFILE"
    };
    public static final int U_AND=129;
    public static final int L_end=68;
    public static final int U_NOT_EQUAL=112;
    public static final int TIMESTIMES=133;
    public static final int BigLetter=63;
    public static final int L_try=88;
    public static final int ROUND_BRACKET_CLOSE=156;
    public static final int L_mod=102;
    public static final int A_OR=125;
    public static final int MINUSMINUS=136;
    public static final int IMPORT_PREFIX=53;
    public static final int Newline=58;
    public static final int SQUARE_BRACKET_CLOSE=158;
    public static final int LINECOMMENT=61;
    public static final int MAP_OR_SET_OR_OBJ=14;
    public static final int EOF=-1;
    public static final int U_DOUBLE_ARROW=138;
    public static final int TYPEID=48;
    public static final int L_exception=85;
    public static final int Num=152;
    public static final int GREATER=116;
    public static final int EMPTY_MAP=15;
    public static final int POW=25;
    public static final int L_concurrent=92;
    public static final int L_catch=89;
    public static final int L_false=97;
    public static final int QUOTIENTQUOTIENT=134;
    public static final int L_nil=100;
    public static final int BEGIN=29;
    public static final int LIST_CONS=10;
    public static final int L_with=70;
    public static final int QUESTION_MARK=145;
    public static final int LESS=113;
    public static final int ROUND_BRACKET_OPEN=155;
    public static final int SQUARE_LIST=8;
    public static final int MODULEID=49;
    public static final int VAL=31;
    public static final int L_as=81;
    public static final int NL=149;
    public static final int MESSAGE_SEND=23;
    public static final int A_ARROW=139;
    public static final int A_DOUBLE_COLON=131;
    public static final int COMMENT=60;
    public static final int L_def=83;
    public static final int A_AND=126;
    public static final int EXCEPTION=16;
    public static final int TYPE_EXPR=50;
    public static final int L_this=98;
    public static final int IMPORT_ALL=54;
    public static final int L_force=146;
    public static final int L_choose=93;
    public static final int PERIOD=144;
    public static final int PRIVATE=37;
    public static final int L_import=107;
    public static final int SmallLetter=62;
    public static final int NIL_TOKEN=5;
    public static final int PRAGMA_PRINT=164;
    public static final int CURLY_BRACKET_OPEN=159;
    public static final int L_typedef=104;
    public static final int UNDERSCORE=161;
    public static final int MATCH=17;
    public static final int U_LESS_EQ=115;
    public static final int TRY=18;
    public static final int L_to=86;
    public static final int L_unittest=108;
    public static final int WS=148;
    public static final int IMPORT_MINUS=57;
    public static final int Charcode=153;
    public static final int TYPEOF=51;
    public static final int L_do=77;
    public static final int L_val=82;
    public static final int L_match=79;
    public static final int L_obj=69;
    public static final int WsChar=147;
    public static final int L_module=103;
    public static final int GETTYPE=40;
    public static final int Hex=66;
    public static final int L_private=106;
    public static final int TYPE_PATTERN=46;
    public static final int L_for=76;
    public static final int MEMOID_WEAK=43;
    public static final int Letter=64;
    public static final int PRAGMA_ASSERT=165;
    public static final int APPLY=12;
    public static final int U_ARROW=140;
    public static final int PRAGMA_LOG=163;
    public static final int A_EQUAL=109;
    public static final int PRIVATEID=44;
    public static final int L_else=73;
    public static final int DEF=35;
    public static final int L_typeof=105;
    public static final int L_begin=67;
    public static final int U_NOT=130;
    public static final int L_div=101;
    public static final int L_yield=78;
    public static final int PLUSPLUS=135;
    public static final int MEMOID_STRONG=42;
    public static final int L_while=75;
    public static final int CASES=19;
    public static final int POW_tok=124;
    public static final int IF_PATTERN=45;
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
    public static final int INNERVALUE_PATTERN=47;
    public static final int YIELD=36;
    public static final int COMPARE=11;
    public static final int U_GREATER_EQ=118;
    public static final int U_EQUAL=110;
    public static final int PLUS=120;
    public static final int String=154;
    public static final int LAMBDA=7;
    public static final int L_true=96;
    public static final int Id=151;
    public static final int A_infinity=90;
    public static final int WITH=30;
    public static final int L_in=84;
    public static final int A_NOT=127;
    public static final int L_lazy=94;
    public static final int NotNewline=59;
    public static final int L_then=72;
    public static final int QUOTIENT=123;
    public static final int TYPEDEF=38;
    public static final int L_if=71;
    public static final int IMPORT_SET=55;
    public static final int CURLY_BRACKET_CLOSE=160;
    public static final int UMINUS=24;
    public static final int FOR_EXPR=21;
    public static final int Constr=150;
    public static final int WHILE_DO=22;
    public static final int L_elseif=74;
    public static final int MINUS=121;
    public static final int Digit=65;
    public static final int L_memoize=95;
    public static final int CONVERSION=52;
    public static final int A_GREATER_EQ=117;
    public static final int ROUND_LIST=9;
    public static final int COLON=162;
    public static final int PRAGMA_PROFILE=166;
    public static final int SC=119;
    public static final int L_downto=87;
    public static final int ANY=6;
    public static final int L_random=99;
    public static final int A_NOT_EQUAL=111;
    public static final int BLOCK=28;
    public static final int ASSIGN=33;
    public static final int U_DOUBLE_COLON=132;
    public static final int OBJELEM_ASSIGN=32;
    public static final int ARROW=34;
    public static final int IMPORT_PLUS=56;
    public static final int L_case=80;
    public static final int TIMES=122;
    public static final int U_infinity=91;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:129:1: prog : block EOF -> ^( PROG block ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:129:7: ( block EOF -> ^( PROG block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:129:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog248);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog250); if (state.failed) return retval; 
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
            // 129:19: -> ^( PROG block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:129:22: ^( PROG block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:197:1: token_infinity : ( A_infinity | U_infinity );
    public final babel17Parser.token_infinity_return token_infinity() throws RecognitionException {
        babel17Parser.token_infinity_return retval = new babel17Parser.token_infinity_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set3=null;

        CommonTree set3_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:198:2: ( A_infinity | U_infinity )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:243:1: token_EQUAL : ( A_EQUAL | U_EQUAL );
    public final babel17Parser.token_EQUAL_return token_EQUAL() throws RecognitionException {
        babel17Parser.token_EQUAL_return retval = new babel17Parser.token_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set4=null;

        CommonTree set4_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:244:2: ( A_EQUAL | U_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:251:1: token_NOT_EQUAL : ( A_NOT_EQUAL | U_NOT_EQUAL );
    public final babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL() throws RecognitionException {
        babel17Parser.token_NOT_EQUAL_return retval = new babel17Parser.token_NOT_EQUAL_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;

        CommonTree set5_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:252:2: ( A_NOT_EQUAL | U_NOT_EQUAL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:260:1: token_LESS_EQ : ( A_LESS_EQ | U_LESS_EQ );
    public final babel17Parser.token_LESS_EQ_return token_LESS_EQ() throws RecognitionException {
        babel17Parser.token_LESS_EQ_return retval = new babel17Parser.token_LESS_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set6=null;

        CommonTree set6_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:261:2: ( A_LESS_EQ | U_LESS_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:270:1: token_GREATER_EQ : ( A_GREATER_EQ | U_GREATER_EQ );
    public final babel17Parser.token_GREATER_EQ_return token_GREATER_EQ() throws RecognitionException {
        babel17Parser.token_GREATER_EQ_return retval = new babel17Parser.token_GREATER_EQ_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set7=null;

        CommonTree set7_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:271:2: ( A_GREATER_EQ | U_GREATER_EQ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:1: token_OR : ( A_OR | U_OR );
    public final babel17Parser.token_OR_return token_OR() throws RecognitionException {
        babel17Parser.token_OR_return retval = new babel17Parser.token_OR_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:288:9: ( A_OR | U_OR )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:289:1: token_AND : ( A_AND | U_AND );
    public final babel17Parser.token_AND_return token_AND() throws RecognitionException {
        babel17Parser.token_AND_return retval = new babel17Parser.token_AND_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:290:2: ( A_AND | U_AND )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:291:1: token_NOT : ( A_NOT | U_NOT );
    public final babel17Parser.token_NOT_return token_NOT() throws RecognitionException {
        babel17Parser.token_NOT_return retval = new babel17Parser.token_NOT_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:292:2: ( A_NOT | U_NOT )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:298:1: token_DOUBLE_COLON : ( A_DOUBLE_COLON | U_DOUBLE_COLON );
    public final babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON() throws RecognitionException {
        babel17Parser.token_DOUBLE_COLON_return retval = new babel17Parser.token_DOUBLE_COLON_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:299:2: ( A_DOUBLE_COLON | U_DOUBLE_COLON )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:315:1: token_DOUBLE_ARROW : ( A_DOUBLE_ARROW | U_DOUBLE_ARROW );
    public final babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW() throws RecognitionException {
        babel17Parser.token_DOUBLE_ARROW_return retval = new babel17Parser.token_DOUBLE_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:316:2: ( A_DOUBLE_ARROW | U_DOUBLE_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:320:1: token_ARROW : ( A_ARROW | U_ARROW );
    public final babel17Parser.token_ARROW_return token_ARROW() throws RecognitionException {
        babel17Parser.token_ARROW_return retval = new babel17Parser.token_ARROW_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set13=null;

        CommonTree set13_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:321:2: ( A_ARROW | U_ARROW )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:326:1: token_ELLIPSIS : ( A_ELLIPSIS | U_ELLIPSIS );
    public final babel17Parser.token_ELLIPSIS_return token_ELLIPSIS() throws RecognitionException {
        babel17Parser.token_ELLIPSIS_return retval = new babel17Parser.token_ELLIPSIS_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set14=null;

        CommonTree set14_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:327:2: ( A_ELLIPSIS | U_ELLIPSIS )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:1: typeid : Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) ;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:9: ( Id ( ( NL )? PERIOD ( NL )? Id )* -> ^( TYPEID ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:11: Id ( ( NL )? PERIOD ( NL )? Id )*
            {
            Id15=(Token)match(input,Id,FOLLOW_Id_in_typeid1690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id15);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:14: ( ( NL )? PERIOD ( NL )? Id )*
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
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:15: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:15: ( NL )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==NL) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:15: NL
            	            {
            	            NL16=(Token)match(input,NL,FOLLOW_NL_in_typeid1693); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL16);


            	            }
            	            break;

            	    }

            	    PERIOD17=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_typeid1696); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD17);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:26: ( NL )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==NL) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:26: NL
            	            {
            	            NL18=(Token)match(input,NL,FOLLOW_NL_in_typeid1698); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL18);


            	            }
            	            break;

            	    }

            	    Id19=(Token)match(input,Id,FOLLOW_Id_in_typeid1701); if (state.failed) return retval; 
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
            // 397:35: -> ^( TYPEID ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:38: ^( TYPEID ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEID, "TYPEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:397:47: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:399:1: typeannotation : ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:2: ( typeid | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:400:4: typeid
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_typeid_in_typeannotation1721);
                    typeid20=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeid20.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val21=(Token)match(input,L_val,FOLLOW_L_val_in_typeannotation1726); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val21);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: ( NL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==NL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:401:10: NL
                            {
                            NL22=(Token)match(input,NL,FOLLOW_NL_in_typeannotation1728); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL22);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_typeannotation1731);
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

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:1: pattern : ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:9: ( Constr ( ( NL )? pattern )? -> ^( Constr ( pattern )? ) | primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | L_exception ( NL )? pattern -> ^( L_exception pattern ) | token_ELLIPSIS )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:11: Constr ( ( NL )? pattern )?
                    {
                    Constr24=(Token)match(input,Constr,FOLLOW_Constr_in_pattern1748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr24);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:18: ( ( NL )? pattern )?
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
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:19: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:19: ( NL )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==NL) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:19: NL
                                    {
                                    NL25=(Token)match(input,NL,FOLLOW_NL_in_pattern1751); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL25);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_pattern1754);
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
                    // 404:33: -> ^( Constr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:36: ^( Constr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:404:45: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_pattern1770);
                    primitive_pattern27=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern27.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:23: ( NL )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==NL) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:23: NL
                    	            {
                    	            NL28=(Token)match(input,NL,FOLLOW_NL_in_pattern1773); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL28);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_pattern1776);
                    	    token_DOUBLE_COLON29=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON29.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:46: ( NL )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==NL) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:405:46: NL
                    	            {
                    	            NL30=(Token)match(input,NL,FOLLOW_NL_in_pattern1778); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL30);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_pattern1781);
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
                    // 406:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:406:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:4: L_exception ( NL )? pattern
                    {
                    L_exception32=(Token)match(input,L_exception,FOLLOW_L_exception_in_pattern1800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_exception.add(L_exception32);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:16: ( NL )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NL) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:16: NL
                            {
                            NL33=(Token)match(input,NL,FOLLOW_NL_in_pattern1802); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL33);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_pattern1805);
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
                    // 407:28: -> ^( L_exception pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:407:31: ^( L_exception pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:408:4: token_ELLIPSIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_ELLIPSIS_in_pattern1818);
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:410:1: defpattern : ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) );
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:2: ( primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )* -> ^( LIST_CONS ( primitive_pattern )* ) | Constr ( defpattern )? -> ^( Constr ( defpattern )? ) )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:4: primitive_pattern ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
                    {
                    pushFollow(FOLLOW_primitive_pattern_in_defpattern1828);
                    primitive_pattern36=primitive_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_pattern.add(primitive_pattern36.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:22: ( ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern )*
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
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:23: ( NL )? token_DOUBLE_COLON ( NL )? primitive_pattern
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:23: ( NL )?
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==NL) ) {
                    	        alt13=1;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:23: NL
                    	            {
                    	            NL37=(Token)match(input,NL,FOLLOW_NL_in_defpattern1831); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL37);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_defpattern1834);
                    	    token_DOUBLE_COLON38=token_DOUBLE_COLON();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON38.getTree());
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:46: ( NL )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==NL) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:411:46: NL
                    	            {
                    	            NL39=(Token)match(input,NL,FOLLOW_NL_in_defpattern1836); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL39);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_primitive_pattern_in_defpattern1839);
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
                    // 412:3: -> ^( LIST_CONS ( primitive_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:6: ^( LIST_CONS ( primitive_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:412:18: ( primitive_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:4: Constr ( defpattern )?
                    {
                    Constr41=(Token)match(input,Constr,FOLLOW_Constr_in_defpattern1857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Constr.add(Constr41);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:11: ( defpattern )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=A_infinity && LA16_0<=U_infinity)||(LA16_0>=L_true && LA16_0<=L_false)||LA16_0==L_nil||LA16_0==MINUS||(LA16_0>=Constr && LA16_0<=Num)||(LA16_0>=String && LA16_0<=ROUND_BRACKET_OPEN)||LA16_0==SQUARE_BRACKET_OPEN||LA16_0==CURLY_BRACKET_OPEN||LA16_0==UNDERSCORE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:11: defpattern
                            {
                            pushFollow(FOLLOW_defpattern_in_defpattern1859);
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
                    // 413:23: -> ^( Constr ( defpattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:26: ^( Constr ( defpattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_Constr.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:413:35: ( defpattern )?
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

    public static class casepattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casepattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:415:1: casepattern : ( ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
    public final babel17Parser.casepattern_return casepattern() throws RecognitionException {
        babel17Parser.casepattern_return retval = new babel17Parser.casepattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL44=null;
        Token char_literal45=null;
        Token NL46=null;
        babel17Parser.pattern_return pattern43 = null;

        babel17Parser.typeannotation_return typeannotation47 = null;

        babel17Parser.pattern_return pattern48 = null;


        CommonTree NL44_tree=null;
        CommonTree char_literal45_tree=null;
        CommonTree NL46_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_typeannotation=new RewriteRuleSubtreeStream(adaptor,"rule typeannotation");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:2: ( ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:5: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_casepattern1890);
                    pattern43=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern43.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:34: ( NL )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==NL) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:34: NL
                            {
                            NL44=(Token)match(input,NL,FOLLOW_NL_in_casepattern1892); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL44);


                            }
                            break;

                    }

                    char_literal45=(Token)match(input,COLON,FOLLOW_COLON_in_casepattern1895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal45);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:42: ( NL )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==NL) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:42: NL
                            {
                            NL46=(Token)match(input,NL,FOLLOW_NL_in_casepattern1897); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL46);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_casepattern1900);
                    typeannotation47=typeannotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeannotation.add(typeannotation47.getTree());


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
                    // 416:61: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:64: ^( TYPE_PATTERN typeannotation pattern )
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
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:417:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_casepattern1915);
                    pattern48=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern48.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "casepattern"

    public static class bracket_pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bracket_pattern"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:420:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );
    public final babel17Parser.bracket_pattern_return bracket_pattern() throws RecognitionException {
        babel17Parser.bracket_pattern_return retval = new babel17Parser.bracket_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id49=null;
        Token NL50=null;
        Token L_as51=null;
        Token NL52=null;
        Token NL55=null;
        Token QUESTION_MARK56=null;
        Token NL57=null;
        Token Id59=null;
        Token L_val61=null;
        Token NL62=null;
        Token L_for64=null;
        Token NL65=null;
        Token NL67=null;
        Token COMMA68=null;
        Token NL69=null;
        Token NL71=null;
        Token L_end72=null;
        Token NL74=null;
        Token L_if75=null;
        Token NL76=null;
        Token NL79=null;
        Token char_literal80=null;
        Token NL81=null;
        babel17Parser.pattern_return pattern53 = null;

        babel17Parser.protected_expr_return protected_expr54 = null;

        babel17Parser.pattern_return pattern58 = null;

        babel17Parser.pattern_return pattern60 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc63 = null;

        babel17Parser.bracket_pattern_return bracket_pattern66 = null;

        babel17Parser.bracket_pattern_return bracket_pattern70 = null;

        babel17Parser.pattern_return pattern73 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc77 = null;

        babel17Parser.pattern_return pattern78 = null;

        babel17Parser.typeannotation_return typeannotation82 = null;

        babel17Parser.pattern_return pattern83 = null;


        CommonTree Id49_tree=null;
        CommonTree NL50_tree=null;
        CommonTree L_as51_tree=null;
        CommonTree NL52_tree=null;
        CommonTree NL55_tree=null;
        CommonTree QUESTION_MARK56_tree=null;
        CommonTree NL57_tree=null;
        CommonTree Id59_tree=null;
        CommonTree L_val61_tree=null;
        CommonTree NL62_tree=null;
        CommonTree L_for64_tree=null;
        CommonTree NL65_tree=null;
        CommonTree NL67_tree=null;
        CommonTree COMMA68_tree=null;
        CommonTree NL69_tree=null;
        CommonTree NL71_tree=null;
        CommonTree L_end72_tree=null;
        CommonTree NL74_tree=null;
        CommonTree L_if75_tree=null;
        CommonTree NL76_tree=null;
        CommonTree NL79_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree NL81_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:2: ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern )
            int alt37=8;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:10: ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern
                    {
                    Id49=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern1943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id49);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:30: ( NL )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==NL) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:30: NL
                            {
                            NL50=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1945); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL50);


                            }
                            break;

                    }

                    L_as51=(Token)match(input,L_as,FOLLOW_L_as_in_bracket_pattern1948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_as.add(L_as51);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:39: ( NL )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NL) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:39: NL
                            {
                            NL52=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1950); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL52);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pattern_in_bracket_pattern1953);
                    pattern53=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern53.getTree());


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
                    // 421:51: -> ^( L_as Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:54: ^( L_as Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )?
                    {
                    pushFollow(FOLLOW_protected_expr_in_bracket_pattern1982);
                    protected_expr54=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr54.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:18: ( NL )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==NL) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:18: NL
                            {
                            NL55=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1984); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL55);


                            }
                            break;

                    }

                    QUESTION_MARK56=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_bracket_pattern1987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_MARK.add(QUESTION_MARK56);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:36: ( ( NL )? pattern )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NL) ) {
                        int LA25_1 = input.LA(2);

                        if ( (LA25_1==L_exception||(LA25_1>=A_infinity && LA25_1<=U_infinity)||(LA25_1>=L_true && LA25_1<=L_false)||LA25_1==L_nil||LA25_1==MINUS||(LA25_1>=A_ELLIPSIS && LA25_1<=U_ELLIPSIS)||(LA25_1>=Constr && LA25_1<=Num)||(LA25_1>=String && LA25_1<=ROUND_BRACKET_OPEN)||LA25_1==SQUARE_BRACKET_OPEN||LA25_1==CURLY_BRACKET_OPEN||LA25_1==UNDERSCORE) ) {
                            alt25=1;
                        }
                    }
                    else if ( (LA25_0==L_exception||(LA25_0>=A_infinity && LA25_0<=U_infinity)||(LA25_0>=L_true && LA25_0<=L_false)||LA25_0==L_nil||LA25_0==MINUS||(LA25_0>=A_ELLIPSIS && LA25_0<=U_ELLIPSIS)||(LA25_0>=Constr && LA25_0<=Num)||(LA25_0>=String && LA25_0<=ROUND_BRACKET_OPEN)||LA25_0==SQUARE_BRACKET_OPEN||LA25_0==CURLY_BRACKET_OPEN||LA25_0==UNDERSCORE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:37: ( NL )? pattern
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:37: ( NL )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==NL) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:37: NL
                                    {
                                    NL57=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern1990); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL57);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_pattern_in_bracket_pattern1993);
                            pattern58=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern58.getTree());

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
                    // 423:51: -> ^( QUESTION_MARK protected_expr ( pattern )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:54: ^( QUESTION_MARK protected_expr ( pattern )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUESTION_MARK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:423:85: ( pattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( Id pattern )=> Id pattern
                    {
                    Id59=(Token)match(input,Id,FOLLOW_Id_in_bracket_pattern2019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id59);

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2021);
                    pattern60=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern60.getTree());


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
                    // 424:31: -> ^( INNERVALUE_PATTERN Id pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:34: ^( INNERVALUE_PATTERN Id pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:4: L_val ( NL )? protected_expr_nc
                    {
                    L_val61=(Token)match(input,L_val,FOLLOW_L_val_in_bracket_pattern2036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_val.add(L_val61);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:10: ( NL )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NL) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:10: NL
                            {
                            NL62=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2038); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL62);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern2041);
                    protected_expr_nc63=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc63.getTree());


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
                    // 425:32: -> ^( L_val protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:425:35: ^( L_val protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:10: L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end
                    {
                    L_for64=(Token)match(input,L_for,FOLLOW_L_for_in_bracket_pattern2060); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_for.add(L_for64);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:16: ( NL )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NL) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:16: NL
                            {
                            NL65=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2062); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL65);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:20: ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==L_begin||(LA32_0>=L_obj && LA32_0<=L_if)||(LA32_0>=L_while && LA32_0<=L_for)||LA32_0==L_match||LA32_0==L_val||LA32_0==L_exception||LA32_0==L_try||(LA32_0>=A_infinity && LA32_0<=L_lazy)||(LA32_0>=L_true && LA32_0<=L_nil)||LA32_0==L_typeof||LA32_0==MINUS||LA32_0==A_NOT||LA32_0==U_NOT||(LA32_0>=A_ELLIPSIS && LA32_0<=U_ELLIPSIS)||LA32_0==L_force||(LA32_0>=Constr && LA32_0<=Num)||(LA32_0>=String && LA32_0<=ROUND_BRACKET_OPEN)||LA32_0==SQUARE_BRACKET_OPEN||LA32_0==CURLY_BRACKET_OPEN||LA32_0==UNDERSCORE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:21: bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern2066);
                            bracket_pattern66=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern66.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:37: ( ( NL )? COMMA ( NL )? bracket_pattern )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==NL) ) {
                                    int LA30_1 = input.LA(2);

                                    if ( (LA30_1==COMMA) ) {
                                        alt30=1;
                                    }


                                }
                                else if ( (LA30_0==COMMA) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:39: ( NL )? COMMA ( NL )? bracket_pattern
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:39: ( NL )?
                            	    int alt28=2;
                            	    int LA28_0 = input.LA(1);

                            	    if ( (LA28_0==NL) ) {
                            	        alt28=1;
                            	    }
                            	    switch (alt28) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:39: NL
                            	            {
                            	            NL67=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2070); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL67);


                            	            }
                            	            break;

                            	    }

                            	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_bracket_pattern2073); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA68);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:49: ( NL )?
                            	    int alt29=2;
                            	    int LA29_0 = input.LA(1);

                            	    if ( (LA29_0==NL) ) {
                            	        alt29=1;
                            	    }
                            	    switch (alt29) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:49: NL
                            	            {
                            	            NL69=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2075); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL69);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_bracket_pattern2078);
                            	    bracket_pattern70=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern70.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop30;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:72: ( NL )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==NL) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:72: NL
                                    {
                                    NL71=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2083); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL71);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    L_end72=(Token)match(input,L_end,FOLLOW_L_end_in_bracket_pattern2088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end72);



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
                    // 426:84: -> ^( L_for ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:87: ^( L_for ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_L_for.nextNode(), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:426:95: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:4: ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2113);
                    pattern73=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern73.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:34: ( NL )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==NL) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:34: NL
                            {
                            NL74=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2115); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL74);


                            }
                            break;

                    }

                    L_if75=(Token)match(input,L_if,FOLLOW_L_if_in_bracket_pattern2118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_if.add(L_if75);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:43: ( NL )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==NL) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:43: NL
                            {
                            NL76=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2120); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL76);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_bracket_pattern2123);
                    protected_expr_nc77=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc77.getTree());


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
                    // 427:65: -> ^( IF_PATTERN pattern protected_expr_nc )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:68: ^( IF_PATTERN pattern protected_expr_nc )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation
                    {
                    pushFollow(FOLLOW_pattern_in_bracket_pattern2149);
                    pattern78=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern78.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:33: ( NL )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==NL) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:33: NL
                            {
                            NL79=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL79);


                            }
                            break;

                    }

                    char_literal80=(Token)match(input,COLON,FOLLOW_COLON_in_bracket_pattern2154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal80);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:41: ( NL )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==NL) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:41: NL
                            {
                            NL81=(Token)match(input,NL,FOLLOW_NL_in_bracket_pattern2156); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL81);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeannotation_in_bracket_pattern2159);
                    typeannotation82=typeannotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeannotation.add(typeannotation82.getTree());


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
                    // 428:60: -> ^( TYPE_PATTERN typeannotation pattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:63: ^( TYPE_PATTERN typeannotation pattern )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:429:4: pattern
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pattern_in_bracket_pattern2174);
                    pattern83=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:431:1: arrow_or_assign : ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) );
    public final babel17Parser.arrow_or_assign_return arrow_or_assign() throws RecognitionException {
        babel17Parser.arrow_or_assign_return retval = new babel17Parser.arrow_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN85=null;
        babel17Parser.token_ARROW_return token_ARROW84 = null;


        CommonTree ASSIGN85_tree=null;
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:2: ( token_ARROW -> ^( ARROW ) | ASSIGN -> ^( ASSIGN ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=A_ARROW && LA38_0<=U_ARROW)) ) {
                alt38=1;
            }
            else if ( (LA38_0==ASSIGN) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:4: token_ARROW
                    {
                    pushFollow(FOLLOW_token_ARROW_in_arrow_or_assign2184);
                    token_ARROW84=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW84.getTree());


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
                    // 432:16: -> ^( ARROW )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:432:19: ^( ARROW )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:4: ASSIGN
                    {
                    ASSIGN85=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arrow_or_assign2195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN85);



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
                    // 433:11: -> ^( ASSIGN )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:433:14: ^( ASSIGN )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:435:1: mselem_pattern : bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.mselem_pattern_return mselem_pattern() throws RecognitionException {
        babel17Parser.mselem_pattern_return retval = new babel17Parser.mselem_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL87=null;
        Token NL89=null;
        babel17Parser.bracket_pattern_return bracket_pattern86 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign88 = null;

        babel17Parser.bracket_pattern_return bracket_pattern90 = null;


        CommonTree NL87_tree=null;
        CommonTree NL89_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_bracket_pattern=new RewriteRuleSubtreeStream(adaptor,"rule bracket_pattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:2: ( bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:4: bracket_pattern ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            {
            pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2210);
            bracket_pattern86=bracket_pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern86.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:20: ( ( NL )? arrow_or_assign ( NL )? bracket_pattern )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==NL) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==ASSIGN||(LA41_1>=A_ARROW && LA41_1<=U_ARROW)) ) {
                    alt41=1;
                }
            }
            else if ( (LA41_0==ASSIGN||(LA41_0>=A_ARROW && LA41_0<=U_ARROW)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:21: ( NL )? arrow_or_assign ( NL )? bracket_pattern
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:21: ( NL )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==NL) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:21: NL
                            {
                            NL87=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2213); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL87);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_mselem_pattern2216);
                    arrow_or_assign88=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign88.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:41: ( NL )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==NL) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:436:41: NL
                            {
                            NL89=(Token)match(input,NL,FOLLOW_NL_in_mselem_pattern2218); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL89);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_bracket_pattern_in_mselem_pattern2221);
                    bracket_pattern90=bracket_pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern90.getTree());

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
            // 437:3: -> ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:6: ^( NIL_TOKEN ^( NIL_TOKEN ( bracket_pattern )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:18: ^( NIL_TOKEN ( bracket_pattern )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:30: ( bracket_pattern )*
                while ( stream_bracket_pattern.hasNext() ) {
                    adaptor.addChild(root_2, stream_bracket_pattern.nextTree());

                }
                stream_bracket_pattern.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:437:48: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:439:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.primitive_pattern_return primitive_pattern() throws RecognitionException {
        babel17Parser.primitive_pattern_return retval = new babel17Parser.primitive_pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id91=null;
        Token char_literal92=null;
        Token String93=null;
        Token Num94=null;
        Token L_true95=null;
        Token L_false96=null;
        Token L_nil97=null;
        Token char_literal99=null;
        Token NL100=null;
        Token char_literal102=null;
        Token NL103=null;
        Token Num104=null;
        Token char_literal105=null;
        Token NL106=null;
        Token NL108=null;
        Token COMMA109=null;
        Token NL110=null;
        Token NL112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        Token NL115=null;
        Token NL117=null;
        Token COMMA118=null;
        Token NL119=null;
        Token NL121=null;
        Token COMMA122=null;
        Token NL123=null;
        Token char_literal124=null;
        Token char_literal125=null;
        Token NL126=null;
        Token NL128=null;
        Token COMMA129=null;
        Token NL130=null;
        Token NL132=null;
        Token char_literal133=null;
        Token char_literal134=null;
        Token NL135=null;
        Token NL137=null;
        Token char_literal138=null;
        babel17Parser.token_infinity_return token_infinity98 = null;

        babel17Parser.token_infinity_return token_infinity101 = null;

        babel17Parser.bracket_pattern_return bracket_pattern107 = null;

        babel17Parser.bracket_pattern_return bracket_pattern111 = null;

        babel17Parser.bracket_pattern_return bracket_pattern116 = null;

        babel17Parser.bracket_pattern_return bracket_pattern120 = null;

        babel17Parser.mselem_pattern_return mselem_pattern127 = null;

        babel17Parser.mselem_pattern_return mselem_pattern131 = null;

        babel17Parser.token_ARROW_return token_ARROW136 = null;


        CommonTree Id91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree String93_tree=null;
        CommonTree Num94_tree=null;
        CommonTree L_true95_tree=null;
        CommonTree L_false96_tree=null;
        CommonTree L_nil97_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree NL100_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree NL103_tree=null;
        CommonTree Num104_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree NL106_tree=null;
        CommonTree NL108_tree=null;
        CommonTree COMMA109_tree=null;
        CommonTree NL110_tree=null;
        CommonTree NL112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree NL115_tree=null;
        CommonTree NL117_tree=null;
        CommonTree COMMA118_tree=null;
        CommonTree NL119_tree=null;
        CommonTree NL121_tree=null;
        CommonTree COMMA122_tree=null;
        CommonTree NL123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree NL126_tree=null;
        CommonTree NL128_tree=null;
        CommonTree COMMA129_tree=null;
        CommonTree NL130_tree=null;
        CommonTree NL132_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree NL135_tree=null;
        CommonTree NL137_tree=null;
        CommonTree char_literal138_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:2: ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt66=14;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:440:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id91=(Token)match(input,Id,FOLLOW_Id_in_primitive_pattern2250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id91_tree = (CommonTree)adaptor.create(Id91);
                    adaptor.addChild(root_0, Id91_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:441:4: '_'
                    {
                    char_literal92=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_primitive_pattern2255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNDERSCORE.add(char_literal92);



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
                    // 441:8: -> ANY
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(ANY, "ANY"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:442:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String93=(Token)match(input,String,FOLLOW_String_in_primitive_pattern2264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String93_tree = (CommonTree)adaptor.create(String93);
                    adaptor.addChild(root_0, String93_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:443:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num94=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num94_tree = (CommonTree)adaptor.create(Num94);
                    adaptor.addChild(root_0, Num94_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:444:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true95=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_pattern2274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true95_tree = (CommonTree)adaptor.create(L_true95);
                    adaptor.addChild(root_0, L_true95_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:445:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false96=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_pattern2279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false96_tree = (CommonTree)adaptor.create(L_false96);
                    adaptor.addChild(root_0, L_false96_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:446:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil97=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_pattern2284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil97_tree = (CommonTree)adaptor.create(L_nil97);
                    adaptor.addChild(root_0, L_nil97_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:447:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2289);
                    token_infinity98=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity98.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:4: '-' ( NL )? token_infinity
                    {
                    char_literal99=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2294); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal99);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:8: ( NL )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NL) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:8: NL
                            {
                            NL100=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2296); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL100);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_infinity_in_primitive_pattern2299);
                    token_infinity101=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_infinity.add(token_infinity101.getTree());


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
                    // 448:27: -> ^( UMINUS token_infinity )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:448:30: ^( UMINUS token_infinity )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:4: '-' ( NL )? Num
                    {
                    char_literal102=(Token)match(input,MINUS,FOLLOW_MINUS_in_primitive_pattern2312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal102);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:8: ( NL )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NL) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:8: NL
                            {
                            NL103=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2314); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL103);


                            }
                            break;

                    }

                    Num104=(Token)match(input,Num,FOLLOW_Num_in_primitive_pattern2317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Num.add(Num104);



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
                    // 449:16: -> ^( UMINUS Num )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:449:19: ^( UMINUS Num )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:4: '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']'
                    {
                    char_literal105=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2330); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal105);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:9: ( NL )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==NL) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:9: NL
                            {
                            NL106=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2333); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL106);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==L_begin||(LA49_0>=L_obj && LA49_0<=L_if)||(LA49_0>=L_while && LA49_0<=L_for)||LA49_0==L_match||LA49_0==L_val||LA49_0==L_exception||LA49_0==L_try||(LA49_0>=A_infinity && LA49_0<=L_lazy)||(LA49_0>=L_true && LA49_0<=L_nil)||LA49_0==L_typeof||LA49_0==MINUS||LA49_0==A_NOT||LA49_0==U_NOT||(LA49_0>=A_ELLIPSIS && LA49_0<=U_ELLIPSIS)||LA49_0==L_force||(LA49_0>=Constr && LA49_0<=Num)||(LA49_0>=String && LA49_0<=ROUND_BRACKET_OPEN)||LA49_0==SQUARE_BRACKET_OPEN||LA49_0==CURLY_BRACKET_OPEN||LA49_0==UNDERSCORE) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2337);
                            bracket_pattern107=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern107.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:30: ( NL )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==NL) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:30: NL
                                    {
                                    NL108=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2339); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL108);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==COMMA) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA109=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2344); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA109);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:42: ( NL )?
                            	    int alt46=2;
                            	    int LA46_0 = input.LA(1);

                            	    if ( (LA46_0==NL) ) {
                            	        alt46=1;
                            	    }
                            	    switch (alt46) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:42: NL
                            	            {
                            	            NL110=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2346); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL110);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2349);
                            	    bracket_pattern111=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern111.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:62: ( NL )?
                            	    int alt47=2;
                            	    int LA47_0 = input.LA(1);

                            	    if ( (LA47_0==NL) ) {
                            	        alt47=1;
                            	    }
                            	    switch (alt47) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:450:62: NL
                            	            {
                            	            NL112=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2351); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL112);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal113=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal113);



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
                    // 451:6: -> ^( SQUARE_LIST ( bracket_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:9: ^( SQUARE_LIST ( bracket_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:451:23: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:4: '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal114=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal114);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:9: ( NL )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NL) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:9: NL
                            {
                            NL115=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2382); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL115);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:13: ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==L_begin||(LA57_0>=L_obj && LA57_0<=L_if)||(LA57_0>=L_while && LA57_0<=L_for)||LA57_0==L_match||LA57_0==L_val||LA57_0==L_exception||LA57_0==L_try||(LA57_0>=A_infinity && LA57_0<=L_lazy)||(LA57_0>=L_true && LA57_0<=L_nil)||LA57_0==L_typeof||LA57_0==MINUS||LA57_0==A_NOT||LA57_0==U_NOT||(LA57_0>=A_ELLIPSIS && LA57_0<=U_ELLIPSIS)||LA57_0==L_force||(LA57_0>=Constr && LA57_0<=Num)||(LA57_0>=String && LA57_0<=ROUND_BRACKET_OPEN)||LA57_0==SQUARE_BRACKET_OPEN||LA57_0==CURLY_BRACKET_OPEN||LA57_0==UNDERSCORE) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:14: bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2386);
                            bracket_pattern116=bracket_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern116.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:30: ( NL )?
                            int alt51=2;
                            int LA51_0 = input.LA(1);

                            if ( (LA51_0==NL) ) {
                                alt51=1;
                            }
                            switch (alt51) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:30: NL
                                    {
                                    NL117=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2388); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL117);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:34: ( COMMA ( NL )? bracket_pattern ( NL )? )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==COMMA) ) {
                                    int LA54_1 = input.LA(2);

                                    if ( (LA54_1==NL) ) {
                                        int LA54_3 = input.LA(3);

                                        if ( (LA54_3==L_begin||(LA54_3>=L_obj && LA54_3<=L_if)||(LA54_3>=L_while && LA54_3<=L_for)||LA54_3==L_match||LA54_3==L_val||LA54_3==L_exception||LA54_3==L_try||(LA54_3>=A_infinity && LA54_3<=L_lazy)||(LA54_3>=L_true && LA54_3<=L_nil)||LA54_3==L_typeof||LA54_3==MINUS||LA54_3==A_NOT||LA54_3==U_NOT||(LA54_3>=A_ELLIPSIS && LA54_3<=U_ELLIPSIS)||LA54_3==L_force||(LA54_3>=Constr && LA54_3<=Num)||(LA54_3>=String && LA54_3<=ROUND_BRACKET_OPEN)||LA54_3==SQUARE_BRACKET_OPEN||LA54_3==CURLY_BRACKET_OPEN||LA54_3==UNDERSCORE) ) {
                                            alt54=1;
                                        }


                                    }
                                    else if ( (LA54_1==L_begin||(LA54_1>=L_obj && LA54_1<=L_if)||(LA54_1>=L_while && LA54_1<=L_for)||LA54_1==L_match||LA54_1==L_val||LA54_1==L_exception||LA54_1==L_try||(LA54_1>=A_infinity && LA54_1<=L_lazy)||(LA54_1>=L_true && LA54_1<=L_nil)||LA54_1==L_typeof||LA54_1==MINUS||LA54_1==A_NOT||LA54_1==U_NOT||(LA54_1>=A_ELLIPSIS && LA54_1<=U_ELLIPSIS)||LA54_1==L_force||(LA54_1>=Constr && LA54_1<=Num)||(LA54_1>=String && LA54_1<=ROUND_BRACKET_OPEN)||LA54_1==SQUARE_BRACKET_OPEN||LA54_1==CURLY_BRACKET_OPEN||LA54_1==UNDERSCORE) ) {
                                        alt54=1;
                                    }


                                }


                                switch (alt54) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:36: COMMA ( NL )? bracket_pattern ( NL )?
                            	    {
                            	    COMMA118=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2393); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA118);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:43: ( NL )?
                            	    int alt52=2;
                            	    int LA52_0 = input.LA(1);

                            	    if ( (LA52_0==NL) ) {
                            	        alt52=1;
                            	    }
                            	    switch (alt52) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:43: NL
                            	            {
                            	            NL119=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2396); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL119);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_bracket_pattern_in_primitive_pattern2399);
                            	    bracket_pattern120=bracket_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_bracket_pattern.add(bracket_pattern120.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:63: ( NL )?
                            	    int alt53=2;
                            	    int LA53_0 = input.LA(1);

                            	    if ( (LA53_0==NL) ) {
                            	        alt53=1;
                            	    }
                            	    switch (alt53) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:63: NL
                            	            {
                            	            NL121=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2401); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL121);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:69: ( COMMA ( NL )? )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==COMMA) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:70: COMMA ( NL )?
                                    {
                                    COMMA122=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2407); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA122);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:76: ( NL )?
                                    int alt55=2;
                                    int LA55_0 = input.LA(1);

                                    if ( (LA55_0==NL) ) {
                                        alt55=1;
                                    }
                                    switch (alt55) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:452:76: NL
                                            {
                                            NL123=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2409); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL123);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal124=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal124);



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
                    // 453:5: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:8: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:21: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:33: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:41: ^( NIL_TOKEN ( bracket_pattern )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:453:53: ( bracket_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:4: '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}'
                    {
                    char_literal125=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal125);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:9: ( NL )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==NL) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:9: NL
                            {
                            NL126=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2451); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL126);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:13: ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==L_begin||(LA63_0>=L_obj && LA63_0<=L_if)||(LA63_0>=L_while && LA63_0<=L_for)||LA63_0==L_match||LA63_0==L_val||LA63_0==L_exception||LA63_0==L_try||(LA63_0>=A_infinity && LA63_0<=L_lazy)||(LA63_0>=L_true && LA63_0<=L_nil)||LA63_0==L_typeof||LA63_0==MINUS||LA63_0==A_NOT||LA63_0==U_NOT||(LA63_0>=A_ELLIPSIS && LA63_0<=U_ELLIPSIS)||LA63_0==L_force||(LA63_0>=Constr && LA63_0<=Num)||(LA63_0>=String && LA63_0<=ROUND_BRACKET_OPEN)||LA63_0==SQUARE_BRACKET_OPEN||LA63_0==CURLY_BRACKET_OPEN||LA63_0==UNDERSCORE) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:14: mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            {
                            pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2455);
                            mselem_pattern127=mselem_pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern127.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:29: ( NL )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==NL) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:29: NL
                                    {
                                    NL128=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2457); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL128);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:33: ( COMMA ( NL )? mselem_pattern ( NL )? )*
                            loop62:
                            do {
                                int alt62=2;
                                int LA62_0 = input.LA(1);

                                if ( (LA62_0==COMMA) ) {
                                    alt62=1;
                                }


                                switch (alt62) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:35: COMMA ( NL )? mselem_pattern ( NL )?
                            	    {
                            	    COMMA129=(Token)match(input,COMMA,FOLLOW_COMMA_in_primitive_pattern2462); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA129);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:42: ( NL )?
                            	    int alt60=2;
                            	    int LA60_0 = input.LA(1);

                            	    if ( (LA60_0==NL) ) {
                            	        alt60=1;
                            	    }
                            	    switch (alt60) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:42: NL
                            	            {
                            	            NL130=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2465); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL130);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_mselem_pattern_in_primitive_pattern2468);
                            	    mselem_pattern131=mselem_pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_mselem_pattern.add(mselem_pattern131.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:61: ( NL )?
                            	    int alt61=2;
                            	    int LA61_0 = input.LA(1);

                            	    if ( (LA61_0==NL) ) {
                            	        alt61=1;
                            	    }
                            	    switch (alt61) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:454:61: NL
                            	            {
                            	            NL132=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2470); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL132);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop62;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal133=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal133);



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
                    // 455:5: -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:8: ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:455:28: ( mselem_pattern )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:4: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal134=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal134);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:8: ( NL )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==NL) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:8: NL
                            {
                            NL135=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2498); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL135);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_primitive_pattern2501);
                    token_ARROW136=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW136.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:24: ( NL )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==NL) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:24: NL
                            {
                            NL137=(Token)match(input,NL,FOLLOW_NL_in_primitive_pattern2503); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL137);


                            }
                            break;

                    }

                    char_literal138=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal138);



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
                    // 456:32: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:456:35: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:1: sep : ( NL | SC )+ ;
    public final babel17Parser.sep_return sep() throws RecognitionException {
        babel17Parser.sep_return retval = new babel17Parser.sep_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set139=null;

        CommonTree set139_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:5: ( ( NL | SC )+ )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:7: ( NL | SC )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:459:7: ( NL | SC )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==SC||LA67_0==NL) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            	    {
            	    set139=(Token)input.LT(1);
            	    if ( input.LA(1)==SC||input.LA(1)==NL ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set139));
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
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );
    public final babel17Parser.block_return block() throws RecognitionException {
        babel17Parser.block_return retval = new babel17Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.sep_return sep140 = null;

        babel17Parser.statement_return statement141 = null;

        babel17Parser.sep_return sep142 = null;

        babel17Parser.statement_return statement143 = null;

        babel17Parser.sep_return sep144 = null;

        babel17Parser.sep_return sep145 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:8: ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:10: ( sep )? statement ( sep statement )* ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:10: ( sep )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==SC||LA68_0==NL) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:10: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2538);
                            sep140=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep140.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_statement_in_block2541);
                    statement141=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement141.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:25: ( sep statement )*
                    loop69:
                    do {
                        int alt69=2;
                        alt69 = dfa69.predict(input);
                        switch (alt69) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:26: sep statement
                    	    {
                    	    pushFollow(FOLLOW_sep_in_block2544);
                    	    sep142=sep();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_sep.add(sep142.getTree());
                    	    pushFollow(FOLLOW_statement_in_block2546);
                    	    statement143=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(statement143.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:42: ( sep )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==SC||LA70_0==NL) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:42: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2550);
                            sep144=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep144.getTree());

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
                    // 461:47: -> ^( BLOCK ( statement )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:50: ^( BLOCK ( statement )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:461:58: ( statement )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: ( sep )?
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: ( sep )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==SC||LA71_0==NL) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:4: sep
                            {
                            pushFollow(FOLLOW_sep_in_block2566);
                            sep145=sep();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sep.add(sep145.getTree());

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
                    // 462:9: -> ^( BLOCK )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:462:12: ^( BLOCK )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:464:1: pure_block : statement ( sep statement )* -> ^( BLOCK ( statement )* ) ;
    public final babel17Parser.pure_block_return pure_block() throws RecognitionException {
        babel17Parser.pure_block_return retval = new babel17Parser.pure_block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.statement_return statement146 = null;

        babel17Parser.sep_return sep147 = null;

        babel17Parser.statement_return statement148 = null;


        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_sep=new RewriteRuleSubtreeStream(adaptor,"rule sep");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:2: ( statement ( sep statement )* -> ^( BLOCK ( statement )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:4: statement ( sep statement )*
            {
            pushFollow(FOLLOW_statement_in_pure_block2583);
            statement146=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement146.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:14: ( sep statement )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==NL) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==L_begin||(LA73_1>=L_obj && LA73_1<=L_if)||(LA73_1>=L_while && LA73_1<=L_for)||(LA73_1>=L_yield && LA73_1<=L_match)||(LA73_1>=L_val && LA73_1<=L_def)||LA73_1==L_exception||LA73_1==L_try||(LA73_1>=A_infinity && LA73_1<=L_nil)||(LA73_1>=L_module && LA73_1<=L_import)||LA73_1==SC||LA73_1==MINUS||LA73_1==A_NOT||LA73_1==U_NOT||(LA73_1>=A_ELLIPSIS && LA73_1<=U_ELLIPSIS)||LA73_1==L_force||(LA73_1>=NL && LA73_1<=Num)||(LA73_1>=String && LA73_1<=ROUND_BRACKET_OPEN)||LA73_1==SQUARE_BRACKET_OPEN||LA73_1==CURLY_BRACKET_OPEN||LA73_1==UNDERSCORE||(LA73_1>=PRAGMA_LOG && LA73_1<=PRAGMA_PROFILE)) ) {
                        alt73=1;
                    }


                }
                else if ( (LA73_0==SC) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:15: sep statement
            	    {
            	    pushFollow(FOLLOW_sep_in_pure_block2586);
            	    sep147=sep();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_sep.add(sep147.getTree());
            	    pushFollow(FOLLOW_statement_in_pure_block2588);
            	    statement148=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement148.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
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
            // 465:31: -> ^( BLOCK ( statement )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:34: ^( BLOCK ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:465:42: ( statement )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:467:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );
    public final babel17Parser.statement_return statement() throws RecognitionException {
        babel17Parser.statement_return retval = new babel17Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PRAGMA_PRINT158=null;
        Token PRAGMA_LOG160=null;
        Token PRAGMA_PROFILE162=null;
        Token PRAGMA_ASSERT164=null;
        babel17Parser.st_typedef_return st_typedef149 = null;

        babel17Parser.st_val_return st_val150 = null;

        babel17Parser.st_def_return st_def151 = null;

        babel17Parser.st_yield_return st_yield152 = null;

        babel17Parser.st_memoize_return st_memoize153 = null;

        babel17Parser.st_private_return st_private154 = null;

        babel17Parser.st_module_return st_module155 = null;

        babel17Parser.st_import_return st_import156 = null;

        babel17Parser.expr_or_assign_return expr_or_assign157 = null;

        babel17Parser.expr_return expr159 = null;

        babel17Parser.expr_return expr161 = null;

        babel17Parser.expr_return expr163 = null;

        babel17Parser.expr_return expr165 = null;


        CommonTree PRAGMA_PRINT158_tree=null;
        CommonTree PRAGMA_LOG160_tree=null;
        CommonTree PRAGMA_PROFILE162_tree=null;
        CommonTree PRAGMA_ASSERT164_tree=null;
        RewriteRuleTokenStream stream_PRAGMA_PROFILE=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PROFILE");
        RewriteRuleTokenStream stream_PRAGMA_ASSERT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_ASSERT");
        RewriteRuleTokenStream stream_PRAGMA_LOG=new RewriteRuleTokenStream(adaptor,"token PRAGMA_LOG");
        RewriteRuleTokenStream stream_PRAGMA_PRINT=new RewriteRuleTokenStream(adaptor,"token PRAGMA_PRINT");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:2: ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) )
            int alt74=13;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:468:4: st_typedef
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_typedef_in_statement2609);
                    st_typedef149=st_typedef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_typedef149.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:469:10: st_val
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_val_in_statement2620);
                    st_val150=st_val();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_val150.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:470:4: st_def
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_def_in_statement2625);
                    st_def151=st_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_def151.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:471:4: st_yield
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_yield_in_statement2630);
                    st_yield152=st_yield();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_yield152.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:472:4: st_memoize
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_memoize_in_statement2635);
                    st_memoize153=st_memoize();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_memoize153.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:473:4: st_private
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_private_in_statement2640);
                    st_private154=st_private();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_private154.getTree());

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:474:4: st_module
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_module_in_statement2645);
                    st_module155=st_module();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_module155.getTree());

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:475:4: st_import
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_st_import_in_statement2650);
                    st_import156=st_import();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, st_import156.getTree());

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:476:4: expr_or_assign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_or_assign_in_statement2655);
                    expr_or_assign157=expr_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign157.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:5: PRAGMA_PRINT expr
                    {
                    PRAGMA_PRINT158=(Token)match(input,PRAGMA_PRINT,FOLLOW_PRAGMA_PRINT_in_statement2661); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PRINT.add(PRAGMA_PRINT158);

                    pushFollow(FOLLOW_expr_in_statement2663);
                    expr159=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr159.getTree());


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
                    // 477:23: -> ^( PRAGMA_PRINT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:477:26: ^( PRAGMA_PRINT expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:5: PRAGMA_LOG expr
                    {
                    PRAGMA_LOG160=(Token)match(input,PRAGMA_LOG,FOLLOW_PRAGMA_LOG_in_statement2677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_LOG.add(PRAGMA_LOG160);

                    pushFollow(FOLLOW_expr_in_statement2679);
                    expr161=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr161.getTree());


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
                    // 478:21: -> ^( PRAGMA_LOG expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:478:24: ^( PRAGMA_LOG expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:5: PRAGMA_PROFILE expr
                    {
                    PRAGMA_PROFILE162=(Token)match(input,PRAGMA_PROFILE,FOLLOW_PRAGMA_PROFILE_in_statement2693); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_PROFILE.add(PRAGMA_PROFILE162);

                    pushFollow(FOLLOW_expr_in_statement2695);
                    expr163=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr163.getTree());


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
                    // 479:25: -> ^( PRAGMA_PROFILE expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:479:28: ^( PRAGMA_PROFILE expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:5: PRAGMA_ASSERT expr
                    {
                    PRAGMA_ASSERT164=(Token)match(input,PRAGMA_ASSERT,FOLLOW_PRAGMA_ASSERT_in_statement2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRAGMA_ASSERT.add(PRAGMA_ASSERT164);

                    pushFollow(FOLLOW_expr_in_statement2711);
                    expr165=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr165.getTree());


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
                    // 480:24: -> ^( PRAGMA_ASSERT expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:480:27: ^( PRAGMA_ASSERT expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:482:1: objelem_assign : Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) ;
    public final babel17Parser.objelem_assign_return objelem_assign() throws RecognitionException {
        babel17Parser.objelem_assign_return retval = new babel17Parser.objelem_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id166=null;
        Token PERIOD167=null;
        Token Id168=null;

        CommonTree Id166_tree=null;
        CommonTree PERIOD167_tree=null;
        CommonTree Id168_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:2: ( Id PERIOD Id -> ^( OBJELEM_ASSIGN Id Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:4: Id PERIOD Id
            {
            Id166=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id166);

            PERIOD167=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_objelem_assign2731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD167);

            Id168=(Token)match(input,Id,FOLLOW_Id_in_objelem_assign2733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id168);



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
            // 483:17: -> ^( OBJELEM_ASSIGN Id Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:483:20: ^( OBJELEM_ASSIGN Id Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:1: st_val : L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) ;
    public final babel17Parser.st_val_return st_val() throws RecognitionException {
        babel17Parser.st_val_return retval = new babel17Parser.st_val_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_val169=null;
        Token NL170=null;
        Token NL173=null;
        Token char_literal174=null;
        Token NL175=null;
        babel17Parser.pattern_return pattern171 = null;

        babel17Parser.objelem_assign_return objelem_assign172 = null;

        babel17Parser.expr_return expr176 = null;


        CommonTree L_val169_tree=null;
        CommonTree NL170_tree=null;
        CommonTree NL173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree NL175_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_val=new RewriteRuleTokenStream(adaptor,"token L_val");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:8: ( L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( VAL ( pattern )* ( objelem_assign )* expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:10: L_val ( NL )? ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
            {
            L_val169=(Token)match(input,L_val,FOLLOW_L_val_in_st_val2752); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_val.add(L_val169);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:16: ( NL )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==NL) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:16: NL
                    {
                    NL170=(Token)match(input,NL,FOLLOW_NL_in_st_val2754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL170);


                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:20: ( pattern | objelem_assign )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==L_exception||(LA76_0>=A_infinity && LA76_0<=U_infinity)||(LA76_0>=L_true && LA76_0<=L_false)||LA76_0==L_nil||LA76_0==MINUS||(LA76_0>=A_ELLIPSIS && LA76_0<=U_ELLIPSIS)||LA76_0==Constr||LA76_0==Num||(LA76_0>=String && LA76_0<=ROUND_BRACKET_OPEN)||LA76_0==SQUARE_BRACKET_OPEN||LA76_0==CURLY_BRACKET_OPEN||LA76_0==UNDERSCORE) ) {
                alt76=1;
            }
            else if ( (LA76_0==Id) ) {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==PERIOD) ) {
                    alt76=2;
                }
                else if ( (LA76_2==ASSIGN||(LA76_2>=A_DOUBLE_COLON && LA76_2<=U_DOUBLE_COLON)||LA76_2==NL) ) {
                    alt76=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:21: pattern
                    {
                    pushFollow(FOLLOW_pattern_in_st_val2758);
                    pattern171=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern171.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:31: objelem_assign
                    {
                    pushFollow(FOLLOW_objelem_assign_in_st_val2762);
                    objelem_assign172=objelem_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign172.getTree());

                    }
                    break;

            }

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:47: ( NL )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==NL) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:47: NL
                    {
                    NL173=(Token)match(input,NL,FOLLOW_NL_in_st_val2765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL173);


                    }
                    break;

            }

            char_literal174=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_val2768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal174);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:55: ( NL )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==NL) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:55: NL
                    {
                    NL175=(Token)match(input,NL,FOLLOW_NL_in_st_val2770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL175);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_in_st_val2773);
            expr176=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr176.getTree());


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
            // 485:64: -> ^( VAL ( pattern )* ( objelem_assign )* expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:67: ^( VAL ( pattern )* ( objelem_assign )* expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:73: ( pattern )*
                while ( stream_pattern.hasNext() ) {
                    adaptor.addChild(root_1, stream_pattern.nextTree());

                }
                stream_pattern.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:485:82: ( objelem_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:1: st_def : ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) );
    public final babel17Parser.st_def_return st_def() throws RecognitionException {
        babel17Parser.st_def_return retval = new babel17Parser.st_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_def177=null;
        Token NL178=null;
        Token Id179=null;
        Token NL180=null;
        Token NL182=null;
        Token char_literal183=null;
        Token NL184=null;
        Token NL186=null;
        Token char_literal187=null;
        Token NL188=null;
        Token L_def190=null;
        Token NL191=null;
        Token L_this192=null;
        Token NL193=null;
        Token char_literal194=null;
        Token NL195=null;
        Token NL197=null;
        Token char_literal198=null;
        Token NL199=null;
        babel17Parser.defpattern_return defpattern181 = null;

        babel17Parser.typeid_return typeid185 = null;

        babel17Parser.expr_return expr189 = null;

        babel17Parser.typeid_return typeid196 = null;

        babel17Parser.expr_return expr200 = null;


        CommonTree L_def177_tree=null;
        CommonTree NL178_tree=null;
        CommonTree Id179_tree=null;
        CommonTree NL180_tree=null;
        CommonTree NL182_tree=null;
        CommonTree char_literal183_tree=null;
        CommonTree NL184_tree=null;
        CommonTree NL186_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree NL188_tree=null;
        CommonTree L_def190_tree=null;
        CommonTree NL191_tree=null;
        CommonTree L_this192_tree=null;
        CommonTree NL193_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree NL195_tree=null;
        CommonTree NL197_tree=null;
        CommonTree char_literal198_tree=null;
        CommonTree NL199_tree=null;
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
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:8: ( L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr -> ^( DEF Id ( typeid )? ( defpattern )? expr ) | L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr -> ^( CONVERSION typeid expr ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==L_def) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA92_2 = input.LA(3);

                    if ( (LA92_2==Id) ) {
                        alt92=1;
                    }
                    else if ( (LA92_2==L_this) ) {
                        alt92=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case L_this:
                    {
                    alt92=2;
                    }
                    break;
                case Id:
                    {
                    alt92=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:10: L_def ( NL )? Id ( NL )? ( defpattern ( NL )? )? ( ':' ( NL )? typeid ( NL )? )? '=' ( NL )? expr
                    {
                    L_def177=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def177);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:16: ( NL )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==NL) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:16: NL
                            {
                            NL178=(Token)match(input,NL,FOLLOW_NL_in_st_def2799); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL178);


                            }
                            break;

                    }

                    Id179=(Token)match(input,Id,FOLLOW_Id_in_st_def2802); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id179);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:23: ( NL )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==NL) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:23: NL
                            {
                            NL180=(Token)match(input,NL,FOLLOW_NL_in_st_def2804); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL180);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:27: ( defpattern ( NL )? )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=A_infinity && LA82_0<=U_infinity)||(LA82_0>=L_true && LA82_0<=L_false)||LA82_0==L_nil||LA82_0==MINUS||(LA82_0>=Constr && LA82_0<=Num)||(LA82_0>=String && LA82_0<=ROUND_BRACKET_OPEN)||LA82_0==SQUARE_BRACKET_OPEN||LA82_0==CURLY_BRACKET_OPEN||LA82_0==UNDERSCORE) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:28: defpattern ( NL )?
                            {
                            pushFollow(FOLLOW_defpattern_in_st_def2808);
                            defpattern181=defpattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defpattern.add(defpattern181.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:39: ( NL )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==NL) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:39: NL
                                    {
                                    NL182=(Token)match(input,NL,FOLLOW_NL_in_st_def2810); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL182);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:45: ( ':' ( NL )? typeid ( NL )? )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==COLON) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:46: ':' ( NL )? typeid ( NL )?
                            {
                            char_literal183=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2816); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON.add(char_literal183);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:50: ( NL )?
                            int alt83=2;
                            int LA83_0 = input.LA(1);

                            if ( (LA83_0==NL) ) {
                                alt83=1;
                            }
                            switch (alt83) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:50: NL
                                    {
                                    NL184=(Token)match(input,NL,FOLLOW_NL_in_st_def2818); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL184);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_typeid_in_st_def2821);
                            typeid185=typeid();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeid.add(typeid185.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:61: ( NL )?
                            int alt84=2;
                            int LA84_0 = input.LA(1);

                            if ( (LA84_0==NL) ) {
                                alt84=1;
                            }
                            switch (alt84) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:61: NL
                                    {
                                    NL186=(Token)match(input,NL,FOLLOW_NL_in_st_def2823); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL186);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal187=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal187);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:71: ( NL )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==NL) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:487:71: NL
                            {
                            NL188=(Token)match(input,NL,FOLLOW_NL_in_st_def2830); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL188);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2833);
                    expr189=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr189.getTree());


                    // AST REWRITE
                    // elements: defpattern, typeid, expr, Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 488:5: -> ^( DEF Id ( typeid )? ( defpattern )? expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:8: ^( DEF Id ( typeid )? ( defpattern )? expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DEF, "DEF"), root_1);

                        adaptor.addChild(root_1, stream_Id.nextNode());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:17: ( typeid )?
                        if ( stream_typeid.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeid.nextTree());

                        }
                        stream_typeid.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:488:25: ( defpattern )?
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:4: L_def ( NL )? L_this ( NL )? ':' ( NL )? typeid ( NL )? '=' ( NL )? expr
                    {
                    L_def190=(Token)match(input,L_def,FOLLOW_L_def_in_st_def2859); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_def.add(L_def190);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:10: ( NL )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==NL) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:10: NL
                            {
                            NL191=(Token)match(input,NL,FOLLOW_NL_in_st_def2861); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL191);


                            }
                            break;

                    }

                    L_this192=(Token)match(input,L_this,FOLLOW_L_this_in_st_def2864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_this.add(L_this192);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:21: ( NL )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==NL) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:21: NL
                            {
                            NL193=(Token)match(input,NL,FOLLOW_NL_in_st_def2866); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL193);


                            }
                            break;

                    }

                    char_literal194=(Token)match(input,COLON,FOLLOW_COLON_in_st_def2869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal194);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:29: ( NL )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==NL) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:29: NL
                            {
                            NL195=(Token)match(input,NL,FOLLOW_NL_in_st_def2871); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL195);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_typeid_in_st_def2874);
                    typeid196=typeid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeid.add(typeid196.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:40: ( NL )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==NL) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:40: NL
                            {
                            NL197=(Token)match(input,NL,FOLLOW_NL_in_st_def2876); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL197);


                            }
                            break;

                    }

                    char_literal198=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_st_def2879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal198);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:48: ( NL )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==NL) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:48: NL
                            {
                            NL199=(Token)match(input,NL,FOLLOW_NL_in_st_def2881); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL199);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_st_def2884);
                    expr200=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr200.getTree());


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
                    // 489:57: -> ^( CONVERSION typeid expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:489:60: ^( CONVERSION typeid expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:491:1: st_typedef : L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) ;
    public final babel17Parser.st_typedef_return st_typedef() throws RecognitionException {
        babel17Parser.st_typedef_return retval = new babel17Parser.st_typedef_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_typedef201=null;
        Token NL202=null;
        Token Id203=null;
        Token NL204=null;
        Token NL206=null;
        Token COMMA207=null;
        Token NL208=null;
        babel17Parser.typedef_clause_return typedef_clause205 = null;

        babel17Parser.typedef_clause_return typedef_clause209 = null;


        CommonTree L_typedef201_tree=null;
        CommonTree NL202_tree=null;
        CommonTree Id203_tree=null;
        CommonTree NL204_tree=null;
        CommonTree NL206_tree=null;
        CommonTree COMMA207_tree=null;
        CommonTree NL208_tree=null;
        RewriteRuleTokenStream stream_L_typedef=new RewriteRuleTokenStream(adaptor,"token L_typedef");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_typedef_clause=new RewriteRuleSubtreeStream(adaptor,"rule typedef_clause");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:2: ( L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )* -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:4: L_typedef ( NL )? Id ( NL )? typedef_clause ( ( NL )? COMMA ( NL )? typedef_clause )*
            {
            L_typedef201=(Token)match(input,L_typedef,FOLLOW_L_typedef_in_st_typedef2907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_typedef.add(L_typedef201);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:14: ( NL )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==NL) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:14: NL
                    {
                    NL202=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL202);


                    }
                    break;

            }

            Id203=(Token)match(input,Id,FOLLOW_Id_in_st_typedef2912); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id203);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:21: ( NL )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==NL) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:21: NL
                    {
                    NL204=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL204);


                    }
                    break;

            }

            pushFollow(FOLLOW_typedef_clause_in_st_typedef2917);
            typedef_clause205=typedef_clause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause205.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:40: ( ( NL )? COMMA ( NL )? typedef_clause )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==NL) ) {
                    int LA97_1 = input.LA(2);

                    if ( (LA97_1==COMMA) ) {
                        alt97=1;
                    }


                }
                else if ( (LA97_0==COMMA) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:41: ( NL )? COMMA ( NL )? typedef_clause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:41: ( NL )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==NL) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:41: NL
            	            {
            	            NL206=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2920); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL206);


            	            }
            	            break;

            	    }

            	    COMMA207=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_typedef2923); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA207);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:51: ( NL )?
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==NL) ) {
            	        alt96=1;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:51: NL
            	            {
            	            NL208=(Token)match(input,NL,FOLLOW_NL_in_st_typedef2925); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL208);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_typedef_clause_in_st_typedef2928);
            	    typedef_clause209=typedef_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_typedef_clause.add(typedef_clause209.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
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
            // 492:72: -> ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:75: ^( TYPEDEF Id ^( NIL_TOKEN ( typedef_clause )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPEDEF, "TYPEDEF"), root_1);

                adaptor.addChild(root_1, stream_Id.nextNode());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:88: ^( NIL_TOKEN ( typedef_clause )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:492:100: ( typedef_clause )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:494:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );
    public final babel17Parser.typedef_clause_return typedef_clause() throws RecognitionException {
        babel17Parser.typedef_clause_return retval = new babel17Parser.typedef_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL211=null;
        Token char_literal212=null;
        Token NL213=null;
        babel17Parser.defpattern_return defpattern210 = null;

        babel17Parser.expr_return expr214 = null;

        babel17Parser.defpattern_return defpattern215 = null;


        CommonTree NL211_tree=null;
        CommonTree char_literal212_tree=null;
        CommonTree NL213_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_defpattern=new RewriteRuleSubtreeStream(adaptor,"rule defpattern");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:2: ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) )
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2966);
                    defpattern210=defpattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defpattern.add(defpattern210.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:39: ( NL )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==NL) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:39: NL
                            {
                            NL211=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2968); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL211);


                            }
                            break;

                    }

                    char_literal212=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_typedef_clause2971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal212);

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
                            NL213=(Token)match(input,NL,FOLLOW_NL_in_typedef_clause2973); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL213);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_typedef_clause2976);
                    expr214=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr214.getTree());


                    // AST REWRITE
                    // elements: expr, defpattern
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 495:56: -> ^( TYPEDEF_CLAUSE defpattern expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:59: ^( TYPEDEF_CLAUSE defpattern expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:4: defpattern
                    {
                    pushFollow(FOLLOW_defpattern_in_typedef_clause2991);
                    defpattern215=defpattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_defpattern.add(defpattern215.getTree());


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
                    // 496:15: -> ^( TYPEDEF_CLAUSE defpattern )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:496:18: ^( TYPEDEF_CLAUSE defpattern )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:1: st_yield : L_yield expr -> ^( YIELD expr ) ;
    public final babel17Parser.st_yield_return st_yield() throws RecognitionException {
        babel17Parser.st_yield_return retval = new babel17Parser.st_yield_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_yield216=null;
        babel17Parser.expr_return expr217 = null;


        CommonTree L_yield216_tree=null;
        RewriteRuleTokenStream stream_L_yield=new RewriteRuleTokenStream(adaptor,"token L_yield");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:9: ( L_yield expr -> ^( YIELD expr ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:11: L_yield expr
            {
            L_yield216=(Token)match(input,L_yield,FOLLOW_L_yield_in_st_yield3010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_yield.add(L_yield216);

            pushFollow(FOLLOW_expr_in_st_yield3012);
            expr217=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr217.getTree());


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
            // 498:24: -> ^( YIELD expr )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:498:27: ^( YIELD expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:500:1: st_memoize : L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) ;
    public final babel17Parser.st_memoize_return st_memoize() throws RecognitionException {
        babel17Parser.st_memoize_return retval = new babel17Parser.st_memoize_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_memoize218=null;
        Token NL220=null;
        Token COMMA221=null;
        Token NL222=null;
        babel17Parser.memo_id_return memo_id219 = null;

        babel17Parser.memo_id_return memo_id223 = null;


        CommonTree L_memoize218_tree=null;
        CommonTree NL220_tree=null;
        CommonTree COMMA221_tree=null;
        CommonTree NL222_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_memoize=new RewriteRuleTokenStream(adaptor,"token L_memoize");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_memo_id=new RewriteRuleSubtreeStream(adaptor,"rule memo_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:2: ( L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )* -> ^( MEMOIZE ( memo_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:4: L_memoize memo_id ( ( NL )? COMMA ( NL )? memo_id )*
            {
            L_memoize218=(Token)match(input,L_memoize,FOLLOW_L_memoize_in_st_memoize3033); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_memoize.add(L_memoize218);

            pushFollow(FOLLOW_memo_id_in_st_memoize3035);
            memo_id219=memo_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_memo_id.add(memo_id219.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:22: ( ( NL )? COMMA ( NL )? memo_id )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==NL) ) {
                    int LA103_1 = input.LA(2);

                    if ( (LA103_1==COMMA) ) {
                        alt103=1;
                    }


                }
                else if ( (LA103_0==COMMA) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:23: ( NL )? COMMA ( NL )? memo_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:23: ( NL )?
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==NL) ) {
            	        alt101=1;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:23: NL
            	            {
            	            NL220=(Token)match(input,NL,FOLLOW_NL_in_st_memoize3038); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL220);


            	            }
            	            break;

            	    }

            	    COMMA221=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_memoize3041); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA221);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:33: ( NL )?
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==NL) ) {
            	        alt102=1;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:501:33: NL
            	            {
            	            NL222=(Token)match(input,NL,FOLLOW_NL_in_st_memoize3043); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL222);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_memo_id_in_st_memoize3046);
            	    memo_id223=memo_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_memo_id.add(memo_id223.getTree());

            	    }
            	    break;

            	default :
            	    break loop103;
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
            // 502:5: -> ^( MEMOIZE ( memo_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:8: ^( MEMOIZE ( memo_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MEMOIZE, "MEMOIZE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:502:18: ( memo_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:1: memo_id : ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) );
    public final babel17Parser.memo_id_return memo_id() throws RecognitionException {
        babel17Parser.memo_id_return retval = new babel17Parser.memo_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id224=null;
        Token char_literal225=null;
        Token Id226=null;
        Token char_literal227=null;

        CommonTree Id224_tree=null;
        CommonTree char_literal225_tree=null;
        CommonTree Id226_tree=null;
        CommonTree char_literal227_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:9: ( Id -> ^( MEMOID_STRONG Id ) | '(' Id ')' -> ^( MEMOID_WEAK Id ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==Id) ) {
                alt104=1;
            }
            else if ( (LA104_0==ROUND_BRACKET_OPEN) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:11: Id
                    {
                    Id224=(Token)match(input,Id,FOLLOW_Id_in_memo_id3075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id224);



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
                    // 504:14: -> ^( MEMOID_STRONG Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:504:17: ^( MEMOID_STRONG Id )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:4: '(' Id ')'
                    {
                    char_literal225=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3088); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal225);

                    Id226=(Token)match(input,Id,FOLLOW_Id_in_memo_id3090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Id.add(Id226);

                    char_literal227=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3092); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal227);



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
                    // 505:15: -> ^( MEMOID_WEAK Id )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:505:18: ^( MEMOID_WEAK Id )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:507:1: st_private : L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) ;
    public final babel17Parser.st_private_return st_private() throws RecognitionException {
        babel17Parser.st_private_return retval = new babel17Parser.st_private_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_private228=null;
        Token NL230=null;
        Token COMMA231=null;
        Token NL232=null;
        babel17Parser.private_id_return private_id229 = null;

        babel17Parser.private_id_return private_id233 = null;


        CommonTree L_private228_tree=null;
        CommonTree NL230_tree=null;
        CommonTree COMMA231_tree=null;
        CommonTree NL232_tree=null;
        RewriteRuleTokenStream stream_L_private=new RewriteRuleTokenStream(adaptor,"token L_private");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_private_id=new RewriteRuleSubtreeStream(adaptor,"rule private_id");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:2: ( L_private private_id ( ( NL )? COMMA ( NL )? private_id )* -> ^( PRIVATE ( private_id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:4: L_private private_id ( ( NL )? COMMA ( NL )? private_id )*
            {
            L_private228=(Token)match(input,L_private,FOLLOW_L_private_in_st_private3109); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_private.add(L_private228);

            pushFollow(FOLLOW_private_id_in_st_private3111);
            private_id229=private_id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_private_id.add(private_id229.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:25: ( ( NL )? COMMA ( NL )? private_id )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==NL) ) {
                    int LA107_1 = input.LA(2);

                    if ( (LA107_1==COMMA) ) {
                        alt107=1;
                    }


                }
                else if ( (LA107_0==COMMA) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:26: ( NL )? COMMA ( NL )? private_id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:26: ( NL )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==NL) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:26: NL
            	            {
            	            NL230=(Token)match(input,NL,FOLLOW_NL_in_st_private3114); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL230);


            	            }
            	            break;

            	    }

            	    COMMA231=(Token)match(input,COMMA,FOLLOW_COMMA_in_st_private3117); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA231);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:36: ( NL )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==NL) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:508:36: NL
            	            {
            	            NL232=(Token)match(input,NL,FOLLOW_NL_in_st_private3119); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL232);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_private_id_in_st_private3122);
            	    private_id233=private_id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_private_id.add(private_id233.getTree());

            	    }
            	    break;

            	default :
            	    break loop107;
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
            // 509:5: -> ^( PRIVATE ( private_id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:8: ^( PRIVATE ( private_id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATE, "PRIVATE"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:509:18: ( private_id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:511:1: private_id : Id -> ^( PRIVATEID Id ) ;
    public final babel17Parser.private_id_return private_id() throws RecognitionException {
        babel17Parser.private_id_return retval = new babel17Parser.private_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Id234=null;

        CommonTree Id234_tree=null;
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:2: ( Id -> ^( PRIVATEID Id ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:4: Id
            {
            Id234=(Token)match(input,Id,FOLLOW_Id_in_private_id3148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Id.add(Id234);



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
            // 512:7: -> ^( PRIVATEID Id )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:512:10: ^( PRIVATEID Id )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PRIVATEID, "PRIVATEID"), root_1);

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
    // $ANTLR end "private_id"

    public static class testid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:1: testid : ( Id | L_unittest );
    public final babel17Parser.testid_return testid() throws RecognitionException {
        babel17Parser.testid_return retval = new babel17Parser.testid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set235=null;

        CommonTree set235_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:514:8: ( Id | L_unittest )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set235=(Token)input.LT(1);
            if ( input.LA(1)==L_unittest||input.LA(1)==Id ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set235));
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
    // $ANTLR end "testid"

    public static class moduleid_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleid"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:517:1: moduleid : testid ( ( NL )? PERIOD ( NL )? testid )* -> ^( MODULEID ( testid )* ) ;
    public final babel17Parser.moduleid_return moduleid() throws RecognitionException {
        babel17Parser.moduleid_return retval = new babel17Parser.moduleid_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL237=null;
        Token PERIOD238=null;
        Token NL239=null;
        babel17Parser.testid_return testid236 = null;

        babel17Parser.testid_return testid240 = null;


        CommonTree NL237_tree=null;
        CommonTree PERIOD238_tree=null;
        CommonTree NL239_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_testid=new RewriteRuleSubtreeStream(adaptor,"rule testid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:2: ( testid ( ( NL )? PERIOD ( NL )? testid )* -> ^( MODULEID ( testid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:4: testid ( ( NL )? PERIOD ( NL )? testid )*
            {
            pushFollow(FOLLOW_testid_in_moduleid3181);
            testid236=testid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_testid.add(testid236.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:11: ( ( NL )? PERIOD ( NL )? testid )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==NL) ) {
                    int LA110_1 = input.LA(2);

                    if ( (LA110_1==PERIOD) ) {
                        alt110=1;
                    }


                }
                else if ( (LA110_0==PERIOD) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:12: ( NL )? PERIOD ( NL )? testid
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:12: ( NL )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==NL) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:12: NL
            	            {
            	            NL237=(Token)match(input,NL,FOLLOW_NL_in_moduleid3184); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL237);


            	            }
            	            break;

            	    }

            	    PERIOD238=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_moduleid3187); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD238);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:23: ( NL )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==NL) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:23: NL
            	            {
            	            NL239=(Token)match(input,NL,FOLLOW_NL_in_moduleid3189); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL239);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_testid_in_moduleid3192);
            	    testid240=testid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_testid.add(testid240.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);



            // AST REWRITE
            // elements: testid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 518:36: -> ^( MODULEID ( testid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:39: ^( MODULEID ( testid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULEID, "MODULEID"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:518:50: ( testid )*
                while ( stream_testid.hasNext() ) {
                    adaptor.addChild(root_1, stream_testid.nextTree());

                }
                stream_testid.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:520:1: st_module : L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) ;
    public final babel17Parser.st_module_return st_module() throws RecognitionException {
        babel17Parser.st_module_return retval = new babel17Parser.st_module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_module241=null;
        Token NL242=null;
        Token L_end245=null;
        babel17Parser.moduleid_return moduleid243 = null;

        babel17Parser.block_return block244 = null;


        CommonTree L_module241_tree=null;
        CommonTree NL242_tree=null;
        CommonTree L_end245_tree=null;
        RewriteRuleTokenStream stream_L_module=new RewriteRuleTokenStream(adaptor,"token L_module");
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_moduleid=new RewriteRuleSubtreeStream(adaptor,"rule moduleid");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:2: ( L_module ( NL )? moduleid block L_end -> ^( L_module moduleid block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:4: L_module ( NL )? moduleid block L_end
            {
            L_module241=(Token)match(input,L_module,FOLLOW_L_module_in_st_module3212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_module.add(L_module241);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:13: ( NL )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==NL) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:13: NL
                    {
                    NL242=(Token)match(input,NL,FOLLOW_NL_in_st_module3214); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL242);


                    }
                    break;

            }

            pushFollow(FOLLOW_moduleid_in_st_module3217);
            moduleid243=moduleid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleid.add(moduleid243.getTree());
            pushFollow(FOLLOW_block_in_st_module3219);
            block244=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block244.getTree());
            L_end245=(Token)match(input,L_end,FOLLOW_L_end_in_st_module3221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end245);



            // AST REWRITE
            // elements: L_module, block, moduleid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 521:38: -> ^( L_module moduleid block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:521:41: ^( L_module moduleid block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:523:1: importprefix : testid ( ( NL )? PERIOD ( NL )? testid )* -> ^( IMPORT_PREFIX ( testid )* ) ;
    public final babel17Parser.importprefix_return importprefix() throws RecognitionException {
        babel17Parser.importprefix_return retval = new babel17Parser.importprefix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL247=null;
        Token PERIOD248=null;
        Token NL249=null;
        babel17Parser.testid_return testid246 = null;

        babel17Parser.testid_return testid250 = null;


        CommonTree NL247_tree=null;
        CommonTree PERIOD248_tree=null;
        CommonTree NL249_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_testid=new RewriteRuleSubtreeStream(adaptor,"rule testid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:2: ( testid ( ( NL )? PERIOD ( NL )? testid )* -> ^( IMPORT_PREFIX ( testid )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:4: testid ( ( NL )? PERIOD ( NL )? testid )*
            {
            pushFollow(FOLLOW_testid_in_importprefix3241);
            testid246=testid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_testid.add(testid246.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:11: ( ( NL )? PERIOD ( NL )? testid )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==NL) ) {
                    int LA114_1 = input.LA(2);

                    if ( (LA114_1==PERIOD) ) {
                        int LA114_2 = input.LA(3);

                        if ( (LA114_2==NL) ) {
                            int LA114_4 = input.LA(4);

                            if ( (LA114_4==L_unittest||LA114_4==Id) ) {
                                alt114=1;
                            }


                        }
                        else if ( (LA114_2==L_unittest||LA114_2==Id) ) {
                            alt114=1;
                        }


                    }


                }
                else if ( (LA114_0==PERIOD) ) {
                    int LA114_2 = input.LA(2);

                    if ( (LA114_2==NL) ) {
                        int LA114_4 = input.LA(3);

                        if ( (LA114_4==L_unittest||LA114_4==Id) ) {
                            alt114=1;
                        }


                    }
                    else if ( (LA114_2==L_unittest||LA114_2==Id) ) {
                        alt114=1;
                    }


                }


                switch (alt114) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:12: ( NL )? PERIOD ( NL )? testid
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:12: ( NL )?
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==NL) ) {
            	        alt112=1;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:12: NL
            	            {
            	            NL247=(Token)match(input,NL,FOLLOW_NL_in_importprefix3244); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL247);


            	            }
            	            break;

            	    }

            	    PERIOD248=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_importprefix3247); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD248);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:23: ( NL )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==NL) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:23: NL
            	            {
            	            NL249=(Token)match(input,NL,FOLLOW_NL_in_importprefix3249); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL249);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_testid_in_importprefix3252);
            	    testid250=testid();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_testid.add(testid250.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);



            // AST REWRITE
            // elements: testid
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 524:36: -> ^( IMPORT_PREFIX ( testid )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:39: ^( IMPORT_PREFIX ( testid )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_PREFIX, "IMPORT_PREFIX"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:524:55: ( testid )*
                while ( stream_testid.hasNext() ) {
                    adaptor.addChild(root_1, stream_testid.nextTree());

                }
                stream_testid.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:526:1: importall : UNDERSCORE -> ^( IMPORT_ALL ) ;
    public final babel17Parser.importall_return importall() throws RecognitionException {
        babel17Parser.importall_return retval = new babel17Parser.importall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNDERSCORE251=null;

        CommonTree UNDERSCORE251_tree=null;
        RewriteRuleTokenStream stream_UNDERSCORE=new RewriteRuleTokenStream(adaptor,"token UNDERSCORE");

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:2: ( UNDERSCORE -> ^( IMPORT_ALL ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:4: UNDERSCORE
            {
            UNDERSCORE251=(Token)match(input,UNDERSCORE,FOLLOW_UNDERSCORE_in_importall3274); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNDERSCORE.add(UNDERSCORE251);



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
            // 527:15: -> ^( IMPORT_ALL )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:527:18: ^( IMPORT_ALL )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:529:1: importsetclause : ( testid ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )? -> ^( IMPORT_PLUS testid ( Id )? ) | '-' ( NL )? testid -> ^( IMPORT_MINUS testid ) | importall );
    public final babel17Parser.importsetclause_return importsetclause() throws RecognitionException {
        babel17Parser.importsetclause_return retval = new babel17Parser.importsetclause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL253=null;
        Token NL255=null;
        Token Id256=null;
        Token char_literal257=null;
        Token NL258=null;
        babel17Parser.testid_return testid252 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW254 = null;

        babel17Parser.testid_return testid259 = null;

        babel17Parser.importall_return importall260 = null;


        CommonTree NL253_tree=null;
        CommonTree NL255_tree=null;
        CommonTree Id256_tree=null;
        CommonTree char_literal257_tree=null;
        CommonTree NL258_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_testid=new RewriteRuleSubtreeStream(adaptor,"rule testid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:2: ( testid ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )? -> ^( IMPORT_PLUS testid ( Id )? ) | '-' ( NL )? testid -> ^( IMPORT_MINUS testid ) | importall )
            int alt120=3;
            switch ( input.LA(1) ) {
            case L_unittest:
            case Id:
                {
                alt120=1;
                }
                break;
            case MINUS:
                {
                alt120=2;
                }
                break;
            case UNDERSCORE:
                {
                alt120=3;
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:4: testid ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )?
                    {
                    pushFollow(FOLLOW_testid_in_importsetclause3290);
                    testid252=testid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_testid.add(testid252.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:11: ( ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )? )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==NL) ) {
                        int LA118_1 = input.LA(2);

                        if ( ((LA118_1>=A_DOUBLE_ARROW && LA118_1<=U_DOUBLE_ARROW)) ) {
                            alt118=1;
                        }
                    }
                    else if ( ((LA118_0>=A_DOUBLE_ARROW && LA118_0<=U_DOUBLE_ARROW)) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:12: ( NL )? token_DOUBLE_ARROW ( ( NL )? Id )?
                            {
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:12: ( NL )?
                            int alt115=2;
                            int LA115_0 = input.LA(1);

                            if ( (LA115_0==NL) ) {
                                alt115=1;
                            }
                            switch (alt115) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:12: NL
                                    {
                                    NL253=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3293); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL253);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_importsetclause3296);
                            token_DOUBLE_ARROW254=token_DOUBLE_ARROW();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW254.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:35: ( ( NL )? Id )?
                            int alt117=2;
                            int LA117_0 = input.LA(1);

                            if ( (LA117_0==NL) ) {
                                int LA117_1 = input.LA(2);

                                if ( (LA117_1==Id) ) {
                                    alt117=1;
                                }
                            }
                            else if ( (LA117_0==Id) ) {
                                alt117=1;
                            }
                            switch (alt117) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:36: ( NL )? Id
                                    {
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:36: ( NL )?
                                    int alt116=2;
                                    int LA116_0 = input.LA(1);

                                    if ( (LA116_0==NL) ) {
                                        alt116=1;
                                    }
                                    switch (alt116) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:36: NL
                                            {
                                            NL255=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3299); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL255);


                                            }
                                            break;

                                    }

                                    Id256=(Token)match(input,Id,FOLLOW_Id_in_importsetclause3302); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_Id.add(Id256);


                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: testid, Id
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 530:47: -> ^( IMPORT_PLUS testid ( Id )? )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:50: ^( IMPORT_PLUS testid ( Id )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_PLUS, "IMPORT_PLUS"), root_1);

                        adaptor.addChild(root_1, stream_testid.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:530:71: ( Id )?
                        if ( stream_Id.hasNext() ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:4: '-' ( NL )? testid
                    {
                    char_literal257=(Token)match(input,MINUS,FOLLOW_MINUS_in_importsetclause3322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(char_literal257);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:8: ( NL )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==NL) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:8: NL
                            {
                            NL258=(Token)match(input,NL,FOLLOW_NL_in_importsetclause3324); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL258);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_testid_in_importsetclause3327);
                    testid259=testid();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_testid.add(testid259.getTree());


                    // AST REWRITE
                    // elements: testid
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 531:19: -> ^( IMPORT_MINUS testid )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:531:22: ^( IMPORT_MINUS testid )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_MINUS, "IMPORT_MINUS"), root_1);

                        adaptor.addChild(root_1, stream_testid.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:532:4: importall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_importall_in_importsetclause3340);
                    importall260=importall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, importall260.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:534:1: importset : '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}' -> ^( IMPORT_SET ( importsetclause )* ) ;
    public final babel17Parser.importset_return importset() throws RecognitionException {
        babel17Parser.importset_return retval = new babel17Parser.importset_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal261=null;
        Token NL262=null;
        Token NL264=null;
        Token char_literal265=null;
        Token NL266=null;
        Token NL268=null;
        Token char_literal269=null;
        babel17Parser.importsetclause_return importsetclause263 = null;

        babel17Parser.importsetclause_return importsetclause267 = null;


        CommonTree char_literal261_tree=null;
        CommonTree NL262_tree=null;
        CommonTree NL264_tree=null;
        CommonTree char_literal265_tree=null;
        CommonTree NL266_tree=null;
        CommonTree NL268_tree=null;
        CommonTree char_literal269_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_importsetclause=new RewriteRuleSubtreeStream(adaptor,"rule importsetclause");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:2: ( '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}' -> ^( IMPORT_SET ( importsetclause )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:4: '{' ( NL )? importsetclause ( ( NL )? ',' ( NL )? importsetclause )* ( NL )? '}'
            {
            char_literal261=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_importset3350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal261);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:8: ( NL )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==NL) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:8: NL
                    {
                    NL262=(Token)match(input,NL,FOLLOW_NL_in_importset3352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL262);


                    }
                    break;

            }

            pushFollow(FOLLOW_importsetclause_in_importset3355);
            importsetclause263=importsetclause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importsetclause.add(importsetclause263.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:28: ( ( NL )? ',' ( NL )? importsetclause )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==NL) ) {
                    int LA124_1 = input.LA(2);

                    if ( (LA124_1==COMMA) ) {
                        alt124=1;
                    }


                }
                else if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:29: ( NL )? ',' ( NL )? importsetclause
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:29: ( NL )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==NL) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:29: NL
            	            {
            	            NL264=(Token)match(input,NL,FOLLOW_NL_in_importset3358); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL264);


            	            }
            	            break;

            	    }

            	    char_literal265=(Token)match(input,COMMA,FOLLOW_COMMA_in_importset3361); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(char_literal265);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:37: ( NL )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==NL) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:37: NL
            	            {
            	            NL266=(Token)match(input,NL,FOLLOW_NL_in_importset3363); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL266);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_importsetclause_in_importset3366);
            	    importsetclause267=importsetclause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importsetclause.add(importsetclause267.getTree());

            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:59: ( NL )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NL) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:59: NL
                    {
                    NL268=(Token)match(input,NL,FOLLOW_NL_in_importset3370); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL268);


                    }
                    break;

            }

            char_literal269=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_importset3373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal269);



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
            // 535:67: -> ^( IMPORT_SET ( importsetclause )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:70: ^( IMPORT_SET ( importsetclause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_SET, "IMPORT_SET"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:535:83: ( importsetclause )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:537:1: st_import : L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )? -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? ) ;
    public final babel17Parser.st_import_return st_import() throws RecognitionException {
        babel17Parser.st_import_return retval = new babel17Parser.st_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_import270=null;
        Token NL271=null;
        Token NL273=null;
        Token PERIOD274=null;
        Token NL275=null;
        Token PERIOD277=null;
        Token NL278=null;
        Token NL281=null;
        Token Id282=null;
        babel17Parser.importprefix_return importprefix272 = null;

        babel17Parser.importall_return importall276 = null;

        babel17Parser.importset_return importset279 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW280 = null;


        CommonTree L_import270_tree=null;
        CommonTree NL271_tree=null;
        CommonTree NL273_tree=null;
        CommonTree PERIOD274_tree=null;
        CommonTree NL275_tree=null;
        CommonTree PERIOD277_tree=null;
        CommonTree NL278_tree=null;
        CommonTree NL281_tree=null;
        CommonTree Id282_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleTokenStream stream_L_import=new RewriteRuleTokenStream(adaptor,"token L_import");
        RewriteRuleSubtreeStream stream_importprefix=new RewriteRuleSubtreeStream(adaptor,"rule importprefix");
        RewriteRuleSubtreeStream stream_importset=new RewriteRuleSubtreeStream(adaptor,"rule importset");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_importall=new RewriteRuleSubtreeStream(adaptor,"rule importall");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:2: ( L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )? -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:4: L_import ( NL )? importprefix ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )?
            {
            L_import270=(Token)match(input,L_import,FOLLOW_L_import_in_st_import3391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_import.add(L_import270);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:13: ( NL )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==NL) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:13: NL
                    {
                    NL271=(Token)match(input,NL,FOLLOW_NL_in_st_import3393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL271);


                    }
                    break;

            }

            pushFollow(FOLLOW_importprefix_in_st_import3396);
            importprefix272=importprefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_importprefix.add(importprefix272.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:30: ( ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==NL) ) {
                int LA132_1 = input.LA(2);

                if ( ((LA132_1>=A_DOUBLE_ARROW && LA132_1<=U_DOUBLE_ARROW)||LA132_1==PERIOD) ) {
                    alt132=1;
                }
            }
            else if ( ((LA132_0>=A_DOUBLE_ARROW && LA132_0<=U_DOUBLE_ARROW)||LA132_0==PERIOD) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:31: ( NL )? ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id )
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:31: ( NL )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==NL) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:31: NL
                            {
                            NL273=(Token)match(input,NL,FOLLOW_NL_in_st_import3399); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL273);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:35: ( PERIOD ( NL )? importall | PERIOD ( NL )? importset | token_DOUBLE_ARROW ( NL )? Id )
                    int alt131=3;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==PERIOD) ) {
                        switch ( input.LA(2) ) {
                        case NL:
                            {
                            int LA131_3 = input.LA(3);

                            if ( (LA131_3==CURLY_BRACKET_OPEN) ) {
                                alt131=2;
                            }
                            else if ( (LA131_3==UNDERSCORE) ) {
                                alt131=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 131, 3, input);

                                throw nvae;
                            }
                            }
                            break;
                        case CURLY_BRACKET_OPEN:
                            {
                            alt131=2;
                            }
                            break;
                        case UNDERSCORE:
                            {
                            alt131=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 131, 1, input);

                            throw nvae;
                        }

                    }
                    else if ( ((LA131_0>=A_DOUBLE_ARROW && LA131_0<=U_DOUBLE_ARROW)) ) {
                        alt131=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:36: PERIOD ( NL )? importall
                            {
                            PERIOD274=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_st_import3403); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD274);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:43: ( NL )?
                            int alt128=2;
                            int LA128_0 = input.LA(1);

                            if ( (LA128_0==NL) ) {
                                alt128=1;
                            }
                            switch (alt128) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:43: NL
                                    {
                                    NL275=(Token)match(input,NL,FOLLOW_NL_in_st_import3405); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL275);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_importall_in_st_import3408);
                            importall276=importall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_importall.add(importall276.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:59: PERIOD ( NL )? importset
                            {
                            PERIOD277=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_st_import3412); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD277);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:66: ( NL )?
                            int alt129=2;
                            int LA129_0 = input.LA(1);

                            if ( (LA129_0==NL) ) {
                                alt129=1;
                            }
                            switch (alt129) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:66: NL
                                    {
                                    NL278=(Token)match(input,NL,FOLLOW_NL_in_st_import3414); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL278);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_importset_in_st_import3417);
                            importset279=importset();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_importset.add(importset279.getTree());

                            }
                            break;
                        case 3 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:82: token_DOUBLE_ARROW ( NL )? Id
                            {
                            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_st_import3421);
                            token_DOUBLE_ARROW280=token_DOUBLE_ARROW();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW280.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:101: ( NL )?
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==NL) ) {
                                alt130=1;
                            }
                            switch (alt130) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:101: NL
                                    {
                                    NL281=(Token)match(input,NL,FOLLOW_NL_in_st_import3423); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL281);


                                    }
                                    break;

                            }

                            Id282=(Token)match(input,Id,FOLLOW_Id_in_st_import3426); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Id.add(Id282);


                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: importprefix, importset, L_import, Id, importall
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 538:111: -> ^( L_import importprefix ( importall )? ( importset )? ( Id )? )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:114: ^( L_import importprefix ( importall )? ( importset )? ( Id )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_L_import.nextNode(), root_1);

                adaptor.addChild(root_1, stream_importprefix.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:138: ( importall )?
                if ( stream_importall.hasNext() ) {
                    adaptor.addChild(root_1, stream_importall.nextTree());

                }
                stream_importall.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:149: ( importset )?
                if ( stream_importset.hasNext() ) {
                    adaptor.addChild(root_1, stream_importset.nextTree());

                }
                stream_importset.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:538:160: ( Id )?
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:540:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );
    public final babel17Parser.expr_or_assign_return expr_or_assign() throws RecognitionException {
        babel17Parser.expr_or_assign_return retval = new babel17Parser.expr_or_assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL285=null;
        Token char_literal286=null;
        Token NL287=null;
        babel17Parser.pattern_return pattern283 = null;

        babel17Parser.objelem_assign_return objelem_assign284 = null;

        babel17Parser.expr_return expr288 = null;

        babel17Parser.expr_return expr289 = null;


        CommonTree NL285_tree=null;
        CommonTree char_literal286_tree=null;
        CommonTree NL287_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_objelem_assign=new RewriteRuleSubtreeStream(adaptor,"rule objelem_assign");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:2: ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr )
            int alt136=2;
            alt136 = dfa136.predict(input);
            switch (alt136) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:44: ( pattern | objelem_assign )
                    int alt133=2;
                    int LA133_0 = input.LA(1);

                    if ( (LA133_0==L_exception||(LA133_0>=A_infinity && LA133_0<=U_infinity)||(LA133_0>=L_true && LA133_0<=L_false)||LA133_0==L_nil||LA133_0==MINUS||(LA133_0>=A_ELLIPSIS && LA133_0<=U_ELLIPSIS)||LA133_0==Constr||LA133_0==Num||(LA133_0>=String && LA133_0<=ROUND_BRACKET_OPEN)||LA133_0==SQUARE_BRACKET_OPEN||LA133_0==CURLY_BRACKET_OPEN||LA133_0==UNDERSCORE) ) {
                        alt133=1;
                    }
                    else if ( (LA133_0==Id) ) {
                        int LA133_2 = input.LA(2);

                        if ( (LA133_2==PERIOD) ) {
                            alt133=2;
                        }
                        else if ( (LA133_2==ASSIGN||(LA133_2>=A_DOUBLE_COLON && LA133_2<=U_DOUBLE_COLON)||LA133_2==NL) ) {
                            alt133=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 133, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 133, 0, input);

                        throw nvae;
                    }
                    switch (alt133) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:45: pattern
                            {
                            pushFollow(FOLLOW_pattern_in_expr_or_assign3474);
                            pattern283=pattern();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pattern.add(pattern283.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:55: objelem_assign
                            {
                            pushFollow(FOLLOW_objelem_assign_in_expr_or_assign3478);
                            objelem_assign284=objelem_assign();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_objelem_assign.add(objelem_assign284.getTree());

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:71: ( NL )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==NL) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:71: NL
                            {
                            NL285=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3481); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL285);


                            }
                            break;

                    }

                    char_literal286=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_or_assign3484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASSIGN.add(char_literal286);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:79: ( NL )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==NL) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:79: NL
                            {
                            NL287=(Token)match(input,NL,FOLLOW_NL_in_expr_or_assign3486); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL287);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expr_in_expr_or_assign3489);
                    expr288=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr288.getTree());


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
                    // 541:88: -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:91: ^( ASSIGN ( pattern )* ( objelem_assign )* expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN, "ASSIGN"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:100: ( pattern )*
                        while ( stream_pattern.hasNext() ) {
                            adaptor.addChild(root_1, stream_pattern.nextTree());

                        }
                        stream_pattern.reset();
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:109: ( objelem_assign )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:542:4: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_expr_or_assign3508);
                    expr289=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:544:1: expr : ( lop_expr | obj_expr );
    public final babel17Parser.expr_return expr() throws RecognitionException {
        babel17Parser.expr_return retval = new babel17Parser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lop_expr_return lop_expr290 = null;

        babel17Parser.obj_expr_return obj_expr291 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:2: ( lop_expr | obj_expr )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==L_begin||(LA137_0>=L_with && LA137_0<=L_if)||(LA137_0>=L_while && LA137_0<=L_for)||LA137_0==L_match||LA137_0==L_exception||LA137_0==L_try||(LA137_0>=A_infinity && LA137_0<=L_lazy)||(LA137_0>=L_true && LA137_0<=L_nil)||LA137_0==L_typeof||LA137_0==MINUS||LA137_0==A_NOT||LA137_0==U_NOT||(LA137_0>=A_ELLIPSIS && LA137_0<=U_ELLIPSIS)||LA137_0==L_force||(LA137_0>=Constr && LA137_0<=Num)||(LA137_0>=String && LA137_0<=ROUND_BRACKET_OPEN)||LA137_0==SQUARE_BRACKET_OPEN||LA137_0==CURLY_BRACKET_OPEN||LA137_0==UNDERSCORE) ) {
                alt137=1;
            }
            else if ( (LA137_0==L_obj) ) {
                alt137=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:545:4: lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lop_expr_in_expr3519);
                    lop_expr290=lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lop_expr290.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:546:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_expr3524);
                    obj_expr291=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr291.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:548:1: control_expr : ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end );
    public final babel17Parser.control_expr_return control_expr() throws RecognitionException {
        babel17Parser.control_expr_return retval = new babel17Parser.control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.if_expr_return if_expr292 = null;

        babel17Parser.while_do_expr_return while_do_expr293 = null;

        babel17Parser.match_expr_return match_expr294 = null;

        babel17Parser.for_expr_return for_expr295 = null;

        babel17Parser.try_expr_return try_expr296 = null;

        babel17Parser.begin_end_return begin_end297 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:2: ( if_expr | while_do_expr | match_expr | for_expr | try_expr | begin_end )
            int alt138=6;
            switch ( input.LA(1) ) {
            case L_if:
                {
                alt138=1;
                }
                break;
            case L_while:
                {
                alt138=2;
                }
                break;
            case L_match:
                {
                alt138=3;
                }
                break;
            case L_for:
                {
                alt138=4;
                }
                break;
            case L_try:
                {
                alt138=5;
                }
                break;
            case L_begin:
                {
                alt138=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:549:4: if_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_if_expr_in_control_expr3534);
                    if_expr292=if_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr292.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:550:4: while_do_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_while_do_expr_in_control_expr3539);
                    while_do_expr293=while_do_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_do_expr293.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:551:4: match_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_match_expr_in_control_expr3544);
                    match_expr294=match_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, match_expr294.getTree());

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:552:4: for_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_for_expr_in_control_expr3549);
                    for_expr295=for_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr295.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:553:5: try_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_try_expr_in_control_expr3555);
                    try_expr296=try_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_expr296.getTree());

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:554:4: begin_end
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_begin_end_in_control_expr3560);
                    begin_end297=begin_end();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, begin_end297.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:556:1: with_control_expr : ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) );
    public final babel17Parser.with_control_expr_return with_control_expr() throws RecognitionException {
        babel17Parser.with_control_expr_return retval = new babel17Parser.with_control_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_with299=null;
        Token NL300=null;
        Token NL302=null;
        Token L_do303=null;
        Token L_end305=null;
        babel17Parser.control_expr_return control_expr298 = null;

        babel17Parser.protected_expr_return protected_expr301 = null;

        babel17Parser.block_return block304 = null;


        CommonTree L_with299_tree=null;
        CommonTree NL300_tree=null;
        CommonTree NL302_tree=null;
        CommonTree L_do303_tree=null;
        CommonTree L_end305_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_with=new RewriteRuleTokenStream(adaptor,"token L_with");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:2: ( control_expr | L_with ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WITH protected_expr ^( BEGIN block ) ) )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==L_begin||LA141_0==L_if||(LA141_0>=L_while && LA141_0<=L_for)||LA141_0==L_match||LA141_0==L_try) ) {
                alt141=1;
            }
            else if ( (LA141_0==L_with) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:557:4: control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_expr_in_with_control_expr3570);
                    control_expr298=control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_expr298.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:4: L_with ( NL )? protected_expr ( NL )? L_do block L_end
                    {
                    L_with299=(Token)match(input,L_with,FOLLOW_L_with_in_with_control_expr3575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_with.add(L_with299);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:11: ( NL )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==NL) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:11: NL
                            {
                            NL300=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3577); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL300);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_in_with_control_expr3580);
                    protected_expr301=protected_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr301.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:30: ( NL )?
                    int alt140=2;
                    int LA140_0 = input.LA(1);

                    if ( (LA140_0==NL) ) {
                        alt140=1;
                    }
                    switch (alt140) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:30: NL
                            {
                            NL302=(Token)match(input,NL,FOLLOW_NL_in_with_control_expr3582); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL302);


                            }
                            break;

                    }

                    L_do303=(Token)match(input,L_do,FOLLOW_L_do_in_with_control_expr3585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_do.add(L_do303);

                    pushFollow(FOLLOW_block_in_with_control_expr3587);
                    block304=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block304.getTree());
                    L_end305=(Token)match(input,L_end,FOLLOW_L_end_in_with_control_expr3589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end305);



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
                    // 558:51: -> ^( WITH protected_expr ^( BEGIN block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:54: ^( WITH protected_expr ^( BEGIN block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WITH, "WITH"), root_1);

                        adaptor.addChild(root_1, stream_protected_expr.nextTree());
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:558:76: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:561:1: protected_expr : ( p_lop_expr | obj_expr );
    public final babel17Parser.protected_expr_return protected_expr() throws RecognitionException {
        babel17Parser.protected_expr_return retval = new babel17Parser.protected_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_lop_expr_return p_lop_expr306 = null;

        babel17Parser.obj_expr_return obj_expr307 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:2: ( p_lop_expr | obj_expr )
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==L_begin||(LA142_0>=L_with && LA142_0<=L_if)||(LA142_0>=L_while && LA142_0<=L_for)||LA142_0==L_match||LA142_0==L_exception||LA142_0==L_try||(LA142_0>=A_infinity && LA142_0<=L_lazy)||(LA142_0>=L_true && LA142_0<=L_nil)||LA142_0==L_typeof||LA142_0==MINUS||LA142_0==A_NOT||LA142_0==U_NOT||(LA142_0>=A_ELLIPSIS && LA142_0<=U_ELLIPSIS)||LA142_0==L_force||(LA142_0>=Constr && LA142_0<=Num)||(LA142_0>=String && LA142_0<=ROUND_BRACKET_OPEN)||LA142_0==SQUARE_BRACKET_OPEN||LA142_0==CURLY_BRACKET_OPEN||LA142_0==UNDERSCORE) ) {
                alt142=1;
            }
            else if ( (LA142_0==L_obj) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:562:4: p_lop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_lop_expr_in_protected_expr3614);
                    p_lop_expr306=p_lop_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_lop_expr306.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:563:4: obj_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_obj_expr_in_protected_expr3619);
                    obj_expr307=obj_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, obj_expr307.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:565:1: protected_expr_nc : protected_expr ;
    public final babel17Parser.protected_expr_nc_return protected_expr_nc() throws RecognitionException {
        babel17Parser.protected_expr_nc_return retval = new babel17Parser.protected_expr_nc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.protected_expr_return protected_expr308 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:2: ( protected_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:566:4: protected_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_protected_expr_in_protected_expr_nc3630);
            protected_expr308=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, protected_expr308.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:568:1: begin_end : L_begin block L_end -> ^( BEGIN block ) ;
    public final babel17Parser.begin_end_return begin_end() throws RecognitionException {
        babel17Parser.begin_end_return retval = new babel17Parser.begin_end_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_begin309=null;
        Token L_end311=null;
        babel17Parser.block_return block310 = null;


        CommonTree L_begin309_tree=null;
        CommonTree L_end311_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_begin=new RewriteRuleTokenStream(adaptor,"token L_begin");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:2: ( L_begin block L_end -> ^( BEGIN block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:4: L_begin block L_end
            {
            L_begin309=(Token)match(input,L_begin,FOLLOW_L_begin_in_begin_end3640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_begin.add(L_begin309);

            pushFollow(FOLLOW_block_in_begin_end3642);
            block310=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block310.getTree());
            L_end311=(Token)match(input,L_end,FOLLOW_L_end_in_begin_end3644); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end311);



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
            // 569:24: -> ^( BEGIN block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:569:27: ^( BEGIN block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:1: parents : ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) );
    public final babel17Parser.parents_return parents() throws RecognitionException {
        babel17Parser.parents_return retval = new babel17Parser.parents_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal312=null;
        Token char_literal314=null;
        babel17Parser.primitive_expr_return primitive_expr313 = null;

        babel17Parser.primitive_expr_return primitive_expr315 = null;


        CommonTree char_literal312_tree=null;
        CommonTree char_literal314_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:9: ( '+' primitive_expr -> ^( PARENTS_PLUS primitive_expr ) | '*' primitive_expr -> ^( PARENTS_MUL primitive_expr ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==PLUS) ) {
                alt143=1;
            }
            else if ( (LA143_0==TIMES) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:11: '+' primitive_expr
                    {
                    char_literal312=(Token)match(input,PLUS,FOLLOW_PLUS_in_parents3662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(char_literal312);

                    pushFollow(FOLLOW_primitive_expr_in_parents3664);
                    primitive_expr313=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr313.getTree());


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
                    // 572:30: -> ^( PARENTS_PLUS primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:572:33: ^( PARENTS_PLUS primitive_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:4: '*' primitive_expr
                    {
                    char_literal314=(Token)match(input,TIMES,FOLLOW_TIMES_in_parents3677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(char_literal314);

                    pushFollow(FOLLOW_primitive_expr_in_parents3679);
                    primitive_expr315=primitive_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr315.getTree());


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
                    // 573:23: -> ^( PARENTS_MUL primitive_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:573:26: ^( PARENTS_MUL primitive_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:1: obj_expr : ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) );
    public final babel17Parser.obj_expr_return obj_expr() throws RecognitionException {
        babel17Parser.obj_expr_return retval = new babel17Parser.obj_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_obj316=null;
        Token NL317=null;
        Token L_end320=null;
        Token L_obj321=null;
        Token L_end323=null;
        babel17Parser.parents_return parents318 = null;

        babel17Parser.block_return block319 = null;

        babel17Parser.block_return block322 = null;


        CommonTree L_obj316_tree=null;
        CommonTree NL317_tree=null;
        CommonTree L_end320_tree=null;
        CommonTree L_obj321_tree=null;
        CommonTree L_end323_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_obj=new RewriteRuleTokenStream(adaptor,"token L_obj");
        RewriteRuleSubtreeStream stream_parents=new RewriteRuleSubtreeStream(adaptor,"rule parents");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:9: ( ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end -> ^( OBJ block parents ) | L_obj block L_end -> ^( OBJ block ) )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==L_obj) ) {
                int LA145_1 = input.LA(2);

                if ( (LA145_1==NL) ) {
                    int LA145_2 = input.LA(3);

                    if ( ((LA145_2>=L_begin && LA145_2<=L_if)||(LA145_2>=L_while && LA145_2<=L_for)||(LA145_2>=L_yield && LA145_2<=L_match)||(LA145_2>=L_val && LA145_2<=L_def)||LA145_2==L_exception||LA145_2==L_try||(LA145_2>=A_infinity && LA145_2<=L_nil)||(LA145_2>=L_module && LA145_2<=L_import)||LA145_2==SC||LA145_2==MINUS||LA145_2==A_NOT||LA145_2==U_NOT||(LA145_2>=A_ELLIPSIS && LA145_2<=U_ELLIPSIS)||LA145_2==L_force||(LA145_2>=NL && LA145_2<=Num)||(LA145_2>=String && LA145_2<=ROUND_BRACKET_OPEN)||LA145_2==SQUARE_BRACKET_OPEN||LA145_2==CURLY_BRACKET_OPEN||LA145_2==UNDERSCORE||(LA145_2>=PRAGMA_LOG && LA145_2<=PRAGMA_PROFILE)) ) {
                        alt145=2;
                    }
                    else if ( (LA145_2==PLUS) && (synpred9_babel17())) {
                        alt145=1;
                    }
                    else if ( (LA145_2==TIMES) && (synpred9_babel17())) {
                        alt145=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 145, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA145_1==PLUS) && (synpred9_babel17())) {
                    alt145=1;
                }
                else if ( (LA145_1==TIMES) && (synpred9_babel17())) {
                    alt145=1;
                }
                else if ( ((LA145_1>=L_begin && LA145_1<=L_if)||(LA145_1>=L_while && LA145_1<=L_for)||(LA145_1>=L_yield && LA145_1<=L_match)||(LA145_1>=L_val && LA145_1<=L_def)||LA145_1==L_exception||LA145_1==L_try||(LA145_1>=A_infinity && LA145_1<=L_nil)||(LA145_1>=L_module && LA145_1<=L_import)||LA145_1==SC||LA145_1==MINUS||LA145_1==A_NOT||LA145_1==U_NOT||(LA145_1>=A_ELLIPSIS && LA145_1<=U_ELLIPSIS)||LA145_1==L_force||(LA145_1>=Constr && LA145_1<=Num)||(LA145_1>=String && LA145_1<=ROUND_BRACKET_OPEN)||LA145_1==SQUARE_BRACKET_OPEN||LA145_1==CURLY_BRACKET_OPEN||LA145_1==UNDERSCORE||(LA145_1>=PRAGMA_LOG && LA145_1<=PRAGMA_PROFILE)) ) {
                    alt145=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:11: ( L_obj ( NL )? parents )=> L_obj ( NL )? parents block L_end
                    {
                    L_obj316=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj316);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:40: ( NL )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==NL) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:40: NL
                            {
                            NL317=(Token)match(input,NL,FOLLOW_NL_in_obj_expr3709); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL317);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_parents_in_obj_expr3712);
                    parents318=parents();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parents.add(parents318.getTree());
                    pushFollow(FOLLOW_block_in_obj_expr3714);
                    block319=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block319.getTree());
                    L_end320=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end320);



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
                    // 576:64: -> ^( OBJ block parents )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:67: ^( OBJ block parents )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:17: L_obj block L_end
                    {
                    L_obj321=(Token)match(input,L_obj,FOLLOW_L_obj_in_obj_expr3744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_obj.add(L_obj321);

                    pushFollow(FOLLOW_block_in_obj_expr3746);
                    block322=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block322.getTree());
                    L_end323=(Token)match(input,L_end,FOLLOW_L_end_in_obj_expr3748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_end.add(L_end323);



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
                    // 577:35: -> ^( OBJ block )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:577:38: ^( OBJ block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:579:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );
    public final babel17Parser.lop_expr_return lop_expr() throws RecognitionException {
        babel17Parser.lop_expr_return retval = new babel17Parser.lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr324 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets325 = null;

        babel17Parser.op_expr_return op_expr326 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr )
            int alt146=3;
            alt146 = dfa146.predict(input);
            switch (alt146) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_lop_expr3776);
                    lambda_expr324=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr324.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_lop_expr3787);
                    lambda_expr_nobrackets325=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets325.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:582:4: op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_op_expr_in_lop_expr3792);
                    op_expr326=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr326.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:584:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );
    public final babel17Parser.p_lop_expr_return p_lop_expr() throws RecognitionException {
        babel17Parser.p_lop_expr_return retval = new babel17Parser.p_lop_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_expr_return lambda_expr327 = null;

        babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets328 = null;

        babel17Parser.p_op_expr_return p_op_expr329 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:2: ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr )
            int alt147=3;
            alt147 = dfa147.predict(input);
            switch (alt147) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:4: ( lambda_expr )=> lambda_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_in_p_lop_expr3808);
                    lambda_expr327=lambda_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr327.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: ( lambda_expr_nobrackets )=> lambda_expr_nobrackets
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3819);
                    lambda_expr_nobrackets328=lambda_expr_nobrackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_expr_nobrackets328.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:587:4: p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_op_expr_in_p_lop_expr3824);
                    p_op_expr329=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr329.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:1: if_expr : L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) ;
    public final babel17Parser.if_expr_return if_expr() throws RecognitionException {
        babel17Parser.if_expr_return retval = new babel17Parser.if_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_if330=null;
        Token NL331=null;
        Token NL333=null;
        Token L_then334=null;
        Token L_elseif336=null;
        Token NL337=null;
        Token NL339=null;
        Token L_then340=null;
        Token L_else342=null;
        Token L_end344=null;
        babel17Parser.protected_expr_return protected_expr332 = null;

        babel17Parser.block_return block335 = null;

        babel17Parser.protected_expr_return protected_expr338 = null;

        babel17Parser.block_return block341 = null;

        babel17Parser.block_return block343 = null;


        CommonTree L_if330_tree=null;
        CommonTree NL331_tree=null;
        CommonTree NL333_tree=null;
        CommonTree L_then334_tree=null;
        CommonTree L_elseif336_tree=null;
        CommonTree NL337_tree=null;
        CommonTree NL339_tree=null;
        CommonTree L_then340_tree=null;
        CommonTree L_else342_tree=null;
        CommonTree L_end344_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_else=new RewriteRuleTokenStream(adaptor,"token L_else");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_elseif=new RewriteRuleTokenStream(adaptor,"token L_elseif");
        RewriteRuleTokenStream stream_L_then=new RewriteRuleTokenStream(adaptor,"token L_then");
        RewriteRuleTokenStream stream_L_if=new RewriteRuleTokenStream(adaptor,"token L_if");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:9: ( L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end -> ^( IF ( protected_expr )* ( block )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:11: L_if ( NL )? protected_expr ( NL )? L_then block ( L_elseif ( NL )? protected_expr ( NL )? L_then block )* ( L_else block )? L_end
            {
            L_if330=(Token)match(input,L_if,FOLLOW_L_if_in_if_expr3834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_if.add(L_if330);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:16: ( NL )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NL) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:16: NL
                    {
                    NL331=(Token)match(input,NL,FOLLOW_NL_in_if_expr3836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL331);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_if_expr3839);
            protected_expr332=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr332.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:35: ( NL )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==NL) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:589:35: NL
                    {
                    NL333=(Token)match(input,NL,FOLLOW_NL_in_if_expr3841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL333);


                    }
                    break;

            }

            L_then334=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_then.add(L_then334);

            pushFollow(FOLLOW_block_in_if_expr3846);
            block335=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block335.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:3: ( L_elseif ( NL )? protected_expr ( NL )? L_then block )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==L_elseif) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:4: L_elseif ( NL )? protected_expr ( NL )? L_then block
            	    {
            	    L_elseif336=(Token)match(input,L_elseif,FOLLOW_L_elseif_in_if_expr3852); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_elseif.add(L_elseif336);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:13: ( NL )?
            	    int alt150=2;
            	    int LA150_0 = input.LA(1);

            	    if ( (LA150_0==NL) ) {
            	        alt150=1;
            	    }
            	    switch (alt150) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:13: NL
            	            {
            	            NL337=(Token)match(input,NL,FOLLOW_NL_in_if_expr3854); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL337);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_protected_expr_in_if_expr3857);
            	    protected_expr338=protected_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr338.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:32: ( NL )?
            	    int alt151=2;
            	    int LA151_0 = input.LA(1);

            	    if ( (LA151_0==NL) ) {
            	        alt151=1;
            	    }
            	    switch (alt151) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:590:32: NL
            	            {
            	            NL339=(Token)match(input,NL,FOLLOW_NL_in_if_expr3859); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL339);


            	            }
            	            break;

            	    }

            	    L_then340=(Token)match(input,L_then,FOLLOW_L_then_in_if_expr3862); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_L_then.add(L_then340);

            	    pushFollow(FOLLOW_block_in_if_expr3864);
            	    block341=block();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_block.add(block341.getTree());

            	    }
            	    break;

            	default :
            	    break loop152;
                }
            } while (true);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:3: ( L_else block )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==L_else) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:4: L_else block
                    {
                    L_else342=(Token)match(input,L_else,FOLLOW_L_else_in_if_expr3872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_L_else.add(L_else342);

                    pushFollow(FOLLOW_block_in_if_expr3874);
                    block343=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block343.getTree());

                    }
                    break;

            }

            L_end344=(Token)match(input,L_end,FOLLOW_L_end_in_if_expr3878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end344);



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
            // 591:26: -> ^( IF ( protected_expr )* ( block )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:29: ^( IF ( protected_expr )* ( block )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IF, "IF"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:34: ( protected_expr )*
                while ( stream_protected_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_protected_expr.nextTree());

                }
                stream_protected_expr.reset();
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:591:50: ( block )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:593:1: while_do_expr : L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) ;
    public final babel17Parser.while_do_expr_return while_do_expr() throws RecognitionException {
        babel17Parser.while_do_expr_return retval = new babel17Parser.while_do_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_while345=null;
        Token NL346=null;
        Token NL348=null;
        Token L_do349=null;
        Token L_end351=null;
        babel17Parser.protected_expr_return protected_expr347 = null;

        babel17Parser.block_return block350 = null;


        CommonTree L_while345_tree=null;
        CommonTree NL346_tree=null;
        CommonTree NL348_tree=null;
        CommonTree L_do349_tree=null;
        CommonTree L_end351_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleTokenStream stream_L_while=new RewriteRuleTokenStream(adaptor,"token L_while");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:2: ( L_while ( NL )? protected_expr ( NL )? L_do block L_end -> ^( WHILE_DO protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:4: L_while ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_while345=(Token)match(input,L_while,FOLLOW_L_while_in_while_do_expr3902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_while.add(L_while345);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:12: ( NL )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==NL) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:12: NL
                    {
                    NL346=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL346);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_while_do_expr3907);
            protected_expr347=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr347.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:31: ( NL )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==NL) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:594:31: NL
                    {
                    NL348=(Token)match(input,NL,FOLLOW_NL_in_while_do_expr3909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL348);


                    }
                    break;

            }

            L_do349=(Token)match(input,L_do,FOLLOW_L_do_in_while_do_expr3912); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do349);

            pushFollow(FOLLOW_block_in_while_do_expr3914);
            block350=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block350.getTree());
            L_end351=(Token)match(input,L_end,FOLLOW_L_end_in_while_do_expr3916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end351);



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
            // 595:5: -> ^( WHILE_DO protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:595:8: ^( WHILE_DO protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:597:1: cases : ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) );
    public final babel17Parser.cases_return cases() throws RecognitionException {
        babel17Parser.cases_return retval = new babel17Parser.cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL354=null;
        babel17Parser.full_cases_return full_cases352 = null;

        babel17Parser.pattern_return pattern353 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW355 = null;

        babel17Parser.block_return block356 = null;


        CommonTree NL354_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:2: ( full_cases | pattern ( NL )? token_DOUBLE_ARROW block -> ^( CASES ^( NIL_TOKEN pattern block ) ) )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==L_case) ) {
                alt157=1;
            }
            else if ( (LA157_0==L_exception||(LA157_0>=A_infinity && LA157_0<=U_infinity)||(LA157_0>=L_true && LA157_0<=L_false)||LA157_0==L_nil||LA157_0==MINUS||(LA157_0>=A_ELLIPSIS && LA157_0<=U_ELLIPSIS)||(LA157_0>=Constr && LA157_0<=Num)||(LA157_0>=String && LA157_0<=ROUND_BRACKET_OPEN)||LA157_0==SQUARE_BRACKET_OPEN||LA157_0==CURLY_BRACKET_OPEN||LA157_0==UNDERSCORE) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:598:4: full_cases
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_full_cases_in_cases3946);
                    full_cases352=full_cases();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, full_cases352.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:4: pattern ( NL )? token_DOUBLE_ARROW block
                    {
                    pushFollow(FOLLOW_pattern_in_cases3951);
                    pattern353=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern353.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:12: ( NL )?
                    int alt156=2;
                    int LA156_0 = input.LA(1);

                    if ( (LA156_0==NL) ) {
                        alt156=1;
                    }
                    switch (alt156) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:12: NL
                            {
                            NL354=(Token)match(input,NL,FOLLOW_NL_in_cases3953); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL354);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_cases3956);
                    token_DOUBLE_ARROW355=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW355.getTree());
                    pushFollow(FOLLOW_block_in_cases3958);
                    block356=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block356.getTree());


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
                    // 599:41: -> ^( CASES ^( NIL_TOKEN pattern block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:44: ^( CASES ^( NIL_TOKEN pattern block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:599:52: ^( NIL_TOKEN pattern block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:601:1: full_cases : ( case_expr )+ -> ^( CASES ( case_expr )+ ) ;
    public final babel17Parser.full_cases_return full_cases() throws RecognitionException {
        babel17Parser.full_cases_return retval = new babel17Parser.full_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.case_expr_return case_expr357 = null;


        RewriteRuleSubtreeStream stream_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule case_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:2: ( ( case_expr )+ -> ^( CASES ( case_expr )+ ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:4: ( case_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:4: ( case_expr )+
            int cnt158=0;
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==L_case) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:4: case_expr
            	    {
            	    pushFollow(FOLLOW_case_expr_in_full_cases3981);
            	    case_expr357=case_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_case_expr.add(case_expr357.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt158 >= 1 ) break loop158;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(158, input);
                        throw eee;
                }
                cnt158++;
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
            // 602:15: -> ^( CASES ( case_expr )+ )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:602:18: ^( CASES ( case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:604:1: case_expr : ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN casepattern block ) ;
    public final babel17Parser.case_expr_return case_expr() throws RecognitionException {
        babel17Parser.case_expr_return retval = new babel17Parser.case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case358=null;
        Token NL359=null;
        Token NL361=null;
        babel17Parser.casepattern_return casepattern360 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW362 = null;

        babel17Parser.block_return block363 = null;


        CommonTree L_case358_tree=null;
        CommonTree NL359_tree=null;
        CommonTree NL361_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_casepattern=new RewriteRuleSubtreeStream(adaptor,"rule casepattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:2: ( ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW block ) -> ^( NIL_TOKEN casepattern block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:4: ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:5: L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW block
            {
            L_case358=(Token)match(input,L_case,FOLLOW_L_case_in_case_expr4002); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case358);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:12: ( NL )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==NL) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:12: NL
                    {
                    NL359=(Token)match(input,NL,FOLLOW_NL_in_case_expr4004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL359);


                    }
                    break;

            }

            pushFollow(FOLLOW_casepattern_in_case_expr4007);
            casepattern360=casepattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_casepattern.add(casepattern360.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:28: ( NL )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==NL) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:28: NL
                    {
                    NL361=(Token)match(input,NL,FOLLOW_NL_in_case_expr4009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL361);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_case_expr4012);
            token_DOUBLE_ARROW362=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW362.getTree());
            pushFollow(FOLLOW_block_in_case_expr4014);
            block363=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block363.getTree());

            }



            // AST REWRITE
            // elements: casepattern, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 605:58: -> ^( NIL_TOKEN casepattern block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:605:61: ^( NIL_TOKEN casepattern block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                adaptor.addChild(root_1, stream_casepattern.nextTree());
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:607:1: match_expr : L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) ;
    public final babel17Parser.match_expr_return match_expr() throws RecognitionException {
        babel17Parser.match_expr_return retval = new babel17Parser.match_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_match364=null;
        Token NL365=null;
        Token NL367=null;
        Token L_end369=null;
        babel17Parser.p_op_expr_return p_op_expr366 = null;

        babel17Parser.full_cases_return full_cases368 = null;


        CommonTree L_match364_tree=null;
        CommonTree NL365_tree=null;
        CommonTree NL367_tree=null;
        CommonTree L_end369_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_match=new RewriteRuleTokenStream(adaptor,"token L_match");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_p_op_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_op_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:2: ( L_match ( NL )? p_op_expr ( NL )? full_cases L_end -> ^( MATCH p_op_expr full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:4: L_match ( NL )? p_op_expr ( NL )? full_cases L_end
            {
            L_match364=(Token)match(input,L_match,FOLLOW_L_match_in_match_expr4035); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_match.add(L_match364);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:12: ( NL )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NL) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:12: NL
                    {
                    NL365=(Token)match(input,NL,FOLLOW_NL_in_match_expr4037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL365);


                    }
                    break;

            }

            pushFollow(FOLLOW_p_op_expr_in_match_expr4040);
            p_op_expr366=p_op_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_op_expr.add(p_op_expr366.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:26: ( NL )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==NL) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:608:26: NL
                    {
                    NL367=(Token)match(input,NL,FOLLOW_NL_in_match_expr4042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL367);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_match_expr4045);
            full_cases368=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases368.getTree());
            L_end369=(Token)match(input,L_end,FOLLOW_L_end_in_match_expr4047); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end369);



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
            // 609:5: -> ^( MATCH p_op_expr full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:609:8: ^( MATCH p_op_expr full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:1: try_expr : L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) ;
    public final babel17Parser.try_expr_return try_expr() throws RecognitionException {
        babel17Parser.try_expr_return retval = new babel17Parser.try_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_try370=null;
        Token NL371=null;
        Token NL373=null;
        Token L_catch374=null;
        Token NL375=null;
        Token L_end377=null;
        babel17Parser.pure_block_return pure_block372 = null;

        babel17Parser.full_cases_return full_cases376 = null;


        CommonTree L_try370_tree=null;
        CommonTree NL371_tree=null;
        CommonTree NL373_tree=null;
        CommonTree L_catch374_tree=null;
        CommonTree NL375_tree=null;
        CommonTree L_end377_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_try=new RewriteRuleTokenStream(adaptor,"token L_try");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_catch=new RewriteRuleTokenStream(adaptor,"token L_catch");
        RewriteRuleSubtreeStream stream_full_cases=new RewriteRuleSubtreeStream(adaptor,"rule full_cases");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:9: ( L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end -> ^( TRY pure_block full_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:11: L_try ( NL )? pure_block ( NL )? L_catch ( NL )? full_cases L_end
            {
            L_try370=(Token)match(input,L_try,FOLLOW_L_try_in_try_expr4073); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_try.add(L_try370);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:17: ( NL )?
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==NL) ) {
                alt163=1;
            }
            switch (alt163) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:17: NL
                    {
                    NL371=(Token)match(input,NL,FOLLOW_NL_in_try_expr4075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL371);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_try_expr4078);
            pure_block372=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block372.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:32: ( NL )?
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==NL) ) {
                alt164=1;
            }
            switch (alt164) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:32: NL
                    {
                    NL373=(Token)match(input,NL,FOLLOW_NL_in_try_expr4080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL373);


                    }
                    break;

            }

            L_catch374=(Token)match(input,L_catch,FOLLOW_L_catch_in_try_expr4083); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_catch.add(L_catch374);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:44: ( NL )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==NL) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:611:44: NL
                    {
                    NL375=(Token)match(input,NL,FOLLOW_NL_in_try_expr4085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL375);


                    }
                    break;

            }

            pushFollow(FOLLOW_full_cases_in_try_expr4088);
            full_cases376=full_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_full_cases.add(full_cases376.getTree());
            L_end377=(Token)match(input,L_end,FOLLOW_L_end_in_try_expr4090); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end377);



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
            // 612:5: -> ^( TRY pure_block full_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:612:8: ^( TRY pure_block full_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:614:1: lambda_expr : '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) ;
    public final babel17Parser.lambda_expr_return lambda_expr() throws RecognitionException {
        babel17Parser.lambda_expr_return retval = new babel17Parser.lambda_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal378=null;
        Token NL379=null;
        Token NL381=null;
        Token char_literal382=null;
        babel17Parser.lambda_cases_return lambda_cases380 = null;


        CommonTree char_literal378_tree=null;
        CommonTree NL379_tree=null;
        CommonTree NL381_tree=null;
        CommonTree char_literal382_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_lambda_cases=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:2: ( '(' ( NL )? lambda_cases ( NL )? ')' -> ^( LAMBDA lambda_cases ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:4: '(' ( NL )? lambda_cases ( NL )? ')'
            {
            char_literal378=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr4114); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal378);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:8: ( NL )?
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==NL) ) {
                alt166=1;
            }
            switch (alt166) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:8: NL
                    {
                    NL379=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr4116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL379);


                    }
                    break;

            }

            pushFollow(FOLLOW_lambda_cases_in_lambda_expr4119);
            lambda_cases380=lambda_cases();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases.add(lambda_cases380.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:25: ( NL )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==NL) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:25: NL
                    {
                    NL381=(Token)match(input,NL,FOLLOW_NL_in_lambda_expr4121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL381);


                    }
                    break;

            }

            char_literal382=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr4124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal382);



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
            // 615:33: -> ^( LAMBDA lambda_cases )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:615:36: ^( LAMBDA lambda_cases )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:617:1: lambda_expr_nobrackets : lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) ;
    public final babel17Parser.lambda_expr_nobrackets_return lambda_expr_nobrackets() throws RecognitionException {
        babel17Parser.lambda_expr_nobrackets_return retval = new babel17Parser.lambda_expr_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets383 = null;


        RewriteRuleSubtreeStream stream_lambda_cases_nobrackets=new RewriteRuleSubtreeStream(adaptor,"rule lambda_cases_nobrackets");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:2: ( lambda_cases_nobrackets -> ^( LAMBDA lambda_cases_nobrackets ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:4: lambda_cases_nobrackets
            {
            pushFollow(FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets4143);
            lambda_cases_nobrackets383=lambda_cases_nobrackets();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lambda_cases_nobrackets.add(lambda_cases_nobrackets383.getTree());


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
            // 618:28: -> ^( LAMBDA lambda_cases_nobrackets )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:618:31: ^( LAMBDA lambda_cases_nobrackets )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:620:1: lambda_cases_nobrackets : pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) ;
    public final babel17Parser.lambda_cases_nobrackets_return lambda_cases_nobrackets() throws RecognitionException {
        babel17Parser.lambda_cases_nobrackets_return retval = new babel17Parser.lambda_cases_nobrackets_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL385=null;
        Token NL387=null;
        babel17Parser.pattern_return pattern384 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW386 = null;

        babel17Parser.lop_expr_return lop_expr388 = null;


        CommonTree NL385_tree=null;
        CommonTree NL387_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lop_expr=new RewriteRuleSubtreeStream(adaptor,"rule lop_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? lop_expr
            {
            pushFollow(FOLLOW_pattern_in_lambda_cases_nobrackets4161);
            pattern384=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern384.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:12: ( NL )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==NL) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:12: NL
                    {
                    NL385=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets4163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL385);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets4166);
            token_DOUBLE_ARROW386=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW386.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:35: ( NL )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==NL) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:35: NL
                    {
                    NL387=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases_nobrackets4168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL387);


                    }
                    break;

            }

            pushFollow(FOLLOW_lop_expr_in_lambda_cases_nobrackets4171);
            lop_expr388=lop_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lop_expr.add(lop_expr388.getTree());


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
            // 621:48: -> ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:51: ^( CASES ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:59: ^( NIL_TOKEN pattern ^( BLOCK lop_expr ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                adaptor.addChild(root_2, stream_pattern.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:621:79: ^( BLOCK lop_expr )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:623:1: lambda_case_expr : ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN casepattern pure_block ) ;
    public final babel17Parser.lambda_case_expr_return lambda_case_expr() throws RecognitionException {
        babel17Parser.lambda_case_expr_return retval = new babel17Parser.lambda_case_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_case389=null;
        Token NL390=null;
        Token NL392=null;
        Token NL394=null;
        babel17Parser.casepattern_return casepattern391 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW393 = null;

        babel17Parser.pure_block_return pure_block395 = null;


        CommonTree L_case389_tree=null;
        CommonTree NL390_tree=null;
        CommonTree NL392_tree=null;
        CommonTree NL394_tree=null;
        RewriteRuleTokenStream stream_L_case=new RewriteRuleTokenStream(adaptor,"token L_case");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_casepattern=new RewriteRuleSubtreeStream(adaptor,"rule casepattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:2: ( ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block ) -> ^( NIL_TOKEN casepattern pure_block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:4: ( L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:5: L_case ( NL )? casepattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
            {
            L_case389=(Token)match(input,L_case,FOLLOW_L_case_in_lambda_case_expr4199); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_case.add(L_case389);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:12: ( NL )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==NL) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:12: NL
                    {
                    NL390=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL390);


                    }
                    break;

            }

            pushFollow(FOLLOW_casepattern_in_lambda_case_expr4204);
            casepattern391=casepattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_casepattern.add(casepattern391.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:28: ( NL )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==NL) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:28: NL
                    {
                    NL392=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL392);


                    }
                    break;

            }

            pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4209);
            token_DOUBLE_ARROW393=token_DOUBLE_ARROW();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW393.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:51: ( NL )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==NL) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:51: NL
                    {
                    NL394=(Token)match(input,NL,FOLLOW_NL_in_lambda_case_expr4211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL394);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_block_in_lambda_case_expr4214);
            pure_block395=pure_block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_block.add(pure_block395.getTree());

            }



            // AST REWRITE
            // elements: pure_block, casepattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 624:67: -> ^( NIL_TOKEN casepattern pure_block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:624:70: ^( NIL_TOKEN casepattern pure_block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                adaptor.addChild(root_1, stream_casepattern.nextTree());
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:626:1: lambda_cases : ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) );
    public final babel17Parser.lambda_cases_return lambda_cases() throws RecognitionException {
        babel17Parser.lambda_cases_return retval = new babel17Parser.lambda_cases_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL397=null;
        Token NL399=null;
        Token NL402=null;
        babel17Parser.pattern_return pattern396 = null;

        babel17Parser.token_DOUBLE_ARROW_return token_DOUBLE_ARROW398 = null;

        babel17Parser.pure_block_return pure_block400 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr401 = null;

        babel17Parser.lambda_case_expr_return lambda_case_expr403 = null;


        CommonTree NL397_tree=null;
        CommonTree NL399_tree=null;
        CommonTree NL402_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_token_DOUBLE_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_ARROW");
        RewriteRuleSubtreeStream stream_lambda_case_expr=new RewriteRuleSubtreeStream(adaptor,"rule lambda_case_expr");
        RewriteRuleSubtreeStream stream_pure_block=new RewriteRuleSubtreeStream(adaptor,"rule pure_block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:2: ( pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block -> ^( CASES ^( NIL_TOKEN pattern pure_block ) ) | lambda_case_expr ( ( NL )? lambda_case_expr )* -> ^( CASES ( lambda_case_expr )+ ) )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==L_exception||(LA177_0>=A_infinity && LA177_0<=U_infinity)||(LA177_0>=L_true && LA177_0<=L_false)||LA177_0==L_nil||LA177_0==MINUS||(LA177_0>=A_ELLIPSIS && LA177_0<=U_ELLIPSIS)||(LA177_0>=Constr && LA177_0<=Num)||(LA177_0>=String && LA177_0<=ROUND_BRACKET_OPEN)||LA177_0==SQUARE_BRACKET_OPEN||LA177_0==CURLY_BRACKET_OPEN||LA177_0==UNDERSCORE) ) {
                alt177=1;
            }
            else if ( (LA177_0==L_case) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:4: pattern ( NL )? token_DOUBLE_ARROW ( NL )? pure_block
                    {
                    pushFollow(FOLLOW_pattern_in_lambda_cases4235);
                    pattern396=pattern();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pattern.add(pattern396.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:12: ( NL )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==NL) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:12: NL
                            {
                            NL397=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4237); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL397);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4240);
                    token_DOUBLE_ARROW398=token_DOUBLE_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_DOUBLE_ARROW.add(token_DOUBLE_ARROW398.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:35: ( NL )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==NL) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:35: NL
                            {
                            NL399=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4242); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL399);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_pure_block_in_lambda_cases4245);
                    pure_block400=pure_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pure_block.add(pure_block400.getTree());


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
                    // 627:50: -> ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:53: ^( CASES ^( NIL_TOKEN pattern pure_block ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASES, "CASES"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:627:61: ^( NIL_TOKEN pattern pure_block )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:4: lambda_case_expr ( ( NL )? lambda_case_expr )*
                    {
                    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4264);
                    lambda_case_expr401=lambda_case_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr401.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:21: ( ( NL )? lambda_case_expr )*
                    loop176:
                    do {
                        int alt176=2;
                        int LA176_0 = input.LA(1);

                        if ( (LA176_0==NL) ) {
                            int LA176_1 = input.LA(2);

                            if ( (LA176_1==L_case) ) {
                                alt176=1;
                            }


                        }
                        else if ( (LA176_0==L_case) ) {
                            alt176=1;
                        }


                        switch (alt176) {
                    	case 1 :
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:22: ( NL )? lambda_case_expr
                    	    {
                    	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:22: ( NL )?
                    	    int alt175=2;
                    	    int LA175_0 = input.LA(1);

                    	    if ( (LA175_0==NL) ) {
                    	        alt175=1;
                    	    }
                    	    switch (alt175) {
                    	        case 1 :
                    	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:22: NL
                    	            {
                    	            NL402=(Token)match(input,NL,FOLLOW_NL_in_lambda_cases4267); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_NL.add(NL402);


                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_lambda_case_expr_in_lambda_cases4270);
                    	    lambda_case_expr403=lambda_case_expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lambda_case_expr.add(lambda_case_expr403.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop176;
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
                    // 628:45: -> ^( CASES ( lambda_case_expr )+ )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:628:48: ^( CASES ( lambda_case_expr )+ )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:1: for_expr : L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) ;
    public final babel17Parser.for_expr_return for_expr() throws RecognitionException {
        babel17Parser.for_expr_return retval = new babel17Parser.for_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token L_for404=null;
        Token NL405=null;
        Token NL407=null;
        Token L_in408=null;
        Token NL409=null;
        Token NL411=null;
        Token L_do412=null;
        Token L_end414=null;
        babel17Parser.pattern_return pattern406 = null;

        babel17Parser.protected_expr_return protected_expr410 = null;

        babel17Parser.block_return block413 = null;


        CommonTree L_for404_tree=null;
        CommonTree NL405_tree=null;
        CommonTree NL407_tree=null;
        CommonTree L_in408_tree=null;
        CommonTree NL409_tree=null;
        CommonTree NL411_tree=null;
        CommonTree L_do412_tree=null;
        CommonTree L_end414_tree=null;
        RewriteRuleTokenStream stream_L_end=new RewriteRuleTokenStream(adaptor,"token L_end");
        RewriteRuleTokenStream stream_L_for=new RewriteRuleTokenStream(adaptor,"token L_for");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_L_in=new RewriteRuleTokenStream(adaptor,"token L_in");
        RewriteRuleTokenStream stream_L_do=new RewriteRuleTokenStream(adaptor,"token L_do");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_protected_expr=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:9: ( L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end -> ^( FOR_EXPR pattern protected_expr block ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:11: L_for ( NL )? pattern ( NL )? L_in ( NL )? protected_expr ( NL )? L_do block L_end
            {
            L_for404=(Token)match(input,L_for,FOLLOW_L_for_in_for_expr4288); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_for.add(L_for404);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:17: ( NL )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==NL) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:17: NL
                    {
                    NL405=(Token)match(input,NL,FOLLOW_NL_in_for_expr4290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL405);


                    }
                    break;

            }

            pushFollow(FOLLOW_pattern_in_for_expr4293);
            pattern406=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern406.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:29: ( NL )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==NL) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:29: NL
                    {
                    NL407=(Token)match(input,NL,FOLLOW_NL_in_for_expr4295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL407);


                    }
                    break;

            }

            L_in408=(Token)match(input,L_in,FOLLOW_L_in_in_for_expr4298); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_in.add(L_in408);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:38: ( NL )?
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==NL) ) {
                alt180=1;
            }
            switch (alt180) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:38: NL
                    {
                    NL409=(Token)match(input,NL,FOLLOW_NL_in_for_expr4300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL409);


                    }
                    break;

            }

            pushFollow(FOLLOW_protected_expr_in_for_expr4303);
            protected_expr410=protected_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr.add(protected_expr410.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:57: ( NL )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==NL) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:630:57: NL
                    {
                    NL411=(Token)match(input,NL,FOLLOW_NL_in_for_expr4305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL411);


                    }
                    break;

            }

            L_do412=(Token)match(input,L_do,FOLLOW_L_do_in_for_expr4308); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_do.add(L_do412);

            pushFollow(FOLLOW_block_in_for_expr4310);
            block413=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block413.getTree());
            L_end414=(Token)match(input,L_end,FOLLOW_L_end_in_for_expr4312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_L_end.add(L_end414);



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
            // 631:5: -> ^( FOR_EXPR pattern protected_expr block )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:631:8: ^( FOR_EXPR pattern protected_expr block )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:1: op_expr : ( builtin_primitive op_expr | bool_expr );
    public final babel17Parser.op_expr_return op_expr() throws RecognitionException {
        babel17Parser.op_expr_return retval = new babel17Parser.op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.builtin_primitive_return builtin_primitive415 = null;

        babel17Parser.op_expr_return op_expr416 = null;

        babel17Parser.bool_expr_return bool_expr417 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:9: ( builtin_primitive op_expr | bool_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:633:11: builtin_primitive op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_op_expr4337);
                    builtin_primitive415=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive415.getTree(), root_0);
                    pushFollow(FOLLOW_op_expr_in_op_expr4340);
                    op_expr416=op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, op_expr416.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:634:4: bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_expr_in_op_expr4345);
                    bool_expr417=bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_expr417.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:636:1: p_op_expr : ( builtin_primitive ( NL )? p_op_expr | p_bool_expr );
    public final babel17Parser.p_op_expr_return p_op_expr() throws RecognitionException {
        babel17Parser.p_op_expr_return retval = new babel17Parser.p_op_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL419=null;
        babel17Parser.builtin_primitive_return builtin_primitive418 = null;

        babel17Parser.p_op_expr_return p_op_expr420 = null;

        babel17Parser.p_bool_expr_return p_bool_expr421 = null;


        CommonTree NL419_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:2: ( builtin_primitive ( NL )? p_op_expr | p_bool_expr )
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==L_exception||(LA184_0>=L_concurrent && LA184_0<=L_lazy)||LA184_0==L_random||LA184_0==L_typeof||LA184_0==L_force) ) {
                alt184=1;
            }
            else if ( (LA184_0==L_begin||(LA184_0>=L_with && LA184_0<=L_if)||(LA184_0>=L_while && LA184_0<=L_for)||LA184_0==L_match||LA184_0==L_try||(LA184_0>=A_infinity && LA184_0<=U_infinity)||(LA184_0>=L_true && LA184_0<=L_this)||LA184_0==L_nil||LA184_0==MINUS||LA184_0==A_NOT||LA184_0==U_NOT||(LA184_0>=Constr && LA184_0<=Num)||(LA184_0>=String && LA184_0<=ROUND_BRACKET_OPEN)||LA184_0==SQUARE_BRACKET_OPEN||LA184_0==CURLY_BRACKET_OPEN) ) {
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:4: builtin_primitive ( NL )? p_op_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_builtin_primitive_in_p_op_expr4355);
                    builtin_primitive418=builtin_primitive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(builtin_primitive418.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:25: ( NL )?
                    int alt183=2;
                    int LA183_0 = input.LA(1);

                    if ( (LA183_0==NL) ) {
                        alt183=1;
                    }
                    switch (alt183) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:637:25: NL
                            {
                            NL419=(Token)match(input,NL,FOLLOW_NL_in_p_op_expr4358); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_op_expr_in_p_op_expr4362);
                    p_op_expr420=p_op_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_op_expr420.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:638:4: p_bool_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_bool_expr_in_p_op_expr4367);
                    p_bool_expr421=p_bool_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_expr421.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:641:1: builtin_primitive : ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof );
    public final babel17Parser.builtin_primitive_return builtin_primitive() throws RecognitionException {
        babel17Parser.builtin_primitive_return retval = new babel17Parser.builtin_primitive_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set422=null;

        CommonTree set422_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:642:2: ( L_random | L_exception | L_lazy | L_choose | L_concurrent | L_force | L_typeof )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set422=(Token)input.LT(1);
            if ( input.LA(1)==L_exception||(input.LA(1)>=L_concurrent && input.LA(1)<=L_lazy)||input.LA(1)==L_random||input.LA(1)==L_typeof||input.LA(1)==L_force ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set422));
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:644:1: bool_expr : bool_or_expr ;
    public final babel17Parser.bool_expr_return bool_expr() throws RecognitionException {
        babel17Parser.bool_expr_return retval = new babel17Parser.bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.bool_or_expr_return bool_or_expr423 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:2: ( bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:645:4: bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_or_expr_in_bool_expr4411);
            bool_or_expr423=bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_or_expr423.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:647:1: p_bool_expr : p_bool_or_expr ;
    public final babel17Parser.p_bool_expr_return p_bool_expr() throws RecognitionException {
        babel17Parser.p_bool_expr_return retval = new babel17Parser.p_bool_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_bool_or_expr_return p_bool_or_expr424 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:2: ( p_bool_or_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:648:4: p_bool_or_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_or_expr_in_p_bool_expr4421);
            p_bool_or_expr424=p_bool_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_or_expr424.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:650:1: bool_or_expr : bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* ;
    public final babel17Parser.bool_or_expr_return bool_or_expr() throws RecognitionException {
        babel17Parser.bool_or_expr_return retval = new babel17Parser.bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL426=null;
        Token NL428=null;
        babel17Parser.bool_and_expr_return bool_and_expr425 = null;

        babel17Parser.token_OR_return token_OR427 = null;

        babel17Parser.bool_and_expr_return bool_and_expr429 = null;


        CommonTree NL426_tree=null;
        CommonTree NL428_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:2: ( bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:4: bool_and_expr ( ( NL )? token_OR ( NL )? bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4430);
            bool_and_expr425=bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr425.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:18: ( ( NL )? token_OR ( NL )? bool_and_expr )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==NL) ) {
                    int LA187_1 = input.LA(2);

                    if ( (LA187_1==A_OR||LA187_1==U_OR) ) {
                        alt187=1;
                    }


                }
                else if ( (LA187_0==A_OR||LA187_0==U_OR) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:19: ( NL )? token_OR ( NL )? bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:21: ( NL )?
            	    int alt185=2;
            	    int LA185_0 = input.LA(1);

            	    if ( (LA185_0==NL) ) {
            	        alt185=1;
            	    }
            	    switch (alt185) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:21: NL
            	            {
            	            NL426=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4433); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_bool_or_expr4437);
            	    token_OR427=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR427.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:36: ( NL )?
            	    int alt186=2;
            	    int LA186_0 = input.LA(1);

            	    if ( (LA186_0==NL) ) {
            	        alt186=1;
            	    }
            	    switch (alt186) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:651:36: NL
            	            {
            	            NL428=(Token)match(input,NL,FOLLOW_NL_in_bool_or_expr4440); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_and_expr_in_bool_or_expr4444);
            	    bool_and_expr429=bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_and_expr429.getTree());

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
    // $ANTLR end "bool_or_expr"

    public static class p_bool_or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_or_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:653:1: p_bool_or_expr : p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* ;
    public final babel17Parser.p_bool_or_expr_return p_bool_or_expr() throws RecognitionException {
        babel17Parser.p_bool_or_expr_return retval = new babel17Parser.p_bool_or_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL431=null;
        Token NL433=null;
        babel17Parser.p_bool_and_expr_return p_bool_and_expr430 = null;

        babel17Parser.token_OR_return token_OR432 = null;

        babel17Parser.p_bool_and_expr_return p_bool_and_expr434 = null;


        CommonTree NL431_tree=null;
        CommonTree NL433_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:2: ( p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:4: p_bool_and_expr ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4456);
            p_bool_and_expr430=p_bool_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr430.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:20: ( ( NL )? token_OR ( NL )? p_bool_and_expr )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==NL) ) {
                    int LA190_1 = input.LA(2);

                    if ( (LA190_1==A_OR||LA190_1==U_OR) ) {
                        alt190=1;
                    }


                }
                else if ( (LA190_0==A_OR||LA190_0==U_OR) ) {
                    alt190=1;
                }


                switch (alt190) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:21: ( NL )? token_OR ( NL )? p_bool_and_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:23: ( NL )?
            	    int alt188=2;
            	    int LA188_0 = input.LA(1);

            	    if ( (LA188_0==NL) ) {
            	        alt188=1;
            	    }
            	    switch (alt188) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:23: NL
            	            {
            	            NL431=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4459); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_OR_in_p_bool_or_expr4463);
            	    token_OR432=token_OR();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_OR432.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:38: ( NL )?
            	    int alt189=2;
            	    int LA189_0 = input.LA(1);

            	    if ( (LA189_0==NL) ) {
            	        alt189=1;
            	    }
            	    switch (alt189) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:654:38: NL
            	            {
            	            NL433=(Token)match(input,NL,FOLLOW_NL_in_p_bool_or_expr4466); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_and_expr_in_p_bool_or_expr4470);
            	    p_bool_and_expr434=p_bool_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_and_expr434.getTree());

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
    // $ANTLR end "p_bool_or_expr"

    public static class bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:656:1: bool_and_expr : bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* ;
    public final babel17Parser.bool_and_expr_return bool_and_expr() throws RecognitionException {
        babel17Parser.bool_and_expr_return retval = new babel17Parser.bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL436=null;
        Token NL438=null;
        babel17Parser.bool_not_expr_return bool_not_expr435 = null;

        babel17Parser.token_AND_return token_AND437 = null;

        babel17Parser.bool_not_expr_return bool_not_expr439 = null;


        CommonTree NL436_tree=null;
        CommonTree NL438_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:2: ( bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:4: bool_not_expr ( ( NL )? token_AND ( NL )? bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4482);
            bool_not_expr435=bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr435.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:18: ( ( NL )? token_AND ( NL )? bool_not_expr )*
            loop193:
            do {
                int alt193=2;
                int LA193_0 = input.LA(1);

                if ( (LA193_0==NL) ) {
                    int LA193_1 = input.LA(2);

                    if ( (LA193_1==A_AND||LA193_1==U_AND) ) {
                        alt193=1;
                    }


                }
                else if ( (LA193_0==A_AND||LA193_0==U_AND) ) {
                    alt193=1;
                }


                switch (alt193) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:19: ( NL )? token_AND ( NL )? bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:21: ( NL )?
            	    int alt191=2;
            	    int LA191_0 = input.LA(1);

            	    if ( (LA191_0==NL) ) {
            	        alt191=1;
            	    }
            	    switch (alt191) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:21: NL
            	            {
            	            NL436=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4485); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_bool_and_expr4489);
            	    token_AND437=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND437.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:37: ( NL )?
            	    int alt192=2;
            	    int LA192_0 = input.LA(1);

            	    if ( (LA192_0==NL) ) {
            	        alt192=1;
            	    }
            	    switch (alt192) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:657:37: NL
            	            {
            	            NL438=(Token)match(input,NL,FOLLOW_NL_in_bool_and_expr4492); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_bool_not_expr_in_bool_and_expr4496);
            	    bool_not_expr439=bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr439.getTree());

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
    // $ANTLR end "bool_and_expr"

    public static class p_bool_and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "p_bool_and_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:659:1: p_bool_and_expr : p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* ;
    public final babel17Parser.p_bool_and_expr_return p_bool_and_expr() throws RecognitionException {
        babel17Parser.p_bool_and_expr_return retval = new babel17Parser.p_bool_and_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL441=null;
        Token NL443=null;
        babel17Parser.p_bool_not_expr_return p_bool_not_expr440 = null;

        babel17Parser.token_AND_return token_AND442 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr444 = null;


        CommonTree NL441_tree=null;
        CommonTree NL443_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:2: ( p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:4: p_bool_not_expr ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4508);
            p_bool_not_expr440=p_bool_not_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr440.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:20: ( ( NL )? token_AND ( NL )? p_bool_not_expr )*
            loop196:
            do {
                int alt196=2;
                int LA196_0 = input.LA(1);

                if ( (LA196_0==NL) ) {
                    int LA196_1 = input.LA(2);

                    if ( (LA196_1==A_AND||LA196_1==U_AND) ) {
                        alt196=1;
                    }


                }
                else if ( (LA196_0==A_AND||LA196_0==U_AND) ) {
                    alt196=1;
                }


                switch (alt196) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:21: ( NL )? token_AND ( NL )? p_bool_not_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:23: ( NL )?
            	    int alt194=2;
            	    int LA194_0 = input.LA(1);

            	    if ( (LA194_0==NL) ) {
            	        alt194=1;
            	    }
            	    switch (alt194) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:23: NL
            	            {
            	            NL441=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4511); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_AND_in_p_bool_and_expr4515);
            	    token_AND442=token_AND();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_AND442.getTree(), root_0);
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:39: ( NL )?
            	    int alt195=2;
            	    int LA195_0 = input.LA(1);

            	    if ( (LA195_0==NL) ) {
            	        alt195=1;
            	    }
            	    switch (alt195) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:660:39: NL
            	            {
            	            NL443=(Token)match(input,NL,FOLLOW_NL_in_p_bool_and_expr4518); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_and_expr4522);
            	    p_bool_not_expr444=p_bool_not_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr444.getTree());

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
    // $ANTLR end "p_bool_and_expr"

    public static class bool_not_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool_not_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:663:1: bool_not_expr : ( token_NOT ( NL )? bool_not_expr | rel_expr );
    public final babel17Parser.bool_not_expr_return bool_not_expr() throws RecognitionException {
        babel17Parser.bool_not_expr_return retval = new babel17Parser.bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL446=null;
        babel17Parser.token_NOT_return token_NOT445 = null;

        babel17Parser.bool_not_expr_return bool_not_expr447 = null;

        babel17Parser.rel_expr_return rel_expr448 = null;


        CommonTree NL446_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:2: ( token_NOT ( NL )? bool_not_expr | rel_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:4: token_NOT ( NL )? bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_bool_not_expr4534);
                    token_NOT445=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT445.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:17: ( NL )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==NL) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:664:17: NL
                            {
                            NL446=(Token)match(input,NL,FOLLOW_NL_in_bool_not_expr4537); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_bool_not_expr_in_bool_not_expr4541);
                    bool_not_expr447=bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool_not_expr447.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:665:4: rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rel_expr_in_bool_not_expr4546);
                    rel_expr448=rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rel_expr448.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:667:1: p_bool_not_expr : ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr );
    public final babel17Parser.p_bool_not_expr_return p_bool_not_expr() throws RecognitionException {
        babel17Parser.p_bool_not_expr_return retval = new babel17Parser.p_bool_not_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL450=null;
        babel17Parser.token_NOT_return token_NOT449 = null;

        babel17Parser.p_bool_not_expr_return p_bool_not_expr451 = null;

        babel17Parser.p_rel_expr_return p_rel_expr452 = null;


        CommonTree NL450_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:2: ( token_NOT ( NL )? p_bool_not_expr | p_rel_expr )
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==A_NOT||LA200_0==U_NOT) ) {
                alt200=1;
            }
            else if ( (LA200_0==L_begin||(LA200_0>=L_with && LA200_0<=L_if)||(LA200_0>=L_while && LA200_0<=L_for)||LA200_0==L_match||LA200_0==L_try||(LA200_0>=A_infinity && LA200_0<=U_infinity)||(LA200_0>=L_true && LA200_0<=L_this)||LA200_0==L_nil||LA200_0==MINUS||(LA200_0>=Constr && LA200_0<=Num)||(LA200_0>=String && LA200_0<=ROUND_BRACKET_OPEN)||LA200_0==SQUARE_BRACKET_OPEN||LA200_0==CURLY_BRACKET_OPEN) ) {
                alt200=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 200, 0, input);

                throw nvae;
            }
            switch (alt200) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:4: token_NOT ( NL )? p_bool_not_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_in_p_bool_not_expr4557);
                    token_NOT449=token_NOT();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(token_NOT449.getTree(), root_0);
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:17: ( NL )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==NL) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:668:17: NL
                            {
                            NL450=(Token)match(input,NL,FOLLOW_NL_in_p_bool_not_expr4560); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_bool_not_expr_in_p_bool_not_expr4564);
                    p_bool_not_expr451=p_bool_not_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_bool_not_expr451.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:669:4: p_rel_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_rel_expr_in_p_bool_not_expr4569);
                    p_rel_expr452=p_rel_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_rel_expr452.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:671:1: rel_expr : arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) ;
    public final babel17Parser.rel_expr_return rel_expr() throws RecognitionException {
        babel17Parser.rel_expr_return retval = new babel17Parser.rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL454=null;
        Token NL456=null;
        babel17Parser.arith_expr_return arith_expr453 = null;

        babel17Parser.rel_op_return rel_op455 = null;

        babel17Parser.arith_expr_return arith_expr457 = null;


        CommonTree NL454_tree=null;
        CommonTree NL456_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:2: ( arith_expr ( ( NL )? rel_op ( NL )? arith_expr )* -> ^( COMPARE arith_expr ( rel_op arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:4: arith_expr ( ( NL )? rel_op ( NL )? arith_expr )*
            {
            pushFollow(FOLLOW_arith_expr_in_rel_expr4578);
            arith_expr453=arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr453.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:15: ( ( NL )? rel_op ( NL )? arith_expr )*
            loop203:
            do {
                int alt203=2;
                int LA203_0 = input.LA(1);

                if ( (LA203_0==NL) ) {
                    int LA203_1 = input.LA(2);

                    if ( ((LA203_1>=A_EQUAL && LA203_1<=U_GREATER_EQ)) ) {
                        alt203=1;
                    }


                }
                else if ( ((LA203_0>=A_EQUAL && LA203_0<=U_GREATER_EQ)) ) {
                    alt203=1;
                }


                switch (alt203) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:16: ( NL )? rel_op ( NL )? arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:16: ( NL )?
            	    int alt201=2;
            	    int LA201_0 = input.LA(1);

            	    if ( (LA201_0==NL) ) {
            	        alt201=1;
            	    }
            	    switch (alt201) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:16: NL
            	            {
            	            NL454=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4581); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL454);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_rel_expr4584);
            	    rel_op455=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op455.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:27: ( NL )?
            	    int alt202=2;
            	    int LA202_0 = input.LA(1);

            	    if ( (LA202_0==NL) ) {
            	        alt202=1;
            	    }
            	    switch (alt202) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:27: NL
            	            {
            	            NL456=(Token)match(input,NL,FOLLOW_NL_in_rel_expr4586); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL456);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_expr_in_rel_expr4589);
            	    arith_expr457=arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_arith_expr.add(arith_expr457.getTree());

            	    }
            	    break;

            	default :
            	    break loop203;
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
            // 672:44: -> ^( COMPARE arith_expr ( rel_op arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:47: ^( COMPARE arith_expr ( rel_op arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:672:68: ( rel_op arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:674:1: p_rel_expr : p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) ;
    public final babel17Parser.p_rel_expr_return p_rel_expr() throws RecognitionException {
        babel17Parser.p_rel_expr_return retval = new babel17Parser.p_rel_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL459=null;
        Token NL461=null;
        babel17Parser.p_arith_expr_return p_arith_expr458 = null;

        babel17Parser.rel_op_return rel_op460 = null;

        babel17Parser.p_arith_expr_return p_arith_expr462 = null;


        CommonTree NL459_tree=null;
        CommonTree NL461_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_arith_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_expr");
        RewriteRuleSubtreeStream stream_rel_op=new RewriteRuleSubtreeStream(adaptor,"rule rel_op");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:2: ( p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )* -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:4: p_arith_expr ( ( NL )? rel_op ( NL )? p_arith_expr )*
            {
            pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4616);
            p_arith_expr458=p_arith_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr458.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:17: ( ( NL )? rel_op ( NL )? p_arith_expr )*
            loop206:
            do {
                int alt206=2;
                int LA206_0 = input.LA(1);

                if ( (LA206_0==NL) ) {
                    int LA206_1 = input.LA(2);

                    if ( ((LA206_1>=A_EQUAL && LA206_1<=U_GREATER_EQ)) ) {
                        alt206=1;
                    }


                }
                else if ( ((LA206_0>=A_EQUAL && LA206_0<=U_GREATER_EQ)) ) {
                    alt206=1;
                }


                switch (alt206) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:18: ( NL )? rel_op ( NL )? p_arith_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:18: ( NL )?
            	    int alt204=2;
            	    int LA204_0 = input.LA(1);

            	    if ( (LA204_0==NL) ) {
            	        alt204=1;
            	    }
            	    switch (alt204) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:18: NL
            	            {
            	            NL459=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4619); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL459);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_rel_op_in_p_rel_expr4622);
            	    rel_op460=rel_op();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_rel_op.add(rel_op460.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:29: ( NL )?
            	    int alt205=2;
            	    int LA205_0 = input.LA(1);

            	    if ( (LA205_0==NL) ) {
            	        alt205=1;
            	    }
            	    switch (alt205) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:29: NL
            	            {
            	            NL461=(Token)match(input,NL,FOLLOW_NL_in_p_rel_expr4624); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL461);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_expr_in_p_rel_expr4627);
            	    p_arith_expr462=p_arith_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_arith_expr.add(p_arith_expr462.getTree());

            	    }
            	    break;

            	default :
            	    break loop206;
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
            // 675:48: -> ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:51: ^( COMPARE p_arith_expr ( rel_op p_arith_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARE, "COMPARE"), root_1);

                adaptor.addChild(root_1, stream_p_arith_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:675:74: ( rel_op p_arith_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:1: rel_op : ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ );
    public final babel17Parser.rel_op_return rel_op() throws RecognitionException {
        babel17Parser.rel_op_return retval = new babel17Parser.rel_op_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GREATER465=null;
        Token LESS467=null;
        babel17Parser.token_EQUAL_return token_EQUAL463 = null;

        babel17Parser.token_NOT_EQUAL_return token_NOT_EQUAL464 = null;

        babel17Parser.token_GREATER_EQ_return token_GREATER_EQ466 = null;

        babel17Parser.token_LESS_EQ_return token_LESS_EQ468 = null;


        CommonTree GREATER465_tree=null;
        CommonTree LESS467_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:8: ( token_EQUAL | token_NOT_EQUAL | GREATER | token_GREATER_EQ | LESS | token_LESS_EQ )
            int alt207=6;
            switch ( input.LA(1) ) {
            case A_EQUAL:
            case U_EQUAL:
                {
                alt207=1;
                }
                break;
            case A_NOT_EQUAL:
            case U_NOT_EQUAL:
                {
                alt207=2;
                }
                break;
            case GREATER:
                {
                alt207=3;
                }
                break;
            case A_GREATER_EQ:
            case U_GREATER_EQ:
                {
                alt207=4;
                }
                break;
            case LESS:
                {
                alt207=5;
                }
                break;
            case A_LESS_EQ:
            case U_LESS_EQ:
                {
                alt207=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 207, 0, input);

                throw nvae;
            }

            switch (alt207) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:10: token_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_EQUAL_in_rel_op4653);
                    token_EQUAL463=token_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_EQUAL463.getTree());

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:24: token_NOT_EQUAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_NOT_EQUAL_in_rel_op4657);
                    token_NOT_EQUAL464=token_NOT_EQUAL();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_NOT_EQUAL464.getTree());

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:42: GREATER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    GREATER465=(Token)match(input,GREATER,FOLLOW_GREATER_in_rel_op4661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER465_tree = (CommonTree)adaptor.create(GREATER465);
                    adaptor.addChild(root_0, GREATER465_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:52: token_GREATER_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_GREATER_EQ_in_rel_op4665);
                    token_GREATER_EQ466=token_GREATER_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_GREATER_EQ466.getTree());

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:71: LESS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LESS467=(Token)match(input,LESS,FOLLOW_LESS_in_rel_op4669); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS467_tree = (CommonTree)adaptor.create(LESS467);
                    adaptor.addChild(root_0, LESS467_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:678:78: token_LESS_EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_LESS_EQ_in_rel_op4673);
                    token_LESS_EQ468=token_LESS_EQ();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_LESS_EQ468.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:681:1: arith_expr : plusplus_expr ;
    public final babel17Parser.arith_expr_return arith_expr() throws RecognitionException {
        babel17Parser.arith_expr_return retval = new babel17Parser.arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.plusplus_expr_return plusplus_expr469 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:2: ( plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:682:4: plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_plusplus_expr_in_arith_expr4685);
            plusplus_expr469=plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, plusplus_expr469.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:685:1: p_arith_expr : p_plusplus_expr ;
    public final babel17Parser.p_arith_expr_return p_arith_expr() throws RecognitionException {
        babel17Parser.p_arith_expr_return retval = new babel17Parser.p_arith_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_plusplus_expr_return p_plusplus_expr470 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:2: ( p_plusplus_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:686:4: p_plusplus_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_plusplus_expr_in_p_arith_expr4695);
            p_plusplus_expr470=p_plusplus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_plusplus_expr470.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:688:1: plusplus_expr : timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* ;
    public final babel17Parser.plusplus_expr_return plusplus_expr() throws RecognitionException {
        babel17Parser.plusplus_expr_return retval = new babel17Parser.plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL472=null;
        Token PLUSPLUS473=null;
        Token MINUSMINUS474=null;
        Token NL475=null;
        babel17Parser.timestimes_expr_return timestimes_expr471 = null;

        babel17Parser.timestimes_expr_return timestimes_expr476 = null;


        CommonTree NL472_tree=null;
        CommonTree PLUSPLUS473_tree=null;
        CommonTree MINUSMINUS474_tree=null;
        CommonTree NL475_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:2: ( timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:4: timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4705);
            timestimes_expr471=timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr471.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:20: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr )*
            loop211:
            do {
                int alt211=2;
                int LA211_0 = input.LA(1);

                if ( (LA211_0==NL) ) {
                    int LA211_1 = input.LA(2);

                    if ( ((LA211_1>=PLUSPLUS && LA211_1<=MINUSMINUS)) ) {
                        alt211=1;
                    }


                }
                else if ( ((LA211_0>=PLUSPLUS && LA211_0<=MINUSMINUS)) ) {
                    alt211=1;
                }


                switch (alt211) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:21: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:23: ( NL )?
            	    int alt208=2;
            	    int LA208_0 = input.LA(1);

            	    if ( (LA208_0==NL) ) {
            	        alt208=1;
            	    }
            	    switch (alt208) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:23: NL
            	            {
            	            NL472=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4708); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:26: ( PLUSPLUS | MINUSMINUS )
            	    int alt209=2;
            	    int LA209_0 = input.LA(1);

            	    if ( (LA209_0==PLUSPLUS) ) {
            	        alt209=1;
            	    }
            	    else if ( (LA209_0==MINUSMINUS) ) {
            	        alt209=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 209, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt209) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:27: PLUSPLUS
            	            {
            	            PLUSPLUS473=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_plusplus_expr4713); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS473_tree = (CommonTree)adaptor.create(PLUSPLUS473);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS473_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:37: MINUSMINUS
            	            {
            	            MINUSMINUS474=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_plusplus_expr4716); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS474_tree = (CommonTree)adaptor.create(MINUSMINUS474);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS474_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:52: ( NL )?
            	    int alt210=2;
            	    int LA210_0 = input.LA(1);

            	    if ( (LA210_0==NL) ) {
            	        alt210=1;
            	    }
            	    switch (alt210) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:689:52: NL
            	            {
            	            NL475=(Token)match(input,NL,FOLLOW_NL_in_plusplus_expr4720); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_timestimes_expr_in_plusplus_expr4724);
            	    timestimes_expr476=timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, timestimes_expr476.getTree());

            	    }
            	    break;

            	default :
            	    break loop211;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:691:1: p_plusplus_expr : p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* ;
    public final babel17Parser.p_plusplus_expr_return p_plusplus_expr() throws RecognitionException {
        babel17Parser.p_plusplus_expr_return retval = new babel17Parser.p_plusplus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL478=null;
        Token PLUSPLUS479=null;
        Token MINUSMINUS480=null;
        Token NL481=null;
        babel17Parser.p_timestimes_expr_return p_timestimes_expr477 = null;

        babel17Parser.p_timestimes_expr_return p_timestimes_expr482 = null;


        CommonTree NL478_tree=null;
        CommonTree PLUSPLUS479_tree=null;
        CommonTree MINUSMINUS480_tree=null;
        CommonTree NL481_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:2: ( p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:4: p_timestimes_expr ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4736);
            p_timestimes_expr477=p_timestimes_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr477.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:22: ( ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr )*
            loop215:
            do {
                int alt215=2;
                int LA215_0 = input.LA(1);

                if ( (LA215_0==NL) ) {
                    int LA215_1 = input.LA(2);

                    if ( ((LA215_1>=PLUSPLUS && LA215_1<=MINUSMINUS)) ) {
                        alt215=1;
                    }


                }
                else if ( ((LA215_0>=PLUSPLUS && LA215_0<=MINUSMINUS)) ) {
                    alt215=1;
                }


                switch (alt215) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:23: ( NL )? ( PLUSPLUS | MINUSMINUS ) ( NL )? p_timestimes_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:25: ( NL )?
            	    int alt212=2;
            	    int LA212_0 = input.LA(1);

            	    if ( (LA212_0==NL) ) {
            	        alt212=1;
            	    }
            	    switch (alt212) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:25: NL
            	            {
            	            NL478=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4739); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:28: ( PLUSPLUS | MINUSMINUS )
            	    int alt213=2;
            	    int LA213_0 = input.LA(1);

            	    if ( (LA213_0==PLUSPLUS) ) {
            	        alt213=1;
            	    }
            	    else if ( (LA213_0==MINUSMINUS) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:29: PLUSPLUS
            	            {
            	            PLUSPLUS479=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_p_plusplus_expr4744); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUSPLUS479_tree = (CommonTree)adaptor.create(PLUSPLUS479);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUSPLUS479_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:39: MINUSMINUS
            	            {
            	            MINUSMINUS480=(Token)match(input,MINUSMINUS,FOLLOW_MINUSMINUS_in_p_plusplus_expr4747); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUSMINUS480_tree = (CommonTree)adaptor.create(MINUSMINUS480);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUSMINUS480_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:54: ( NL )?
            	    int alt214=2;
            	    int LA214_0 = input.LA(1);

            	    if ( (LA214_0==NL) ) {
            	        alt214=1;
            	    }
            	    switch (alt214) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:692:54: NL
            	            {
            	            NL481=(Token)match(input,NL,FOLLOW_NL_in_p_plusplus_expr4751); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_timestimes_expr_in_p_plusplus_expr4755);
            	    p_timestimes_expr482=p_timestimes_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_timestimes_expr482.getTree());

            	    }
            	    break;

            	default :
            	    break loop215;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:695:1: timestimes_expr : simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* ;
    public final babel17Parser.timestimes_expr_return timestimes_expr() throws RecognitionException {
        babel17Parser.timestimes_expr_return retval = new babel17Parser.timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL484=null;
        Token TIMESTIMES485=null;
        Token QUOTIENTQUOTIENT486=null;
        Token NL487=null;
        babel17Parser.simple_expr_return simple_expr483 = null;

        babel17Parser.simple_expr_return simple_expr488 = null;


        CommonTree NL484_tree=null;
        CommonTree TIMESTIMES485_tree=null;
        CommonTree QUOTIENTQUOTIENT486_tree=null;
        CommonTree NL487_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:2: ( simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:4: simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simple_expr_in_timestimes_expr4767);
            simple_expr483=simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr483.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:16: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr )*
            loop219:
            do {
                int alt219=2;
                int LA219_0 = input.LA(1);

                if ( (LA219_0==NL) ) {
                    int LA219_1 = input.LA(2);

                    if ( ((LA219_1>=TIMESTIMES && LA219_1<=QUOTIENTQUOTIENT)) ) {
                        alt219=1;
                    }


                }
                else if ( ((LA219_0>=TIMESTIMES && LA219_0<=QUOTIENTQUOTIENT)) ) {
                    alt219=1;
                }


                switch (alt219) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:17: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:19: ( NL )?
            	    int alt216=2;
            	    int LA216_0 = input.LA(1);

            	    if ( (LA216_0==NL) ) {
            	        alt216=1;
            	    }
            	    switch (alt216) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:19: NL
            	            {
            	            NL484=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4770); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:22: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt217=2;
            	    int LA217_0 = input.LA(1);

            	    if ( (LA217_0==TIMESTIMES) ) {
            	        alt217=1;
            	    }
            	    else if ( (LA217_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:23: TIMESTIMES
            	            {
            	            TIMESTIMES485=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_timestimes_expr4775); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES485_tree = (CommonTree)adaptor.create(TIMESTIMES485);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES485_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:35: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT486=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4778); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT486_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT486);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT486_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:56: ( NL )?
            	    int alt218=2;
            	    int LA218_0 = input.LA(1);

            	    if ( (LA218_0==NL) ) {
            	        alt218=1;
            	    }
            	    switch (alt218) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:696:56: NL
            	            {
            	            NL487=(Token)match(input,NL,FOLLOW_NL_in_timestimes_expr4782); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_simple_expr_in_timestimes_expr4786);
            	    simple_expr488=simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_expr488.getTree());

            	    }
            	    break;

            	default :
            	    break loop219;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:698:1: p_timestimes_expr : p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* ;
    public final babel17Parser.p_timestimes_expr_return p_timestimes_expr() throws RecognitionException {
        babel17Parser.p_timestimes_expr_return retval = new babel17Parser.p_timestimes_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL490=null;
        Token TIMESTIMES491=null;
        Token QUOTIENTQUOTIENT492=null;
        Token NL493=null;
        babel17Parser.p_simple_expr_return p_simple_expr489 = null;

        babel17Parser.p_simple_expr_return p_simple_expr494 = null;


        CommonTree NL490_tree=null;
        CommonTree TIMESTIMES491_tree=null;
        CommonTree QUOTIENTQUOTIENT492_tree=null;
        CommonTree NL493_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:2: ( p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:4: p_simple_expr ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4799);
            p_simple_expr489=p_simple_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr489.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:18: ( ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr )*
            loop223:
            do {
                int alt223=2;
                int LA223_0 = input.LA(1);

                if ( (LA223_0==NL) ) {
                    int LA223_1 = input.LA(2);

                    if ( ((LA223_1>=TIMESTIMES && LA223_1<=QUOTIENTQUOTIENT)) ) {
                        alt223=1;
                    }


                }
                else if ( ((LA223_0>=TIMESTIMES && LA223_0<=QUOTIENTQUOTIENT)) ) {
                    alt223=1;
                }


                switch (alt223) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:19: ( NL )? ( TIMESTIMES | QUOTIENTQUOTIENT ) ( NL )? p_simple_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:21: ( NL )?
            	    int alt220=2;
            	    int LA220_0 = input.LA(1);

            	    if ( (LA220_0==NL) ) {
            	        alt220=1;
            	    }
            	    switch (alt220) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:21: NL
            	            {
            	            NL490=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4802); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:24: ( TIMESTIMES | QUOTIENTQUOTIENT )
            	    int alt221=2;
            	    int LA221_0 = input.LA(1);

            	    if ( (LA221_0==TIMESTIMES) ) {
            	        alt221=1;
            	    }
            	    else if ( (LA221_0==QUOTIENTQUOTIENT) ) {
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
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:25: TIMESTIMES
            	            {
            	            TIMESTIMES491=(Token)match(input,TIMESTIMES,FOLLOW_TIMESTIMES_in_p_timestimes_expr4807); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            TIMESTIMES491_tree = (CommonTree)adaptor.create(TIMESTIMES491);
            	            root_0 = (CommonTree)adaptor.becomeRoot(TIMESTIMES491_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:37: QUOTIENTQUOTIENT
            	            {
            	            QUOTIENTQUOTIENT492=(Token)match(input,QUOTIENTQUOTIENT,FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4810); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            QUOTIENTQUOTIENT492_tree = (CommonTree)adaptor.create(QUOTIENTQUOTIENT492);
            	            root_0 = (CommonTree)adaptor.becomeRoot(QUOTIENTQUOTIENT492_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:58: ( NL )?
            	    int alt222=2;
            	    int LA222_0 = input.LA(1);

            	    if ( (LA222_0==NL) ) {
            	        alt222=1;
            	    }
            	    switch (alt222) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:699:58: NL
            	            {
            	            NL493=(Token)match(input,NL,FOLLOW_NL_in_p_timestimes_expr4814); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_simple_expr_in_p_timestimes_expr4818);
            	    p_simple_expr494=p_simple_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_simple_expr494.getTree());

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
    // $ANTLR end "p_timestimes_expr"

    public static class simple_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_expr"
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:701:1: simple_expr : cons_expr ;
    public final babel17Parser.simple_expr_return simple_expr() throws RecognitionException {
        babel17Parser.simple_expr_return retval = new babel17Parser.simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.cons_expr_return cons_expr495 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:2: ( cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:702:4: cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_cons_expr_in_simple_expr4829);
            cons_expr495=cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cons_expr495.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:704:1: p_simple_expr : p_cons_expr ;
    public final babel17Parser.p_simple_expr_return p_simple_expr() throws RecognitionException {
        babel17Parser.p_simple_expr_return retval = new babel17Parser.p_simple_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.p_cons_expr_return p_cons_expr496 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:2: ( p_cons_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:705:4: p_cons_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_cons_expr_in_p_simple_expr4838);
            p_cons_expr496=p_cons_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_cons_expr496.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:707:1: cons_expr : to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) ;
    public final babel17Parser.cons_expr_return cons_expr() throws RecognitionException {
        babel17Parser.cons_expr_return retval = new babel17Parser.cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL498=null;
        Token NL500=null;
        babel17Parser.to_expr_return to_expr497 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON499 = null;

        babel17Parser.to_expr_return to_expr501 = null;


        CommonTree NL498_tree=null;
        CommonTree NL500_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        RewriteRuleSubtreeStream stream_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule to_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:2: ( to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )* -> ^( LIST_CONS ( to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:4: to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            {
            pushFollow(FOLLOW_to_expr_in_cons_expr4847);
            to_expr497=to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_to_expr.add(to_expr497.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:12: ( ( NL )? token_DOUBLE_COLON ( NL )? to_expr )*
            loop226:
            do {
                int alt226=2;
                int LA226_0 = input.LA(1);

                if ( (LA226_0==NL) ) {
                    int LA226_1 = input.LA(2);

                    if ( ((LA226_1>=A_DOUBLE_COLON && LA226_1<=U_DOUBLE_COLON)) ) {
                        alt226=1;
                    }


                }
                else if ( ((LA226_0>=A_DOUBLE_COLON && LA226_0<=U_DOUBLE_COLON)) ) {
                    alt226=1;
                }


                switch (alt226) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:13: ( NL )? token_DOUBLE_COLON ( NL )? to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:13: ( NL )?
            	    int alt224=2;
            	    int LA224_0 = input.LA(1);

            	    if ( (LA224_0==NL) ) {
            	        alt224=1;
            	    }
            	    switch (alt224) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:13: NL
            	            {
            	            NL498=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4850); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL498);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_cons_expr4853);
            	    token_DOUBLE_COLON499=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON499.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:36: ( NL )?
            	    int alt225=2;
            	    int LA225_0 = input.LA(1);

            	    if ( (LA225_0==NL) ) {
            	        alt225=1;
            	    }
            	    switch (alt225) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:36: NL
            	            {
            	            NL500=(Token)match(input,NL,FOLLOW_NL_in_cons_expr4855); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL500);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_to_expr_in_cons_expr4858);
            	    to_expr501=to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_to_expr.add(to_expr501.getTree());

            	    }
            	    break;

            	default :
            	    break loop226;
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
            // 708:50: -> ^( LIST_CONS ( to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:53: ^( LIST_CONS ( to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:708:65: ( to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:710:1: p_cons_expr : p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) ;
    public final babel17Parser.p_cons_expr_return p_cons_expr() throws RecognitionException {
        babel17Parser.p_cons_expr_return retval = new babel17Parser.p_cons_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL503=null;
        Token NL505=null;
        babel17Parser.p_to_expr_return p_to_expr502 = null;

        babel17Parser.token_DOUBLE_COLON_return token_DOUBLE_COLON504 = null;

        babel17Parser.p_to_expr_return p_to_expr506 = null;


        CommonTree NL503_tree=null;
        CommonTree NL505_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_to_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_to_expr");
        RewriteRuleSubtreeStream stream_token_DOUBLE_COLON=new RewriteRuleSubtreeStream(adaptor,"rule token_DOUBLE_COLON");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:2: ( p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )* -> ^( LIST_CONS ( p_to_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:4: p_to_expr ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            {
            pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4878);
            p_to_expr502=p_to_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr502.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:14: ( ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr )*
            loop229:
            do {
                int alt229=2;
                int LA229_0 = input.LA(1);

                if ( (LA229_0==NL) ) {
                    int LA229_1 = input.LA(2);

                    if ( ((LA229_1>=A_DOUBLE_COLON && LA229_1<=U_DOUBLE_COLON)) ) {
                        alt229=1;
                    }


                }
                else if ( ((LA229_0>=A_DOUBLE_COLON && LA229_0<=U_DOUBLE_COLON)) ) {
                    alt229=1;
                }


                switch (alt229) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:15: ( NL )? token_DOUBLE_COLON ( NL )? p_to_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:15: ( NL )?
            	    int alt227=2;
            	    int LA227_0 = input.LA(1);

            	    if ( (LA227_0==NL) ) {
            	        alt227=1;
            	    }
            	    switch (alt227) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:15: NL
            	            {
            	            NL503=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4881); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL503);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4884);
            	    token_DOUBLE_COLON504=token_DOUBLE_COLON();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_token_DOUBLE_COLON.add(token_DOUBLE_COLON504.getTree());
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:38: ( NL )?
            	    int alt228=2;
            	    int LA228_0 = input.LA(1);

            	    if ( (LA228_0==NL) ) {
            	        alt228=1;
            	    }
            	    switch (alt228) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:38: NL
            	            {
            	            NL505=(Token)match(input,NL,FOLLOW_NL_in_p_cons_expr4886); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL505);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_to_expr_in_p_cons_expr4889);
            	    p_to_expr506=p_to_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_to_expr.add(p_to_expr506.getTree());

            	    }
            	    break;

            	default :
            	    break loop229;
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
            // 711:54: -> ^( LIST_CONS ( p_to_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:57: ^( LIST_CONS ( p_to_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LIST_CONS, "LIST_CONS"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:711:69: ( p_to_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:1: to_expr : arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? ;
    public final babel17Parser.to_expr_return to_expr() throws RecognitionException {
        babel17Parser.to_expr_return retval = new babel17Parser.to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL508=null;
        Token L_to509=null;
        Token L_downto510=null;
        Token NL511=null;
        babel17Parser.arith_plus_expr_return arith_plus_expr507 = null;

        babel17Parser.arith_plus_expr_return arith_plus_expr512 = null;


        CommonTree NL508_tree=null;
        CommonTree L_to509_tree=null;
        CommonTree L_downto510_tree=null;
        CommonTree NL511_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:9: ( arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:11: arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_plus_expr_in_to_expr4909);
            arith_plus_expr507=arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr507.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:27: ( ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==NL) ) {
                int LA233_1 = input.LA(2);

                if ( ((LA233_1>=L_to && LA233_1<=L_downto)) ) {
                    alt233=1;
                }
            }
            else if ( ((LA233_0>=L_to && LA233_0<=L_downto)) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:28: ( NL )? ( L_to | L_downto ) ( NL )? arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:30: ( NL )?
                    int alt230=2;
                    int LA230_0 = input.LA(1);

                    if ( (LA230_0==NL) ) {
                        alt230=1;
                    }
                    switch (alt230) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:30: NL
                            {
                            NL508=(Token)match(input,NL,FOLLOW_NL_in_to_expr4912); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:33: ( L_to | L_downto )
                    int alt231=2;
                    int LA231_0 = input.LA(1);

                    if ( (LA231_0==L_to) ) {
                        alt231=1;
                    }
                    else if ( (LA231_0==L_downto) ) {
                        alt231=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 231, 0, input);

                        throw nvae;
                    }
                    switch (alt231) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:34: L_to
                            {
                            L_to509=(Token)match(input,L_to,FOLLOW_L_to_in_to_expr4917); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to509_tree = (CommonTree)adaptor.create(L_to509);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to509_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:41: L_downto
                            {
                            L_downto510=(Token)match(input,L_downto,FOLLOW_L_downto_in_to_expr4921); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto510_tree = (CommonTree)adaptor.create(L_downto510);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto510_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:54: ( NL )?
                    int alt232=2;
                    int LA232_0 = input.LA(1);

                    if ( (LA232_0==NL) ) {
                        alt232=1;
                    }
                    switch (alt232) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:714:54: NL
                            {
                            NL511=(Token)match(input,NL,FOLLOW_NL_in_to_expr4925); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_plus_expr_in_to_expr4929);
                    arith_plus_expr512=arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_plus_expr512.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:716:1: p_to_expr : p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? ;
    public final babel17Parser.p_to_expr_return p_to_expr() throws RecognitionException {
        babel17Parser.p_to_expr_return retval = new babel17Parser.p_to_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL514=null;
        Token L_to515=null;
        Token L_downto516=null;
        Token NL517=null;
        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr513 = null;

        babel17Parser.p_arith_plus_expr_return p_arith_plus_expr518 = null;


        CommonTree NL514_tree=null;
        CommonTree L_to515_tree=null;
        CommonTree L_downto516_tree=null;
        CommonTree NL517_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:2: ( p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )? )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:4: p_arith_plus_expr ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4942);
            p_arith_plus_expr513=p_arith_plus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr513.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:22: ( ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr )?
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==NL) ) {
                int LA237_1 = input.LA(2);

                if ( ((LA237_1>=L_to && LA237_1<=L_downto)) ) {
                    alt237=1;
                }
            }
            else if ( ((LA237_0>=L_to && LA237_0<=L_downto)) ) {
                alt237=1;
            }
            switch (alt237) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:23: ( NL )? ( L_to | L_downto ) ( NL )? p_arith_plus_expr
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:25: ( NL )?
                    int alt234=2;
                    int LA234_0 = input.LA(1);

                    if ( (LA234_0==NL) ) {
                        alt234=1;
                    }
                    switch (alt234) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:25: NL
                            {
                            NL514=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4945); if (state.failed) return retval;

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:28: ( L_to | L_downto )
                    int alt235=2;
                    int LA235_0 = input.LA(1);

                    if ( (LA235_0==L_to) ) {
                        alt235=1;
                    }
                    else if ( (LA235_0==L_downto) ) {
                        alt235=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 235, 0, input);

                        throw nvae;
                    }
                    switch (alt235) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:29: L_to
                            {
                            L_to515=(Token)match(input,L_to,FOLLOW_L_to_in_p_to_expr4950); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_to515_tree = (CommonTree)adaptor.create(L_to515);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_to515_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:36: L_downto
                            {
                            L_downto516=(Token)match(input,L_downto,FOLLOW_L_downto_in_p_to_expr4954); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            L_downto516_tree = (CommonTree)adaptor.create(L_downto516);
                            root_0 = (CommonTree)adaptor.becomeRoot(L_downto516_tree, root_0);
                            }

                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:49: ( NL )?
                    int alt236=2;
                    int LA236_0 = input.LA(1);

                    if ( (LA236_0==NL) ) {
                        alt236=1;
                    }
                    switch (alt236) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:717:49: NL
                            {
                            NL517=(Token)match(input,NL,FOLLOW_NL_in_p_to_expr4958); if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_plus_expr_in_p_to_expr4962);
                    p_arith_plus_expr518=p_arith_plus_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_plus_expr518.getTree());

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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:719:1: arith_plus_expr : arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* ;
    public final babel17Parser.arith_plus_expr_return arith_plus_expr() throws RecognitionException {
        babel17Parser.arith_plus_expr_return retval = new babel17Parser.arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL520=null;
        Token PLUS521=null;
        Token MINUS522=null;
        Token NL523=null;
        babel17Parser.arith_uminus_expr_return arith_uminus_expr519 = null;

        babel17Parser.arith_uminus_expr_return arith_uminus_expr524 = null;


        CommonTree NL520_tree=null;
        CommonTree PLUS521_tree=null;
        CommonTree MINUS522_tree=null;
        CommonTree NL523_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:2: ( arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:4: arith_uminus_expr ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4974);
            arith_uminus_expr519=arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr519.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:22: ( ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr )*
            loop241:
            do {
                int alt241=2;
                int LA241_0 = input.LA(1);

                if ( (LA241_0==NL) ) {
                    int LA241_1 = input.LA(2);

                    if ( (LA241_1==PLUS) ) {
                        alt241=1;
                    }


                }
                else if ( ((LA241_0>=PLUS && LA241_0<=MINUS)) ) {
                    alt241=1;
                }


                switch (alt241) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:23: ( ( NL )? PLUS | MINUS ) ( NL )? arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:23: ( ( NL )? PLUS | MINUS )
            	    int alt239=2;
            	    int LA239_0 = input.LA(1);

            	    if ( (LA239_0==PLUS||LA239_0==NL) ) {
            	        alt239=1;
            	    }
            	    else if ( (LA239_0==MINUS) ) {
            	        alt239=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 239, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt239) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:24: ( NL )? PLUS
            	            {
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:26: ( NL )?
            	            int alt238=2;
            	            int LA238_0 = input.LA(1);

            	            if ( (LA238_0==NL) ) {
            	                alt238=1;
            	            }
            	            switch (alt238) {
            	                case 1 :
            	                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:26: NL
            	                    {
            	                    NL520=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4978); if (state.failed) return retval;

            	                    }
            	                    break;

            	            }

            	            PLUS521=(Token)match(input,PLUS,FOLLOW_PLUS_in_arith_plus_expr4982); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS521_tree = (CommonTree)adaptor.create(PLUS521);
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS521_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:37: MINUS
            	            {
            	            MINUS522=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_plus_expr4987); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS522_tree = (CommonTree)adaptor.create(MINUS522);
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS522_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:47: ( NL )?
            	    int alt240=2;
            	    int LA240_0 = input.LA(1);

            	    if ( (LA240_0==NL) ) {
            	        alt240=1;
            	    }
            	    switch (alt240) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:720:47: NL
            	            {
            	            NL523=(Token)match(input,NL,FOLLOW_NL_in_arith_plus_expr4991); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_uminus_expr_in_arith_plus_expr4995);
            	    arith_uminus_expr524=arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_uminus_expr524.getTree());

            	    }
            	    break;

            	default :
            	    break loop241;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:722:1: p_arith_plus_expr : p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* ;
    public final babel17Parser.p_arith_plus_expr_return p_arith_plus_expr() throws RecognitionException {
        babel17Parser.p_arith_plus_expr_return retval = new babel17Parser.p_arith_plus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL526=null;
        Token set527=null;
        Token NL528=null;
        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr525 = null;

        babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr529 = null;


        CommonTree NL526_tree=null;
        CommonTree set527_tree=null;
        CommonTree NL528_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:2: ( p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:4: p_arith_uminus_expr ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr5006);
            p_arith_uminus_expr525=p_arith_uminus_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr525.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:24: ( ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr )*
            loop244:
            do {
                int alt244=2;
                int LA244_0 = input.LA(1);

                if ( (LA244_0==NL) ) {
                    int LA244_1 = input.LA(2);

                    if ( ((LA244_1>=PLUS && LA244_1<=MINUS)) ) {
                        alt244=1;
                    }


                }
                else if ( ((LA244_0>=PLUS && LA244_0<=MINUS)) ) {
                    alt244=1;
                }


                switch (alt244) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:25: ( NL )? ( PLUS | MINUS ) ( NL )? p_arith_uminus_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:27: ( NL )?
            	    int alt242=2;
            	    int LA242_0 = input.LA(1);

            	    if ( (LA242_0==NL) ) {
            	        alt242=1;
            	    }
            	    switch (alt242) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:27: NL
            	            {
            	            NL526=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr5009); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set527=(Token)input.LT(1);
            	    set527=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set527), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:48: ( NL )?
            	    int alt243=2;
            	    int LA243_0 = input.LA(1);

            	    if ( (LA243_0==NL) ) {
            	        alt243=1;
            	    }
            	    switch (alt243) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:723:48: NL
            	            {
            	            NL528=(Token)match(input,NL,FOLLOW_NL_in_p_arith_plus_expr5022); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr5026);
            	    p_arith_uminus_expr529=p_arith_uminus_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_uminus_expr529.getTree());

            	    }
            	    break;

            	default :
            	    break loop244;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:725:1: arith_uminus_expr : ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr );
    public final babel17Parser.arith_uminus_expr_return arith_uminus_expr() throws RecognitionException {
        babel17Parser.arith_uminus_expr_return retval = new babel17Parser.arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS530=null;
        Token NL531=null;
        babel17Parser.arith_mult_expr_return arith_mult_expr532 = null;

        babel17Parser.arith_mult_expr_return arith_mult_expr533 = null;


        CommonTree MINUS530_tree=null;
        CommonTree NL531_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:2: ( MINUS ( NL )? arith_mult_expr -> ^( UMINUS arith_mult_expr ) | arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:4: MINUS ( NL )? arith_mult_expr
                    {
                    MINUS530=(Token)match(input,MINUS,FOLLOW_MINUS_in_arith_uminus_expr5039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS530);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:10: ( NL )?
                    int alt245=2;
                    int LA245_0 = input.LA(1);

                    if ( (LA245_0==NL) ) {
                        alt245=1;
                    }
                    switch (alt245) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:10: NL
                            {
                            NL531=(Token)match(input,NL,FOLLOW_NL_in_arith_uminus_expr5041); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL531);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr5044);
                    arith_mult_expr532=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arith_mult_expr.add(arith_mult_expr532.getTree());


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
                    // 726:30: -> ^( UMINUS arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:726:33: ^( UMINUS arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:727:4: arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arith_mult_expr_in_arith_uminus_expr5057);
                    arith_mult_expr533=arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_mult_expr533.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:729:1: p_arith_uminus_expr : ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr );
    public final babel17Parser.p_arith_uminus_expr_return p_arith_uminus_expr() throws RecognitionException {
        babel17Parser.p_arith_uminus_expr_return retval = new babel17Parser.p_arith_uminus_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MINUS534=null;
        Token NL535=null;
        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr536 = null;

        babel17Parser.p_arith_mult_expr_return p_arith_mult_expr537 = null;


        CommonTree MINUS534_tree=null;
        CommonTree NL535_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_p_arith_mult_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_arith_mult_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:2: ( MINUS ( NL )? p_arith_mult_expr -> ^( UMINUS p_arith_mult_expr ) | p_arith_mult_expr )
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==MINUS) ) {
                alt248=1;
            }
            else if ( (LA248_0==L_begin||(LA248_0>=L_with && LA248_0<=L_if)||(LA248_0>=L_while && LA248_0<=L_for)||LA248_0==L_match||LA248_0==L_try||(LA248_0>=A_infinity && LA248_0<=U_infinity)||(LA248_0>=L_true && LA248_0<=L_this)||LA248_0==L_nil||(LA248_0>=Constr && LA248_0<=Num)||(LA248_0>=String && LA248_0<=ROUND_BRACKET_OPEN)||LA248_0==SQUARE_BRACKET_OPEN||LA248_0==CURLY_BRACKET_OPEN) ) {
                alt248=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 248, 0, input);

                throw nvae;
            }
            switch (alt248) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:4: MINUS ( NL )? p_arith_mult_expr
                    {
                    MINUS534=(Token)match(input,MINUS,FOLLOW_MINUS_in_p_arith_uminus_expr5068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS534);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:10: ( NL )?
                    int alt247=2;
                    int LA247_0 = input.LA(1);

                    if ( (LA247_0==NL) ) {
                        alt247=1;
                    }
                    switch (alt247) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:10: NL
                            {
                            NL535=(Token)match(input,NL,FOLLOW_NL_in_p_arith_uminus_expr5070); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL535);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5073);
                    p_arith_mult_expr536=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_p_arith_mult_expr.add(p_arith_mult_expr536.getTree());


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
                    // 730:32: -> ^( UMINUS p_arith_mult_expr )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:730:35: ^( UMINUS p_arith_mult_expr )
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:731:4: p_arith_mult_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5086);
                    p_arith_mult_expr537=p_arith_mult_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_mult_expr537.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:733:1: arith_mult_expr : arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* ;
    public final babel17Parser.arith_mult_expr_return arith_mult_expr() throws RecognitionException {
        babel17Parser.arith_mult_expr_return retval = new babel17Parser.arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL539=null;
        Token set540=null;
        Token NL541=null;
        babel17Parser.arith_pow_expr_return arith_pow_expr538 = null;

        babel17Parser.arith_pow_expr_return arith_pow_expr542 = null;


        CommonTree NL539_tree=null;
        CommonTree set540_tree=null;
        CommonTree NL541_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:2: ( arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:4: arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr5095);
            arith_pow_expr538=arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr538.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:19: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr )*
            loop251:
            do {
                int alt251=2;
                int LA251_0 = input.LA(1);

                if ( (LA251_0==NL) ) {
                    int LA251_1 = input.LA(2);

                    if ( ((LA251_1>=L_div && LA251_1<=L_mod)||(LA251_1>=TIMES && LA251_1<=QUOTIENT)) ) {
                        alt251=1;
                    }


                }
                else if ( ((LA251_0>=L_div && LA251_0<=L_mod)||(LA251_0>=TIMES && LA251_0<=QUOTIENT)) ) {
                    alt251=1;
                }


                switch (alt251) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:20: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:22: ( NL )?
            	    int alt249=2;
            	    int LA249_0 = input.LA(1);

            	    if ( (LA249_0==NL) ) {
            	        alt249=1;
            	    }
            	    switch (alt249) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:22: NL
            	            {
            	            NL539=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr5098); if (state.failed) return retval;

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

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:63: ( NL )?
            	    int alt250=2;
            	    int LA250_0 = input.LA(1);

            	    if ( (LA250_0==NL) ) {
            	        alt250=1;
            	    }
            	    switch (alt250) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:734:63: NL
            	            {
            	            NL541=(Token)match(input,NL,FOLLOW_NL_in_arith_mult_expr5119); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_arith_pow_expr_in_arith_mult_expr5123);
            	    arith_pow_expr542=arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, arith_pow_expr542.getTree());

            	    }
            	    break;

            	default :
            	    break loop251;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:736:1: p_arith_mult_expr : p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* ;
    public final babel17Parser.p_arith_mult_expr_return p_arith_mult_expr() throws RecognitionException {
        babel17Parser.p_arith_mult_expr_return retval = new babel17Parser.p_arith_mult_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL544=null;
        Token set545=null;
        Token NL546=null;
        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr543 = null;

        babel17Parser.p_arith_pow_expr_return p_arith_pow_expr547 = null;


        CommonTree NL544_tree=null;
        CommonTree set545_tree=null;
        CommonTree NL546_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:2: ( p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )* )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:4: p_arith_pow_expr ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5135);
            p_arith_pow_expr543=p_arith_pow_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr543.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:21: ( ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr )*
            loop254:
            do {
                int alt254=2;
                int LA254_0 = input.LA(1);

                if ( (LA254_0==NL) ) {
                    int LA254_1 = input.LA(2);

                    if ( ((LA254_1>=L_div && LA254_1<=L_mod)||(LA254_1>=TIMES && LA254_1<=QUOTIENT)) ) {
                        alt254=1;
                    }


                }
                else if ( ((LA254_0>=L_div && LA254_0<=L_mod)||(LA254_0>=TIMES && LA254_0<=QUOTIENT)) ) {
                    alt254=1;
                }


                switch (alt254) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:22: ( NL )? ( TIMES | QUOTIENT | L_div | L_mod ) ( NL )? p_arith_pow_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:24: ( NL )?
            	    int alt252=2;
            	    int LA252_0 = input.LA(1);

            	    if ( (LA252_0==NL) ) {
            	        alt252=1;
            	    }
            	    switch (alt252) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:24: NL
            	            {
            	            NL544=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr5138); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    set545=(Token)input.LT(1);
            	    set545=(Token)input.LT(1);
            	    if ( (input.LA(1)>=L_div && input.LA(1)<=L_mod)||(input.LA(1)>=TIMES && input.LA(1)<=QUOTIENT) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set545), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:65: ( NL )?
            	    int alt253=2;
            	    int LA253_0 = input.LA(1);

            	    if ( (LA253_0==NL) ) {
            	        alt253=1;
            	    }
            	    switch (alt253) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:737:65: NL
            	            {
            	            NL546=(Token)match(input,NL,FOLLOW_NL_in_p_arith_mult_expr5159); if (state.failed) return retval;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5163);
            	    p_arith_pow_expr547=p_arith_pow_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, p_arith_pow_expr547.getTree());

            	    }
            	    break;

            	default :
            	    break loop254;
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:739:1: arith_pow_expr : apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) ;
    public final babel17Parser.arith_pow_expr_return arith_pow_expr() throws RecognitionException {
        babel17Parser.arith_pow_expr_return retval = new babel17Parser.arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL549=null;
        Token POW_tok550=null;
        Token NL551=null;
        babel17Parser.apply_expr_return apply_expr548 = null;

        babel17Parser.apply_expr_return apply_expr552 = null;


        CommonTree NL549_tree=null;
        CommonTree POW_tok550_tree=null;
        CommonTree NL551_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:2: ( apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )* -> ^( POW ( apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:4: apply_expr ( ( NL )? POW_tok ( NL )? apply_expr )*
            {
            pushFollow(FOLLOW_apply_expr_in_arith_pow_expr5174);
            apply_expr548=apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr548.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:15: ( ( NL )? POW_tok ( NL )? apply_expr )*
            loop257:
            do {
                int alt257=2;
                int LA257_0 = input.LA(1);

                if ( (LA257_0==NL) ) {
                    int LA257_1 = input.LA(2);

                    if ( (LA257_1==POW_tok) ) {
                        alt257=1;
                    }


                }
                else if ( (LA257_0==POW_tok) ) {
                    alt257=1;
                }


                switch (alt257) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:16: ( NL )? POW_tok ( NL )? apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:16: ( NL )?
            	    int alt255=2;
            	    int LA255_0 = input.LA(1);

            	    if ( (LA255_0==NL) ) {
            	        alt255=1;
            	    }
            	    switch (alt255) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:16: NL
            	            {
            	            NL549=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr5177); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL549);


            	            }
            	            break;

            	    }

            	    POW_tok550=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_arith_pow_expr5180); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok550);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:28: ( NL )?
            	    int alt256=2;
            	    int LA256_0 = input.LA(1);

            	    if ( (LA256_0==NL) ) {
            	        alt256=1;
            	    }
            	    switch (alt256) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:28: NL
            	            {
            	            NL551=(Token)match(input,NL,FOLLOW_NL_in_arith_pow_expr5182); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL551);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_apply_expr_in_arith_pow_expr5185);
            	    apply_expr552=apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_apply_expr.add(apply_expr552.getTree());

            	    }
            	    break;

            	default :
            	    break loop257;
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
            // 740:45: -> ^( POW ( apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:48: ^( POW ( apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:740:54: ( apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:742:1: p_arith_pow_expr : p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) ;
    public final babel17Parser.p_arith_pow_expr_return p_arith_pow_expr() throws RecognitionException {
        babel17Parser.p_arith_pow_expr_return retval = new babel17Parser.p_arith_pow_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL554=null;
        Token POW_tok555=null;
        Token NL556=null;
        babel17Parser.p_apply_expr_return p_apply_expr553 = null;

        babel17Parser.p_apply_expr_return p_apply_expr557 = null;


        CommonTree NL554_tree=null;
        CommonTree POW_tok555_tree=null;
        CommonTree NL556_tree=null;
        RewriteRuleTokenStream stream_POW_tok=new RewriteRuleTokenStream(adaptor,"token POW_tok");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_apply_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_apply_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:2: ( p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )* -> ^( POW ( p_apply_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:4: p_apply_expr ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            {
            pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr5206);
            p_apply_expr553=p_apply_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr553.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:17: ( ( NL )? POW_tok ( NL )? p_apply_expr )*
            loop260:
            do {
                int alt260=2;
                int LA260_0 = input.LA(1);

                if ( (LA260_0==NL) ) {
                    int LA260_1 = input.LA(2);

                    if ( (LA260_1==POW_tok) ) {
                        alt260=1;
                    }


                }
                else if ( (LA260_0==POW_tok) ) {
                    alt260=1;
                }


                switch (alt260) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:18: ( NL )? POW_tok ( NL )? p_apply_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:18: ( NL )?
            	    int alt258=2;
            	    int LA258_0 = input.LA(1);

            	    if ( (LA258_0==NL) ) {
            	        alt258=1;
            	    }
            	    switch (alt258) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:18: NL
            	            {
            	            NL554=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5209); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL554);


            	            }
            	            break;

            	    }

            	    POW_tok555=(Token)match(input,POW_tok,FOLLOW_POW_tok_in_p_arith_pow_expr5212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_POW_tok.add(POW_tok555);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:30: ( NL )?
            	    int alt259=2;
            	    int LA259_0 = input.LA(1);

            	    if ( (LA259_0==NL) ) {
            	        alt259=1;
            	    }
            	    switch (alt259) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:30: NL
            	            {
            	            NL556=(Token)match(input,NL,FOLLOW_NL_in_p_arith_pow_expr5214); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL556);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_apply_expr_in_p_arith_pow_expr5217);
            	    p_apply_expr557=p_apply_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_apply_expr.add(p_apply_expr557.getTree());

            	    }
            	    break;

            	default :
            	    break loop260;
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
            // 743:49: -> ^( POW ( p_apply_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:52: ^( POW ( p_apply_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POW, "POW"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:743:58: ( p_apply_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:745:1: apply_expr : ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) ;
    public final babel17Parser.apply_expr_return apply_expr() throws RecognitionException {
        babel17Parser.apply_expr_return retval = new babel17Parser.apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.basic_expr_return basic_expr558 = null;


        RewriteRuleSubtreeStream stream_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:2: ( ( basic_expr )+ -> ^( APPLY ( basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:4: ( basic_expr )+
            {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:4: ( basic_expr )+
            int cnt261=0;
            loop261:
            do {
                int alt261=2;
                int LA261_0 = input.LA(1);

                if ( (LA261_0==L_begin||(LA261_0>=L_with && LA261_0<=L_if)||(LA261_0>=L_while && LA261_0<=L_for)||LA261_0==L_match||LA261_0==L_try||(LA261_0>=A_infinity && LA261_0<=U_infinity)||(LA261_0>=L_true && LA261_0<=L_this)||LA261_0==L_nil||(LA261_0>=Constr && LA261_0<=Num)||(LA261_0>=String && LA261_0<=ROUND_BRACKET_OPEN)||LA261_0==SQUARE_BRACKET_OPEN||LA261_0==CURLY_BRACKET_OPEN) ) {
                    alt261=1;
                }


                switch (alt261) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:4: basic_expr
            	    {
            	    pushFollow(FOLLOW_basic_expr_in_apply_expr5238);
            	    basic_expr558=basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_basic_expr.add(basic_expr558.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt261 >= 1 ) break loop261;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(261, input);
                        throw eee;
                }
                cnt261++;
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
            // 746:16: -> ^( APPLY ( basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:19: ^( APPLY ( basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:746:27: ( basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:747:1: p_apply_expr : p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) ;
    public final babel17Parser.p_apply_expr_return p_apply_expr() throws RecognitionException {
        babel17Parser.p_apply_expr_return retval = new babel17Parser.p_apply_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL560=null;
        babel17Parser.p_basic_expr_return p_basic_expr559 = null;

        babel17Parser.p_basic_expr_return p_basic_expr561 = null;


        CommonTree NL560_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_p_basic_expr=new RewriteRuleSubtreeStream(adaptor,"rule p_basic_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:2: ( p_basic_expr ( ( NL )? p_basic_expr )* -> ^( APPLY ( p_basic_expr )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:4: p_basic_expr ( ( NL )? p_basic_expr )*
            {
            pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5256);
            p_basic_expr559=p_basic_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr559.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:17: ( ( NL )? p_basic_expr )*
            loop263:
            do {
                int alt263=2;
                int LA263_0 = input.LA(1);

                if ( (LA263_0==NL) ) {
                    int LA263_1 = input.LA(2);

                    if ( (LA263_1==L_begin||(LA263_1>=L_with && LA263_1<=L_if)||(LA263_1>=L_while && LA263_1<=L_for)||LA263_1==L_match||LA263_1==L_try||(LA263_1>=A_infinity && LA263_1<=U_infinity)||(LA263_1>=L_true && LA263_1<=L_this)||LA263_1==L_nil||(LA263_1>=Constr && LA263_1<=Num)||(LA263_1>=String && LA263_1<=ROUND_BRACKET_OPEN)||LA263_1==SQUARE_BRACKET_OPEN||LA263_1==CURLY_BRACKET_OPEN) ) {
                        alt263=1;
                    }


                }
                else if ( (LA263_0==L_begin||(LA263_0>=L_with && LA263_0<=L_if)||(LA263_0>=L_while && LA263_0<=L_for)||LA263_0==L_match||LA263_0==L_try||(LA263_0>=A_infinity && LA263_0<=U_infinity)||(LA263_0>=L_true && LA263_0<=L_this)||LA263_0==L_nil||(LA263_0>=Constr && LA263_0<=Num)||(LA263_0>=String && LA263_0<=ROUND_BRACKET_OPEN)||LA263_0==SQUARE_BRACKET_OPEN||LA263_0==CURLY_BRACKET_OPEN) ) {
                    alt263=1;
                }


                switch (alt263) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:18: ( NL )? p_basic_expr
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:18: ( NL )?
            	    int alt262=2;
            	    int LA262_0 = input.LA(1);

            	    if ( (LA262_0==NL) ) {
            	        alt262=1;
            	    }
            	    switch (alt262) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:18: NL
            	            {
            	            NL560=(Token)match(input,NL,FOLLOW_NL_in_p_apply_expr5259); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL560);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_p_basic_expr_in_p_apply_expr5262);
            	    p_basic_expr561=p_basic_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_p_basic_expr.add(p_basic_expr561.getTree());

            	    }
            	    break;

            	default :
            	    break loop263;
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
            // 748:37: -> ^( APPLY ( p_basic_expr )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:40: ^( APPLY ( p_basic_expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPLY, "APPLY"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:748:48: ( p_basic_expr )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:750:1: basic_expr : message_send_expr ;
    public final babel17Parser.basic_expr_return basic_expr() throws RecognitionException {
        babel17Parser.basic_expr_return retval = new babel17Parser.basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr562 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:751:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_basic_expr5282);
            message_send_expr562=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr562.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:753:1: p_basic_expr : message_send_expr ;
    public final babel17Parser.p_basic_expr_return p_basic_expr() throws RecognitionException {
        babel17Parser.p_basic_expr_return retval = new babel17Parser.p_basic_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        babel17Parser.message_send_expr_return message_send_expr563 = null;



        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:754:2: ( message_send_expr )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:754:4: message_send_expr
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_message_send_expr_in_p_basic_expr5291);
            message_send_expr563=message_send_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, message_send_expr563.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:756:1: message_send_expr : primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) ;
    public final babel17Parser.message_send_expr_return message_send_expr() throws RecognitionException {
        babel17Parser.message_send_expr_return retval = new babel17Parser.message_send_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL565=null;
        Token PERIOD566=null;
        Token NL567=null;
        Token Id568=null;
        babel17Parser.primitive_expr_return primitive_expr564 = null;


        CommonTree NL565_tree=null;
        CommonTree PERIOD566_tree=null;
        CommonTree NL567_tree=null;
        CommonTree Id568_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_Id=new RewriteRuleTokenStream(adaptor,"token Id");
        RewriteRuleSubtreeStream stream_primitive_expr=new RewriteRuleSubtreeStream(adaptor,"rule primitive_expr");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:2: ( primitive_expr ( ( NL )? PERIOD ( NL )? Id )* -> ^( MESSAGE_SEND primitive_expr ( Id )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:4: primitive_expr ( ( NL )? PERIOD ( NL )? Id )*
            {
            pushFollow(FOLLOW_primitive_expr_in_message_send_expr5300);
            primitive_expr564=primitive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primitive_expr.add(primitive_expr564.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:19: ( ( NL )? PERIOD ( NL )? Id )*
            loop266:
            do {
                int alt266=2;
                int LA266_0 = input.LA(1);

                if ( (LA266_0==NL) ) {
                    int LA266_1 = input.LA(2);

                    if ( (LA266_1==PERIOD) ) {
                        alt266=1;
                    }


                }
                else if ( (LA266_0==PERIOD) ) {
                    alt266=1;
                }


                switch (alt266) {
            	case 1 :
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:20: ( NL )? PERIOD ( NL )? Id
            	    {
            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:20: ( NL )?
            	    int alt264=2;
            	    int LA264_0 = input.LA(1);

            	    if ( (LA264_0==NL) ) {
            	        alt264=1;
            	    }
            	    switch (alt264) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:20: NL
            	            {
            	            NL565=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5303); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL565);


            	            }
            	            break;

            	    }

            	    PERIOD566=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_message_send_expr5306); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD566);

            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:31: ( NL )?
            	    int alt265=2;
            	    int LA265_0 = input.LA(1);

            	    if ( (LA265_0==NL) ) {
            	        alt265=1;
            	    }
            	    switch (alt265) {
            	        case 1 :
            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:31: NL
            	            {
            	            NL567=(Token)match(input,NL,FOLLOW_NL_in_message_send_expr5308); if (state.failed) return retval; 
            	            if ( state.backtracking==0 ) stream_NL.add(NL567);


            	            }
            	            break;

            	    }

            	    Id568=(Token)match(input,Id,FOLLOW_Id_in_message_send_expr5311); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_Id.add(Id568);


            	    }
            	    break;

            	default :
            	    break loop266;
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
            // 757:40: -> ^( MESSAGE_SEND primitive_expr ( Id )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:43: ^( MESSAGE_SEND primitive_expr ( Id )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MESSAGE_SEND, "MESSAGE_SEND"), root_1);

                adaptor.addChild(root_1, stream_primitive_expr.nextTree());
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:757:73: ( Id )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:759:1: list_expr : ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) );
    public final babel17Parser.list_expr_return list_expr() throws RecognitionException {
        babel17Parser.list_expr_return retval = new babel17Parser.list_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal569=null;
        Token NL570=null;
        Token NL572=null;
        Token COMMA573=null;
        Token NL574=null;
        Token NL576=null;
        Token char_literal577=null;
        Token char_literal578=null;
        Token NL579=null;
        Token NL581=null;
        Token COMMA582=null;
        Token NL583=null;
        Token NL585=null;
        Token COMMA586=null;
        Token NL587=null;
        Token char_literal588=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc571 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc575 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc580 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc584 = null;


        CommonTree char_literal569_tree=null;
        CommonTree NL570_tree=null;
        CommonTree NL572_tree=null;
        CommonTree COMMA573_tree=null;
        CommonTree NL574_tree=null;
        CommonTree NL576_tree=null;
        CommonTree char_literal577_tree=null;
        CommonTree char_literal578_tree=null;
        CommonTree NL579_tree=null;
        CommonTree NL581_tree=null;
        CommonTree COMMA582_tree=null;
        CommonTree NL583_tree=null;
        CommonTree NL585_tree=null;
        CommonTree COMMA586_tree=null;
        CommonTree NL587_tree=null;
        CommonTree char_literal588_tree=null;
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_SQUARE_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token SQUARE_BRACKET_OPEN");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:2: ( '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']' -> ^( SQUARE_LIST ( protected_expr_nc )* ) | '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) ) )
            int alt281=2;
            int LA281_0 = input.LA(1);

            if ( (LA281_0==SQUARE_BRACKET_OPEN) ) {
                alt281=1;
            }
            else if ( (LA281_0==ROUND_BRACKET_OPEN) ) {
                alt281=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 281, 0, input);

                throw nvae;
            }
            switch (alt281) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:4: '[' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )? ']'
                    {
                    char_literal569=(Token)match(input,SQUARE_BRACKET_OPEN,FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_OPEN.add(char_literal569);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:8: ( NL )?
                    int alt267=2;
                    int LA267_0 = input.LA(1);

                    if ( (LA267_0==NL) ) {
                        alt267=1;
                    }
                    switch (alt267) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:8: NL
                            {
                            NL570=(Token)match(input,NL,FOLLOW_NL_in_list_expr5337); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL570);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? )?
                    int alt272=2;
                    int LA272_0 = input.LA(1);

                    if ( (LA272_0==L_begin||(LA272_0>=L_obj && LA272_0<=L_if)||(LA272_0>=L_while && LA272_0<=L_for)||LA272_0==L_match||LA272_0==L_exception||LA272_0==L_try||(LA272_0>=A_infinity && LA272_0<=L_lazy)||(LA272_0>=L_true && LA272_0<=L_nil)||LA272_0==L_typeof||LA272_0==MINUS||LA272_0==A_NOT||LA272_0==U_NOT||(LA272_0>=A_ELLIPSIS && LA272_0<=U_ELLIPSIS)||LA272_0==L_force||(LA272_0>=Constr && LA272_0<=Num)||(LA272_0>=String && LA272_0<=ROUND_BRACKET_OPEN)||LA272_0==SQUARE_BRACKET_OPEN||LA272_0==CURLY_BRACKET_OPEN||LA272_0==UNDERSCORE) ) {
                        alt272=1;
                    }
                    switch (alt272) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5341);
                            protected_expr_nc571=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc571.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop270:
                            do {
                                int alt270=2;
                                int LA270_0 = input.LA(1);

                                if ( (LA270_0==NL) ) {
                                    int LA270_1 = input.LA(2);

                                    if ( (LA270_1==COMMA) ) {
                                        alt270=1;
                                    }


                                }
                                else if ( (LA270_0==COMMA) ) {
                                    alt270=1;
                                }


                                switch (alt270) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:32: ( NL )?
                            	    int alt268=2;
                            	    int LA268_0 = input.LA(1);

                            	    if ( (LA268_0==NL) ) {
                            	        alt268=1;
                            	    }
                            	    switch (alt268) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:32: NL
                            	            {
                            	            NL572=(Token)match(input,NL,FOLLOW_NL_in_list_expr5344); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL572);


                            	            }
                            	            break;

                            	    }

                            	    COMMA573=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5347); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA573);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:42: ( NL )?
                            	    int alt269=2;
                            	    int LA269_0 = input.LA(1);

                            	    if ( (LA269_0==NL) ) {
                            	        alt269=1;
                            	    }
                            	    switch (alt269) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:42: NL
                            	            {
                            	            NL574=(Token)match(input,NL,FOLLOW_NL_in_list_expr5349); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL574);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5352);
                            	    protected_expr_nc575=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc575.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop270;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:66: ( NL )?
                            int alt271=2;
                            int LA271_0 = input.LA(1);

                            if ( (LA271_0==NL) ) {
                                alt271=1;
                            }
                            switch (alt271) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:66: NL
                                    {
                                    NL576=(Token)match(input,NL,FOLLOW_NL_in_list_expr5356); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL576);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal577=(Token)match(input,SQUARE_BRACKET_CLOSE,FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SQUARE_BRACKET_CLOSE.add(char_literal577);



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
                    // 760:76: -> ^( SQUARE_LIST ( protected_expr_nc )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:79: ^( SQUARE_LIST ( protected_expr_nc )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SQUARE_LIST, "SQUARE_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:760:93: ( protected_expr_nc )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:4: '(' ( NL )? ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )? ')'
                    {
                    char_literal578=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal578);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:8: ( NL )?
                    int alt273=2;
                    int LA273_0 = input.LA(1);

                    if ( (LA273_0==NL) ) {
                        alt273=1;
                    }
                    switch (alt273) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:8: NL
                            {
                            NL579=(Token)match(input,NL,FOLLOW_NL_in_list_expr5377); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL579);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:12: ( protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )? )?
                    int alt280=2;
                    int LA280_0 = input.LA(1);

                    if ( (LA280_0==L_begin||(LA280_0>=L_obj && LA280_0<=L_if)||(LA280_0>=L_while && LA280_0<=L_for)||LA280_0==L_match||LA280_0==L_exception||LA280_0==L_try||(LA280_0>=A_infinity && LA280_0<=L_lazy)||(LA280_0>=L_true && LA280_0<=L_nil)||LA280_0==L_typeof||LA280_0==MINUS||LA280_0==A_NOT||LA280_0==U_NOT||(LA280_0>=A_ELLIPSIS && LA280_0<=U_ELLIPSIS)||LA280_0==L_force||(LA280_0>=Constr && LA280_0<=Num)||(LA280_0>=String && LA280_0<=ROUND_BRACKET_OPEN)||LA280_0==SQUARE_BRACKET_OPEN||LA280_0==CURLY_BRACKET_OPEN||LA280_0==UNDERSCORE) ) {
                        alt280=1;
                    }
                    switch (alt280) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:13: protected_expr_nc ( ( NL )? COMMA ( NL )? protected_expr_nc )* ( NL )? ( COMMA ( NL )? )?
                            {
                            pushFollow(FOLLOW_protected_expr_nc_in_list_expr5381);
                            protected_expr_nc580=protected_expr_nc();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc580.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:31: ( ( NL )? COMMA ( NL )? protected_expr_nc )*
                            loop276:
                            do {
                                int alt276=2;
                                int LA276_0 = input.LA(1);

                                if ( (LA276_0==NL) ) {
                                    int LA276_1 = input.LA(2);

                                    if ( (LA276_1==COMMA) ) {
                                        int LA276_2 = input.LA(3);

                                        if ( (LA276_2==NL) ) {
                                            int LA276_4 = input.LA(4);

                                            if ( (LA276_4==L_begin||(LA276_4>=L_obj && LA276_4<=L_if)||(LA276_4>=L_while && LA276_4<=L_for)||LA276_4==L_match||LA276_4==L_exception||LA276_4==L_try||(LA276_4>=A_infinity && LA276_4<=L_lazy)||(LA276_4>=L_true && LA276_4<=L_nil)||LA276_4==L_typeof||LA276_4==MINUS||LA276_4==A_NOT||LA276_4==U_NOT||(LA276_4>=A_ELLIPSIS && LA276_4<=U_ELLIPSIS)||LA276_4==L_force||(LA276_4>=Constr && LA276_4<=Num)||(LA276_4>=String && LA276_4<=ROUND_BRACKET_OPEN)||LA276_4==SQUARE_BRACKET_OPEN||LA276_4==CURLY_BRACKET_OPEN||LA276_4==UNDERSCORE) ) {
                                                alt276=1;
                                            }


                                        }
                                        else if ( (LA276_2==L_begin||(LA276_2>=L_obj && LA276_2<=L_if)||(LA276_2>=L_while && LA276_2<=L_for)||LA276_2==L_match||LA276_2==L_exception||LA276_2==L_try||(LA276_2>=A_infinity && LA276_2<=L_lazy)||(LA276_2>=L_true && LA276_2<=L_nil)||LA276_2==L_typeof||LA276_2==MINUS||LA276_2==A_NOT||LA276_2==U_NOT||(LA276_2>=A_ELLIPSIS && LA276_2<=U_ELLIPSIS)||LA276_2==L_force||(LA276_2>=Constr && LA276_2<=Num)||(LA276_2>=String && LA276_2<=ROUND_BRACKET_OPEN)||LA276_2==SQUARE_BRACKET_OPEN||LA276_2==CURLY_BRACKET_OPEN||LA276_2==UNDERSCORE) ) {
                                            alt276=1;
                                        }


                                    }


                                }
                                else if ( (LA276_0==COMMA) ) {
                                    int LA276_2 = input.LA(2);

                                    if ( (LA276_2==NL) ) {
                                        int LA276_4 = input.LA(3);

                                        if ( (LA276_4==L_begin||(LA276_4>=L_obj && LA276_4<=L_if)||(LA276_4>=L_while && LA276_4<=L_for)||LA276_4==L_match||LA276_4==L_exception||LA276_4==L_try||(LA276_4>=A_infinity && LA276_4<=L_lazy)||(LA276_4>=L_true && LA276_4<=L_nil)||LA276_4==L_typeof||LA276_4==MINUS||LA276_4==A_NOT||LA276_4==U_NOT||(LA276_4>=A_ELLIPSIS && LA276_4<=U_ELLIPSIS)||LA276_4==L_force||(LA276_4>=Constr && LA276_4<=Num)||(LA276_4>=String && LA276_4<=ROUND_BRACKET_OPEN)||LA276_4==SQUARE_BRACKET_OPEN||LA276_4==CURLY_BRACKET_OPEN||LA276_4==UNDERSCORE) ) {
                                            alt276=1;
                                        }


                                    }
                                    else if ( (LA276_2==L_begin||(LA276_2>=L_obj && LA276_2<=L_if)||(LA276_2>=L_while && LA276_2<=L_for)||LA276_2==L_match||LA276_2==L_exception||LA276_2==L_try||(LA276_2>=A_infinity && LA276_2<=L_lazy)||(LA276_2>=L_true && LA276_2<=L_nil)||LA276_2==L_typeof||LA276_2==MINUS||LA276_2==A_NOT||LA276_2==U_NOT||(LA276_2>=A_ELLIPSIS && LA276_2<=U_ELLIPSIS)||LA276_2==L_force||(LA276_2>=Constr && LA276_2<=Num)||(LA276_2>=String && LA276_2<=ROUND_BRACKET_OPEN)||LA276_2==SQUARE_BRACKET_OPEN||LA276_2==CURLY_BRACKET_OPEN||LA276_2==UNDERSCORE) ) {
                                        alt276=1;
                                    }


                                }


                                switch (alt276) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:32: ( NL )? COMMA ( NL )? protected_expr_nc
                            	    {
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:32: ( NL )?
                            	    int alt274=2;
                            	    int LA274_0 = input.LA(1);

                            	    if ( (LA274_0==NL) ) {
                            	        alt274=1;
                            	    }
                            	    switch (alt274) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:32: NL
                            	            {
                            	            NL581=(Token)match(input,NL,FOLLOW_NL_in_list_expr5384); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL581);


                            	            }
                            	            break;

                            	    }

                            	    COMMA582=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5387); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA582);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:42: ( NL )?
                            	    int alt275=2;
                            	    int LA275_0 = input.LA(1);

                            	    if ( (LA275_0==NL) ) {
                            	        alt275=1;
                            	    }
                            	    switch (alt275) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:42: NL
                            	            {
                            	            NL583=(Token)match(input,NL,FOLLOW_NL_in_list_expr5389); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL583);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_protected_expr_nc_in_list_expr5392);
                            	    protected_expr_nc584=protected_expr_nc();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc584.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop276;
                                }
                            } while (true);

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:66: ( NL )?
                            int alt277=2;
                            int LA277_0 = input.LA(1);

                            if ( (LA277_0==NL) ) {
                                alt277=1;
                            }
                            switch (alt277) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:66: NL
                                    {
                                    NL585=(Token)match(input,NL,FOLLOW_NL_in_list_expr5396); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL585);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:70: ( COMMA ( NL )? )?
                            int alt279=2;
                            int LA279_0 = input.LA(1);

                            if ( (LA279_0==COMMA) ) {
                                alt279=1;
                            }
                            switch (alt279) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:71: COMMA ( NL )?
                                    {
                                    COMMA586=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_expr5400); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA586);

                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:77: ( NL )?
                                    int alt278=2;
                                    int LA278_0 = input.LA(1);

                                    if ( (LA278_0==NL) ) {
                                        alt278=1;
                                    }
                                    switch (alt278) {
                                        case 1 :
                                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:77: NL
                                            {
                                            NL587=(Token)match(input,NL,FOLLOW_NL_in_list_expr5402); if (state.failed) return retval; 
                                            if ( state.backtracking==0 ) stream_NL.add(NL587);


                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal588=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5409); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal588);



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
                    // 761:89: -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:92: ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( protected_expr_nc )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ROUND_LIST, "ROUND_LIST"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:105: ^( NIL_TOKEN ( COMMA )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:117: ( COMMA )*
                        while ( stream_COMMA.hasNext() ) {
                            adaptor.addChild(root_2, stream_COMMA.nextNode());

                        }
                        stream_COMMA.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:125: ^( NIL_TOKEN ( protected_expr_nc )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:761:137: ( protected_expr_nc )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:763:1: map_or_set_expr : ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );
    public final babel17Parser.map_or_set_expr_return map_or_set_expr() throws RecognitionException {
        babel17Parser.map_or_set_expr_return retval = new babel17Parser.map_or_set_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal589=null;
        Token NL590=null;
        Token NL592=null;
        Token COMMA593=null;
        Token NL594=null;
        Token NL596=null;
        Token char_literal597=null;
        Token char_literal598=null;
        Token NL599=null;
        Token NL601=null;
        Token char_literal602=null;
        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr591 = null;

        babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr595 = null;

        babel17Parser.token_ARROW_return token_ARROW600 = null;


        CommonTree char_literal589_tree=null;
        CommonTree NL590_tree=null;
        CommonTree NL592_tree=null;
        CommonTree COMMA593_tree=null;
        CommonTree NL594_tree=null;
        CommonTree NL596_tree=null;
        CommonTree char_literal597_tree=null;
        CommonTree char_literal598_tree=null;
        CommonTree NL599_tree=null;
        CommonTree NL601_tree=null;
        CommonTree char_literal602_tree=null;
        RewriteRuleTokenStream stream_CURLY_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_OPEN");
        RewriteRuleTokenStream stream_CURLY_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token CURLY_BRACKET_CLOSE");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_map_or_set_elem_expr=new RewriteRuleSubtreeStream(adaptor,"rule map_or_set_elem_expr");
        RewriteRuleSubtreeStream stream_token_ARROW=new RewriteRuleSubtreeStream(adaptor,"rule token_ARROW");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:2: ( '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) )
            int alt290=2;
            int LA290_0 = input.LA(1);

            if ( (LA290_0==CURLY_BRACKET_OPEN) ) {
                switch ( input.LA(2) ) {
                case NL:
                    {
                    int LA290_2 = input.LA(3);

                    if ( ((LA290_2>=A_ARROW && LA290_2<=U_ARROW)) ) {
                        alt290=2;
                    }
                    else if ( (LA290_2==L_begin||(LA290_2>=L_obj && LA290_2<=L_if)||(LA290_2>=L_while && LA290_2<=L_for)||LA290_2==L_match||LA290_2==L_exception||LA290_2==L_try||(LA290_2>=A_infinity && LA290_2<=L_lazy)||(LA290_2>=L_true && LA290_2<=L_nil)||LA290_2==L_typeof||LA290_2==MINUS||LA290_2==A_NOT||LA290_2==U_NOT||(LA290_2>=A_ELLIPSIS && LA290_2<=U_ELLIPSIS)||LA290_2==L_force||(LA290_2>=Constr && LA290_2<=Num)||(LA290_2>=String && LA290_2<=ROUND_BRACKET_OPEN)||LA290_2==SQUARE_BRACKET_OPEN||(LA290_2>=CURLY_BRACKET_OPEN && LA290_2<=UNDERSCORE)) ) {
                        alt290=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 290, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case A_ARROW:
                case U_ARROW:
                    {
                    alt290=2;
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
                    alt290=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 290, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 290, 0, input);

                throw nvae;
            }
            switch (alt290) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:4: '{' ( NL )? ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )? '}'
                    {
                    char_literal589=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5438); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal589);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:8: ( NL )?
                    int alt282=2;
                    int LA282_0 = input.LA(1);

                    if ( (LA282_0==NL) ) {
                        alt282=1;
                    }
                    switch (alt282) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:8: NL
                            {
                            NL590=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5440); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL590);


                            }
                            break;

                    }

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:12: ( map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )* )?
                    int alt287=2;
                    int LA287_0 = input.LA(1);

                    if ( (LA287_0==L_begin||(LA287_0>=L_obj && LA287_0<=L_if)||(LA287_0>=L_while && LA287_0<=L_for)||LA287_0==L_match||LA287_0==L_exception||LA287_0==L_try||(LA287_0>=A_infinity && LA287_0<=L_lazy)||(LA287_0>=L_true && LA287_0<=L_nil)||LA287_0==L_typeof||LA287_0==MINUS||LA287_0==A_NOT||LA287_0==U_NOT||(LA287_0>=A_ELLIPSIS && LA287_0<=U_ELLIPSIS)||LA287_0==L_force||(LA287_0>=Constr && LA287_0<=Num)||(LA287_0>=String && LA287_0<=ROUND_BRACKET_OPEN)||LA287_0==SQUARE_BRACKET_OPEN||LA287_0==CURLY_BRACKET_OPEN||LA287_0==UNDERSCORE) ) {
                        alt287=1;
                    }
                    switch (alt287) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:13: map_or_set_elem_expr ( NL )? ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            {
                            pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5444);
                            map_or_set_elem_expr591=map_or_set_elem_expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr591.getTree());
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:34: ( NL )?
                            int alt283=2;
                            int LA283_0 = input.LA(1);

                            if ( (LA283_0==NL) ) {
                                alt283=1;
                            }
                            switch (alt283) {
                                case 1 :
                                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:34: NL
                                    {
                                    NL592=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5446); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_NL.add(NL592);


                                    }
                                    break;

                            }

                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:38: ( COMMA ( NL )? map_or_set_elem_expr ( NL )? )*
                            loop286:
                            do {
                                int alt286=2;
                                int LA286_0 = input.LA(1);

                                if ( (LA286_0==COMMA) ) {
                                    alt286=1;
                                }


                                switch (alt286) {
                            	case 1 :
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:39: COMMA ( NL )? map_or_set_elem_expr ( NL )?
                            	    {
                            	    COMMA593=(Token)match(input,COMMA,FOLLOW_COMMA_in_map_or_set_expr5450); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA593);

                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:45: ( NL )?
                            	    int alt284=2;
                            	    int LA284_0 = input.LA(1);

                            	    if ( (LA284_0==NL) ) {
                            	        alt284=1;
                            	    }
                            	    switch (alt284) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:45: NL
                            	            {
                            	            NL594=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5452); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL594);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5455);
                            	    map_or_set_elem_expr595=map_or_set_elem_expr();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_map_or_set_elem_expr.add(map_or_set_elem_expr595.getTree());
                            	    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:70: ( NL )?
                            	    int alt285=2;
                            	    int LA285_0 = input.LA(1);

                            	    if ( (LA285_0==NL) ) {
                            	        alt285=1;
                            	    }
                            	    switch (alt285) {
                            	        case 1 :
                            	            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:70: NL
                            	            {
                            	            NL596=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5457); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_NL.add(NL596);


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop286;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal597=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal597);



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
                    // 764:82: -> ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:85: ^( MAP_OR_SET_OR_OBJ ( map_or_set_elem_expr )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MAP_OR_SET_OR_OBJ, "MAP_OR_SET_OR_OBJ"), root_1);

                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:764:105: ( map_or_set_elem_expr )*
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
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:10: '{' ( NL )? token_ARROW ( NL )? '}'
                    {
                    char_literal598=(Token)match(input,CURLY_BRACKET_OPEN,FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_OPEN.add(char_literal598);

                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:14: ( NL )?
                    int alt288=2;
                    int LA288_0 = input.LA(1);

                    if ( (LA288_0==NL) ) {
                        alt288=1;
                    }
                    switch (alt288) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:14: NL
                            {
                            NL599=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5486); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL599);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_token_ARROW_in_map_or_set_expr5489);
                    token_ARROW600=token_ARROW();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_token_ARROW.add(token_ARROW600.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:30: ( NL )?
                    int alt289=2;
                    int LA289_0 = input.LA(1);

                    if ( (LA289_0==NL) ) {
                        alt289=1;
                    }
                    switch (alt289) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:30: NL
                            {
                            NL601=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_expr5491); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL601);


                            }
                            break;

                    }

                    char_literal602=(Token)match(input,CURLY_BRACKET_CLOSE,FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CURLY_BRACKET_CLOSE.add(char_literal602);



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
                    // 765:38: -> ^( EMPTY_MAP )
                    {
                        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:765:41: ^( EMPTY_MAP )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:767:1: map_or_set_elem_expr : protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) ;
    public final babel17Parser.map_or_set_elem_expr_return map_or_set_elem_expr() throws RecognitionException {
        babel17Parser.map_or_set_elem_expr_return retval = new babel17Parser.map_or_set_elem_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NL604=null;
        Token NL606=null;
        babel17Parser.protected_expr_nc_return protected_expr_nc603 = null;

        babel17Parser.arrow_or_assign_return arrow_or_assign605 = null;

        babel17Parser.protected_expr_nc_return protected_expr_nc607 = null;


        CommonTree NL604_tree=null;
        CommonTree NL606_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_arrow_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule arrow_or_assign");
        RewriteRuleSubtreeStream stream_protected_expr_nc=new RewriteRuleSubtreeStream(adaptor,"rule protected_expr_nc");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:2: ( protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )? -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:4: protected_expr_nc ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            {
            pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5511);
            protected_expr_nc603=protected_expr_nc();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc603.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:22: ( ( NL )? arrow_or_assign ( NL )? protected_expr_nc )?
            int alt293=2;
            int LA293_0 = input.LA(1);

            if ( (LA293_0==NL) ) {
                int LA293_1 = input.LA(2);

                if ( (LA293_1==ASSIGN||(LA293_1>=A_ARROW && LA293_1<=U_ARROW)) ) {
                    alt293=1;
                }
            }
            else if ( (LA293_0==ASSIGN||(LA293_0>=A_ARROW && LA293_0<=U_ARROW)) ) {
                alt293=1;
            }
            switch (alt293) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:23: ( NL )? arrow_or_assign ( NL )? protected_expr_nc
                    {
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:23: ( NL )?
                    int alt291=2;
                    int LA291_0 = input.LA(1);

                    if ( (LA291_0==NL) ) {
                        alt291=1;
                    }
                    switch (alt291) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:23: NL
                            {
                            NL604=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5514); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL604);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5517);
                    arrow_or_assign605=arrow_or_assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_arrow_or_assign.add(arrow_or_assign605.getTree());
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:43: ( NL )?
                    int alt292=2;
                    int LA292_0 = input.LA(1);

                    if ( (LA292_0==NL) ) {
                        alt292=1;
                    }
                    switch (alt292) {
                        case 1 :
                            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:43: NL
                            {
                            NL606=(Token)match(input,NL,FOLLOW_NL_in_map_or_set_elem_expr5519); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_NL.add(NL606);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5522);
                    protected_expr_nc607=protected_expr_nc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_protected_expr_nc.add(protected_expr_nc607.getTree());

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
            // 768:67: -> ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:70: ^( NIL_TOKEN ^( NIL_TOKEN ( protected_expr_nc )* ) ( arrow_or_assign )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_1);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:82: ^( NIL_TOKEN ( protected_expr_nc )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NIL_TOKEN, "NIL_TOKEN"), root_2);

                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:94: ( protected_expr_nc )*
                while ( stream_protected_expr_nc.hasNext() ) {
                    adaptor.addChild(root_2, stream_protected_expr_nc.nextTree());

                }
                stream_protected_expr_nc.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:768:114: ( arrow_or_assign )*
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:770:1: type_expr : '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) ;
    public final babel17Parser.type_expr_return type_expr() throws RecognitionException {
        babel17Parser.type_expr_return retval = new babel17Parser.type_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal608=null;
        Token NL609=null;
        Token char_literal610=null;
        Token NL611=null;
        Token NL613=null;
        Token char_literal614=null;
        babel17Parser.typeid_return typeid612 = null;


        CommonTree char_literal608_tree=null;
        CommonTree NL609_tree=null;
        CommonTree char_literal610_tree=null;
        CommonTree NL611_tree=null;
        CommonTree NL613_tree=null;
        CommonTree char_literal614_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ROUND_BRACKET_OPEN=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_OPEN");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_ROUND_BRACKET_CLOSE=new RewriteRuleTokenStream(adaptor,"token ROUND_BRACKET_CLOSE");
        RewriteRuleSubtreeStream stream_typeid=new RewriteRuleSubtreeStream(adaptor,"rule typeid");
        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:2: ( '(' ( NL )? ':' ( NL )? typeid ( NL )? ')' -> ^( TYPE_EXPR typeid ) )
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:4: '(' ( NL )? ':' ( NL )? typeid ( NL )? ')'
            {
            char_literal608=(Token)match(input,ROUND_BRACKET_OPEN,FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_OPEN.add(char_literal608);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:8: ( NL )?
            int alt294=2;
            int LA294_0 = input.LA(1);

            if ( (LA294_0==NL) ) {
                alt294=1;
            }
            switch (alt294) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:8: NL
                    {
                    NL609=(Token)match(input,NL,FOLLOW_NL_in_type_expr5551); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL609);


                    }
                    break;

            }

            char_literal610=(Token)match(input,COLON,FOLLOW_COLON_in_type_expr5554); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal610);

            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:16: ( NL )?
            int alt295=2;
            int LA295_0 = input.LA(1);

            if ( (LA295_0==NL) ) {
                alt295=1;
            }
            switch (alt295) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:16: NL
                    {
                    NL611=(Token)match(input,NL,FOLLOW_NL_in_type_expr5556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL611);


                    }
                    break;

            }

            pushFollow(FOLLOW_typeid_in_type_expr5559);
            typeid612=typeid();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeid.add(typeid612.getTree());
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:27: ( NL )?
            int alt296=2;
            int LA296_0 = input.LA(1);

            if ( (LA296_0==NL) ) {
                alt296=1;
            }
            switch (alt296) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:27: NL
                    {
                    NL613=(Token)match(input,NL,FOLLOW_NL_in_type_expr5561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NL.add(NL613);


                    }
                    break;

            }

            char_literal614=(Token)match(input,ROUND_BRACKET_CLOSE,FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ROUND_BRACKET_CLOSE.add(char_literal614);



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
            // 771:35: -> ^( TYPE_EXPR typeid )
            {
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:771:38: ^( TYPE_EXPR typeid )
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
    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:773:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );
    public final babel17Parser.primitive_expr_return primitive_expr() throws RecognitionException {
        babel17Parser.primitive_expr_return retval = new babel17Parser.primitive_expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Num615=null;
        Token String616=null;
        Token Id617=null;
        Token Constr618=null;
        Token L_true619=null;
        Token L_false620=null;
        Token L_this621=null;
        Token L_nil622=null;
        babel17Parser.type_expr_return type_expr623 = null;

        babel17Parser.token_infinity_return token_infinity624 = null;

        babel17Parser.list_expr_return list_expr625 = null;

        babel17Parser.with_control_expr_return with_control_expr626 = null;

        babel17Parser.map_or_set_expr_return map_or_set_expr627 = null;


        CommonTree Num615_tree=null;
        CommonTree String616_tree=null;
        CommonTree Id617_tree=null;
        CommonTree Constr618_tree=null;
        CommonTree L_true619_tree=null;
        CommonTree L_false620_tree=null;
        CommonTree L_this621_tree=null;
        CommonTree L_nil622_tree=null;

        try {
            // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:774:2: ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr )
            int alt297=13;
            alt297 = dfa297.predict(input);
            switch (alt297) {
                case 1 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:774:4: Num
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Num615=(Token)match(input,Num,FOLLOW_Num_in_primitive_expr5581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Num615_tree = (CommonTree)adaptor.create(Num615);
                    adaptor.addChild(root_0, Num615_tree);
                    }

                    }
                    break;
                case 2 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:775:4: String
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    String616=(Token)match(input,String,FOLLOW_String_in_primitive_expr5586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    String616_tree = (CommonTree)adaptor.create(String616);
                    adaptor.addChild(root_0, String616_tree);
                    }

                    }
                    break;
                case 3 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:776:4: Id
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Id617=(Token)match(input,Id,FOLLOW_Id_in_primitive_expr5591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Id617_tree = (CommonTree)adaptor.create(Id617);
                    adaptor.addChild(root_0, Id617_tree);
                    }

                    }
                    break;
                case 4 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:777:4: Constr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Constr618=(Token)match(input,Constr,FOLLOW_Constr_in_primitive_expr5596); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Constr618_tree = (CommonTree)adaptor.create(Constr618);
                    adaptor.addChild(root_0, Constr618_tree);
                    }

                    }
                    break;
                case 5 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:778:4: L_true
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_true619=(Token)match(input,L_true,FOLLOW_L_true_in_primitive_expr5601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_true619_tree = (CommonTree)adaptor.create(L_true619);
                    adaptor.addChild(root_0, L_true619_tree);
                    }

                    }
                    break;
                case 6 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:779:4: L_false
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_false620=(Token)match(input,L_false,FOLLOW_L_false_in_primitive_expr5606); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_false620_tree = (CommonTree)adaptor.create(L_false620);
                    adaptor.addChild(root_0, L_false620_tree);
                    }

                    }
                    break;
                case 7 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:780:4: L_this
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_this621=(Token)match(input,L_this,FOLLOW_L_this_in_primitive_expr5611); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_this621_tree = (CommonTree)adaptor.create(L_this621);
                    adaptor.addChild(root_0, L_this621_tree);
                    }

                    }
                    break;
                case 8 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:781:4: L_nil
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    L_nil622=(Token)match(input,L_nil,FOLLOW_L_nil_in_primitive_expr5617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    L_nil622_tree = (CommonTree)adaptor.create(L_nil622);
                    adaptor.addChild(root_0, L_nil622_tree);
                    }

                    }
                    break;
                case 9 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:782:4: type_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_expr_in_primitive_expr5622);
                    type_expr623=type_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_expr623.getTree());

                    }
                    break;
                case 10 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:783:4: token_infinity
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_token_infinity_in_primitive_expr5627);
                    token_infinity624=token_infinity();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, token_infinity624.getTree());

                    }
                    break;
                case 11 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:784:5: list_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_expr_in_primitive_expr5633);
                    list_expr625=list_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list_expr625.getTree());

                    }
                    break;
                case 12 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:785:4: with_control_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_with_control_expr_in_primitive_expr5638);
                    with_control_expr626=with_control_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, with_control_expr626.getTree());

                    }
                    break;
                case 13 :
                    // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:786:4: map_or_set_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_map_or_set_expr_in_primitive_expr5643);
                    map_or_set_expr627=map_or_set_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, map_or_set_expr627.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
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
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:5: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:6: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred1_babel171880);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: ( NL )?
        int alt298=2;
        int LA298_0 = input.LA(1);

        if ( (LA298_0==NL) ) {
            alt298=1;
        }
        switch (alt298) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:416:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred1_babel171882); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred1_babel171885); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_babel17

    // $ANTLR start synpred2_babel17
    public final void synpred2_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:10: ( Id ( NL )? L_as )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:11: Id ( NL )? L_as
        {
        match(input,Id,FOLLOW_Id_in_synpred2_babel171933); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:14: ( NL )?
        int alt299=2;
        int LA299_0 = input.LA(1);

        if ( (LA299_0==NL) ) {
            alt299=1;
        }
        switch (alt299) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:421:14: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred2_babel171935); if (state.failed) return ;

                }
                break;

        }

        match(input,L_as,FOLLOW_L_as_in_synpred2_babel171938); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_babel17

    // $ANTLR start synpred3_babel17
    public final void synpred3_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:4: ( protected_expr ( NL )? QUESTION_MARK )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:5: protected_expr ( NL )? QUESTION_MARK
        {
        pushFollow(FOLLOW_protected_expr_in_synpred3_babel171969);
        protected_expr();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:20: ( NL )?
        int alt300=2;
        int LA300_0 = input.LA(1);

        if ( (LA300_0==NL) ) {
            alt300=1;
        }
        switch (alt300) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:422:20: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred3_babel171971); if (state.failed) return ;

                }
                break;

        }

        match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_synpred3_babel171974); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_babel17

    // $ANTLR start synpred4_babel17
    public final void synpred4_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:4: ( Id pattern )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:424:5: Id pattern
        {
        match(input,Id,FOLLOW_Id_in_synpred4_babel172012); if (state.failed) return ;
        pushFollow(FOLLOW_pattern_in_synpred4_babel172014);
        pattern();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_babel17

    // $ANTLR start synpred5_babel17
    public final void synpred5_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:4: ( pattern ( NL )? L_if )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:5: pattern ( NL )? L_if
        {
        pushFollow(FOLLOW_pattern_in_synpred5_babel172103);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:13: ( NL )?
        int alt301=2;
        int LA301_0 = input.LA(1);

        if ( (LA301_0==NL) ) {
            alt301=1;
        }
        switch (alt301) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:427:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred5_babel172105); if (state.failed) return ;

                }
                break;

        }

        match(input,L_if,FOLLOW_L_if_in_synpred5_babel172108); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_babel17

    // $ANTLR start synpred6_babel17
    public final void synpred6_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:4: ( pattern ( NL )? ':' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:5: pattern ( NL )? ':'
        {
        pushFollow(FOLLOW_pattern_in_synpred6_babel172139);
        pattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:13: ( NL )?
        int alt302=2;
        int LA302_0 = input.LA(1);

        if ( (LA302_0==NL) ) {
            alt302=1;
        }
        switch (alt302) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:428:13: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred6_babel172141); if (state.failed) return ;

                }
                break;

        }

        match(input,COLON,FOLLOW_COLON_in_synpred6_babel172144); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_babel17

    // $ANTLR start synpred7_babel17
    public final void synpred7_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:4: ( defpattern ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:5: defpattern ( NL )? '='
        {
        pushFollow(FOLLOW_defpattern_in_synpred7_babel172956);
        defpattern();

        state._fsp--;
        if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:16: ( NL )?
        int alt303=2;
        int LA303_0 = input.LA(1);

        if ( (LA303_0==NL) ) {
            alt303=1;
        }
        switch (alt303) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:495:16: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred7_babel172958); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred7_babel172961); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_babel17

    // $ANTLR start synpred8_babel17
    public final void synpred8_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:4: ( ( pattern | objelem_assign ) ( NL )? '=' )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:5: ( pattern | objelem_assign ) ( NL )? '='
        {
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:5: ( pattern | objelem_assign )
        int alt304=2;
        int LA304_0 = input.LA(1);

        if ( (LA304_0==L_exception||(LA304_0>=A_infinity && LA304_0<=U_infinity)||(LA304_0>=L_true && LA304_0<=L_false)||LA304_0==L_nil||LA304_0==MINUS||(LA304_0>=A_ELLIPSIS && LA304_0<=U_ELLIPSIS)||LA304_0==Constr||LA304_0==Num||(LA304_0>=String && LA304_0<=ROUND_BRACKET_OPEN)||LA304_0==SQUARE_BRACKET_OPEN||LA304_0==CURLY_BRACKET_OPEN||LA304_0==UNDERSCORE) ) {
            alt304=1;
        }
        else if ( (LA304_0==Id) ) {
            int LA304_2 = input.LA(2);

            if ( (LA304_2==PERIOD) ) {
                alt304=2;
            }
            else if ( (LA304_2==ASSIGN||(LA304_2>=A_DOUBLE_COLON && LA304_2<=U_DOUBLE_COLON)||LA304_2==NL) ) {
                alt304=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 304, 2, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 304, 0, input);

            throw nvae;
        }
        switch (alt304) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:6: pattern
                {
                pushFollow(FOLLOW_pattern_in_synpred8_babel173458);
                pattern();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:16: objelem_assign
                {
                pushFollow(FOLLOW_objelem_assign_in_synpred8_babel173462);
                objelem_assign();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:32: ( NL )?
        int alt305=2;
        int LA305_0 = input.LA(1);

        if ( (LA305_0==NL) ) {
            alt305=1;
        }
        switch (alt305) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:541:32: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred8_babel173465); if (state.failed) return ;

                }
                break;

        }

        match(input,ASSIGN,FOLLOW_ASSIGN_in_synpred8_babel173468); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_babel17

    // $ANTLR start synpred9_babel17
    public final void synpred9_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:11: ( L_obj ( NL )? parents )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:12: L_obj ( NL )? parents
        {
        match(input,L_obj,FOLLOW_L_obj_in_synpred9_babel173697); if (state.failed) return ;
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:18: ( NL )?
        int alt306=2;
        int LA306_0 = input.LA(1);

        if ( (LA306_0==NL) ) {
            alt306=1;
        }
        switch (alt306) {
            case 1 :
                // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:576:18: NL
                {
                match(input,NL,FOLLOW_NL_in_synpred9_babel173699); if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_parents_in_synpred9_babel173702);
        parents();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_babel17

    // $ANTLR start synpred10_babel17
    public final void synpred10_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:580:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred10_babel173771);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_babel17

    // $ANTLR start synpred11_babel17
    public final void synpred11_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:581:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred11_babel173782);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_babel17

    // $ANTLR start synpred12_babel17
    public final void synpred12_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:4: ( lambda_expr )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:585:5: lambda_expr
        {
        pushFollow(FOLLOW_lambda_expr_in_synpred12_babel173803);
        lambda_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_babel17

    // $ANTLR start synpred13_babel17
    public final void synpred13_babel17_fragment() throws RecognitionException {   
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:4: ( lambda_expr_nobrackets )
        // /Users/stevenobua/Programming/babel-17/Babel17_ANTLR_Parser/babel17.g:586:5: lambda_expr_nobrackets
        {
        pushFollow(FOLLOW_lambda_expr_nobrackets_in_synpred13_babel173814);
        lambda_expr_nobrackets();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_babel17

    // Delegated rules

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
    public final boolean synpred13_babel17() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_babel17_fragment(); // can never throw exception
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


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA136 dfa136 = new DFA136(this);
    protected DFA146 dfa146 = new DFA146(this);
    protected DFA147 dfa147 = new DFA147(this);
    protected DFA297 dfa297 = new DFA297(this);
    static final String DFA20_eotS =
        "\22\uffff";
    static final String DFA20_eofS =
        "\22\uffff";
    static final String DFA20_minS =
        "\1\125\17\0\2\uffff";
    static final String DFA20_maxS =
        "\1\u00a1\17\0\2\uffff";
    static final String DFA20_acceptS =
        "\20\uffff\1\1\1\2";
    static final String DFA20_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\2\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\16\4\uffff\2\11\4\uffff\1\6\1\7\2\uffff\1\10\24\uffff\1\12"+
            "\23\uffff\2\17\7\uffff\1\1\1\2\1\5\1\uffff\1\4\1\14\1\uffff"+
            "\1\13\1\uffff\1\15\1\uffff\1\3",
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
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "415:1: casepattern : ( ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_2 = input.LA(1);

                         
                        int index20_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_5 = input.LA(1);

                         
                        int index20_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_6 = input.LA(1);

                         
                        int index20_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_7 = input.LA(1);

                         
                        int index20_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_8 = input.LA(1);

                         
                        int index20_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_10 = input.LA(1);

                         
                        int index20_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA20_11 = input.LA(1);

                         
                        int index20_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA20_12 = input.LA(1);

                         
                        int index20_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA20_13 = input.LA(1);

                         
                        int index20_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA20_14 = input.LA(1);

                         
                        int index20_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA20_15 = input.LA(1);

                         
                        int index20_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_babel17()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index20_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\42\uffff";
    static final String DFA37_eofS =
        "\42\uffff";
    static final String DFA37_minS =
        "\1\103\17\0\6\uffff\1\0\13\uffff";
    static final String DFA37_maxS =
        "\1\u00a1\17\0\6\uffff\1\0\13\uffff";
    static final String DFA37_acceptS =
        "\20\uffff\6\2\1\uffff\4\2\1\4\1\1\1\3\1\6\1\7\1\10\1\5";
    static final String DFA37_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\16\1\17\6\uffff\1\20\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\30\1\uffff\1\32\1\31\1\23\3\uffff\1\24\1\26\2\uffff\1\25"+
            "\2\uffff\1\33\2\uffff\1\16\2\uffff\1\27\1\uffff\2\12\3\20\1"+
            "\uffff\1\7\1\10\1\22\1\20\1\11\4\uffff\1\20\17\uffff\1\13\5"+
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "420:1: bracket_pattern : ( ( Id ( NL )? L_as )=> Id ( NL )? L_as ( NL )? pattern -> ^( L_as Id pattern ) | ( protected_expr ( NL )? QUESTION_MARK )=> protected_expr ( NL )? QUESTION_MARK ( ( NL )? pattern )? -> ^( QUESTION_MARK protected_expr ( pattern )? ) | ( Id pattern )=> Id pattern -> ^( INNERVALUE_PATTERN Id pattern ) | L_val ( NL )? protected_expr_nc -> ^( L_val protected_expr_nc ) | L_for ( NL )? ( bracket_pattern ( ( NL )? COMMA ( NL )? bracket_pattern )* ( NL )? )? L_end -> ^( L_for ( bracket_pattern )* ) | ( pattern ( NL )? L_if )=> pattern ( NL )? L_if ( NL )? protected_expr_nc -> ^( IF_PATTERN pattern protected_expr_nc ) | ( pattern ( NL )? ':' )=> pattern ( NL )? ':' ( NL )? typeannotation -> ^( TYPE_PATTERN typeannotation pattern ) | pattern );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==Id) ) {s = 1;}

                        else if ( (LA37_0==ROUND_BRACKET_OPEN) ) {s = 2;}

                        else if ( (LA37_0==Constr) ) {s = 3;}

                        else if ( (LA37_0==UNDERSCORE) ) {s = 4;}

                        else if ( (LA37_0==String) ) {s = 5;}

                        else if ( (LA37_0==Num) ) {s = 6;}

                        else if ( (LA37_0==L_true) ) {s = 7;}

                        else if ( (LA37_0==L_false) ) {s = 8;}

                        else if ( (LA37_0==L_nil) ) {s = 9;}

                        else if ( ((LA37_0>=A_infinity && LA37_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA37_0==MINUS) ) {s = 11;}

                        else if ( (LA37_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA37_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA37_0==L_exception) ) {s = 14;}

                        else if ( ((LA37_0>=A_ELLIPSIS && LA37_0<=U_ELLIPSIS)) ) {s = 15;}

                        else if ( ((LA37_0>=L_concurrent && LA37_0<=L_lazy)||LA37_0==L_random||LA37_0==L_typeof||LA37_0==L_force) && (synpred3_babel17())) {s = 16;}

                        else if ( (LA37_0==A_NOT||LA37_0==U_NOT) && (synpred3_babel17())) {s = 17;}

                        else if ( (LA37_0==L_this) && (synpred3_babel17())) {s = 18;}

                        else if ( (LA37_0==L_if) && (synpred3_babel17())) {s = 19;}

                        else if ( (LA37_0==L_while) && (synpred3_babel17())) {s = 20;}

                        else if ( (LA37_0==L_match) && (synpred3_babel17())) {s = 21;}

                        else if ( (LA37_0==L_for) ) {s = 22;}

                        else if ( (LA37_0==L_try) && (synpred3_babel17())) {s = 23;}

                        else if ( (LA37_0==L_begin) && (synpred3_babel17())) {s = 24;}

                        else if ( (LA37_0==L_with) && (synpred3_babel17())) {s = 25;}

                        else if ( (LA37_0==L_obj) && (synpred3_babel17())) {s = 26;}

                        else if ( (LA37_0==L_val) ) {s = 27;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_babel17()) ) {s = 28;}

                        else if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred4_babel17()) ) {s = 29;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA37_13 = input.LA(1);

                         
                        int index37_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_13);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA37_14 = input.LA(1);

                         
                        int index37_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA37_15 = input.LA(1);

                         
                        int index37_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (synpred5_babel17()) ) {s = 30;}

                        else if ( (synpred6_babel17()) ) {s = 31;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index37_15);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA37_22 = input.LA(1);

                         
                        int index37_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_babel17()) ) {s = 26;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_22);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\23\uffff";
    static final String DFA66_eofS =
        "\23\uffff";
    static final String DFA66_minS =
        "\1\132\10\uffff\1\132\2\uffff\1\103\1\132\2\uffff\1\103\2\uffff";
    static final String DFA66_maxS =
        "\1\u00a1\10\uffff\1\u0098\2\uffff\1\u00a1\1\u0098\2\uffff\1\u00a1"+
        "\2\uffff";
    static final String DFA66_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\2\uffff"+
        "\1\12\1\11\1\uffff\1\16\1\15";
    static final String DFA66_specialS =
        "\23\uffff}>";
    static final String[] DFA66_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\24\uffff\1\11\35\uffff\1\1"+
            "\1\4\1\uffff\1\3\1\13\1\uffff\1\12\1\uffff\1\14\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\17\71\uffff\1\15\2\uffff\1\16",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\1\22\2\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\1\22\1\uffff\5\22\1\uffff\5\22\4\uffff\1"+
            "\22\17\uffff\1\22\5\uffff\1\22\2\uffff\1\22\10\uffff\2\21\2"+
            "\22\3\uffff\1\22\2\uffff\1\20\3\22\1\uffff\2\22\1\uffff\1\22"+
            "\1\uffff\3\22",
            "\2\17\74\uffff\1\16",
            "",
            "",
            "\1\22\1\uffff\3\22\3\uffff\2\22\2\uffff\1\22\2\uffff\1\22\2"+
            "\uffff\1\22\2\uffff\1\22\1\uffff\5\22\1\uffff\5\22\4\uffff\1"+
            "\22\17\uffff\1\22\5\uffff\1\22\2\uffff\1\22\10\uffff\2\21\2"+
            "\22\3\uffff\1\22\3\uffff\3\22\1\uffff\2\22\1\uffff\1\22\1\uffff"+
            "\3\22",
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
            return "439:1: primitive_pattern : ( Id | '_' -> ANY | String | Num | L_true | L_false | L_nil | token_infinity | '-' ( NL )? token_infinity -> ^( UMINUS token_infinity ) | '-' ( NL )? Num -> ^( UMINUS Num ) | '[' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* )? ']' -> ^( SQUARE_LIST ( bracket_pattern )* ) | '(' ( NL )? ( bracket_pattern ( NL )? ( COMMA ( NL )? bracket_pattern ( NL )? )* ( COMMA ( NL )? )? )? ')' -> ^( ROUND_LIST ^( NIL_TOKEN ( COMMA )* ) ^( NIL_TOKEN ( bracket_pattern )* ) ) | '{' ( NL )? ( mselem_pattern ( NL )? ( COMMA ( NL )? mselem_pattern ( NL )? )* )? '}' -> ^( MAP_OR_SET_OR_OBJ ( mselem_pattern )* ) | '{' ( NL )? token_ARROW ( NL )? '}' -> ^( EMPTY_MAP ) );";
        }
    }
    static final String DFA72_eotS =
        "\4\uffff";
    static final String DFA72_eofS =
        "\2\3\2\uffff";
    static final String DFA72_minS =
        "\2\103\2\uffff";
    static final String DFA72_maxS =
        "\2\u00a6\2\uffff";
    static final String DFA72_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA72_specialS =
        "\4\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\1\2\1\uffff\13\2\2\uffff\5\2\13\uffff\1\1\1\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1\2\2\uffff"+
            "\1\1\3\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\4\2",
            "\1\2\1\3\3\2\1\uffff\2\3\2\2\1\uffff\2\2\1\3\1\uffff\2\2\1"+
            "\uffff\1\2\2\uffff\1\2\1\uffff\13\2\2\uffff\5\2\13\uffff\1\1"+
            "\1\uffff\1\2\5\uffff\1\2\2\uffff\1\2\12\uffff\2\2\3\uffff\1"+
            "\2\2\uffff\1\1\3\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\4\2",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "461:1: block : ( ( sep )? statement ( sep statement )* ( sep )? -> ^( BLOCK ( statement )* ) | ( sep )? -> ^( BLOCK ) );";
        }
    }
    static final String DFA69_eotS =
        "\4\uffff";
    static final String DFA69_eofS =
        "\2\2\2\uffff";
    static final String DFA69_minS =
        "\1\104\1\103\2\uffff";
    static final String DFA69_maxS =
        "\1\u0095\1\u00a6\2\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA69_specialS =
        "\4\uffff}>";
    static final String[] DFA69_transitionS = {
            "\1\2\4\uffff\2\2\5\uffff\1\2\46\uffff\1\1\35\uffff\1\1",
            "\1\3\1\2\3\3\1\uffff\2\2\2\3\1\uffff\2\3\1\2\1\uffff\2\3\1"+
            "\uffff\1\3\2\uffff\1\3\1\uffff\13\3\2\uffff\5\3\13\uffff\1\1"+
            "\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\12\uffff\2\3\3\uffff\1"+
            "\3\2\uffff\1\1\3\3\1\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\4\3",
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
            return "()* loopback of 461:25: ( sep statement )*";
        }
    }
    static final String DFA74_eotS =
        "\16\uffff";
    static final String DFA74_eofS =
        "\16\uffff";
    static final String DFA74_minS =
        "\1\103\15\uffff";
    static final String DFA74_maxS =
        "\1\u00a6\15\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA74_specialS =
        "\16\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\11\1\uffff\3\11\3\uffff\2\11\1\uffff\1\4\1\11\2\uffff\1\2"+
            "\1\3\1\uffff\1\11\2\uffff\1\11\1\uffff\5\11\1\5\5\11\2\uffff"+
            "\1\7\1\1\1\11\1\6\1\10\15\uffff\1\11\5\uffff\1\11\2\uffff\1"+
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
            return "467:1: statement : ( st_typedef | st_val | st_def | st_yield | st_memoize | st_private | st_module | st_import | expr_or_assign | PRAGMA_PRINT expr -> ^( PRAGMA_PRINT expr ) | PRAGMA_LOG expr -> ^( PRAGMA_LOG expr ) | PRAGMA_PROFILE expr -> ^( PRAGMA_PROFILE expr ) | PRAGMA_ASSERT expr -> ^( PRAGMA_ASSERT expr ) );";
        }
    }
    static final String DFA100_eotS =
        "\20\uffff";
    static final String DFA100_eofS =
        "\20\uffff";
    static final String DFA100_minS =
        "\1\132\15\0\2\uffff";
    static final String DFA100_maxS =
        "\1\u00a1\15\0\2\uffff";
    static final String DFA100_acceptS =
        "\16\uffff\1\1\1\2";
    static final String DFA100_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\2\uffff}>";
    static final String[] DFA100_transitionS = {
            "\2\10\4\uffff\1\5\1\6\2\uffff\1\7\24\uffff\1\11\34\uffff\1\15"+
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

    static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
    static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
    static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
    static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
    static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
    static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
    static final short[][] DFA100_transition;

    static {
        int numStates = DFA100_transitionS.length;
        DFA100_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
        }
    }

    class DFA100 extends DFA {

        public DFA100(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 100;
            this.eot = DFA100_eot;
            this.eof = DFA100_eof;
            this.min = DFA100_min;
            this.max = DFA100_max;
            this.accept = DFA100_accept;
            this.special = DFA100_special;
            this.transition = DFA100_transition;
        }
        public String getDescription() {
            return "494:1: typedef_clause : ( ( defpattern ( NL )? '=' )=> defpattern ( NL )? '=' ( NL )? expr -> ^( TYPEDEF_CLAUSE defpattern expr ) | defpattern -> ^( TYPEDEF_CLAUSE defpattern ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA100_1 = input.LA(1);

                         
                        int index100_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA100_2 = input.LA(1);

                         
                        int index100_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA100_3 = input.LA(1);

                         
                        int index100_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA100_4 = input.LA(1);

                         
                        int index100_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA100_5 = input.LA(1);

                         
                        int index100_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA100_6 = input.LA(1);

                         
                        int index100_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA100_7 = input.LA(1);

                         
                        int index100_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA100_8 = input.LA(1);

                         
                        int index100_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA100_9 = input.LA(1);

                         
                        int index100_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA100_10 = input.LA(1);

                         
                        int index100_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA100_11 = input.LA(1);

                         
                        int index100_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA100_12 = input.LA(1);

                         
                        int index100_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA100_13 = input.LA(1);

                         
                        int index100_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_babel17()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index100_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 100, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA136_eotS =
        "\34\uffff";
    static final String DFA136_eofS =
        "\34\uffff";
    static final String DFA136_minS =
        "\1\103\17\0\14\uffff";
    static final String DFA136_maxS =
        "\1\u00a1\17\0\14\uffff";
    static final String DFA136_acceptS =
        "\20\uffff\1\2\12\uffff\1\1";
    static final String DFA136_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\14\uffff}>";
    static final String[] DFA136_transitionS = {
            "\1\20\1\uffff\3\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\11\3\20\1\uffff\1\6\1\7\2\20\1\10\4\uffff"+
            "\1\20\17\uffff\1\12\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
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

    static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
    static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
    static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
    static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
    static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
    static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
    static final short[][] DFA136_transition;

    static {
        int numStates = DFA136_transitionS.length;
        DFA136_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
        }
    }

    class DFA136 extends DFA {

        public DFA136(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 136;
            this.eot = DFA136_eot;
            this.eof = DFA136_eof;
            this.min = DFA136_min;
            this.max = DFA136_max;
            this.accept = DFA136_accept;
            this.special = DFA136_special;
            this.transition = DFA136_transition;
        }
        public String getDescription() {
            return "540:1: expr_or_assign : ( ( ( pattern | objelem_assign ) ( NL )? '=' )=> ( pattern | objelem_assign ) ( NL )? '=' ( NL )? expr -> ^( ASSIGN ( pattern )* ( objelem_assign )* expr ) | expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA136_1 = input.LA(1);

                         
                        int index136_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA136_2 = input.LA(1);

                         
                        int index136_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA136_3 = input.LA(1);

                         
                        int index136_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA136_4 = input.LA(1);

                         
                        int index136_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA136_5 = input.LA(1);

                         
                        int index136_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA136_6 = input.LA(1);

                         
                        int index136_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA136_7 = input.LA(1);

                         
                        int index136_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA136_8 = input.LA(1);

                         
                        int index136_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA136_9 = input.LA(1);

                         
                        int index136_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA136_10 = input.LA(1);

                         
                        int index136_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA136_11 = input.LA(1);

                         
                        int index136_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA136_12 = input.LA(1);

                         
                        int index136_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA136_13 = input.LA(1);

                         
                        int index136_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA136_14 = input.LA(1);

                         
                        int index136_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA136_15 = input.LA(1);

                         
                        int index136_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_babel17()) ) {s = 27;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index136_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 136, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA146_eotS =
        "\33\uffff";
    static final String DFA146_eofS =
        "\33\uffff";
    static final String DFA146_minS =
        "\1\103\3\0\1\uffff\12\0\14\uffff";
    static final String DFA146_maxS =
        "\1\u00a1\3\0\1\uffff\12\0\14\uffff";
    static final String DFA146_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA146_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA146_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\12\3\20\1\uffff\1\7\1\10\2\20\1\11\4\uffff"+
            "\1\20\17\uffff\1\13\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
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

    static final short[] DFA146_eot = DFA.unpackEncodedString(DFA146_eotS);
    static final short[] DFA146_eof = DFA.unpackEncodedString(DFA146_eofS);
    static final char[] DFA146_min = DFA.unpackEncodedStringToUnsignedChars(DFA146_minS);
    static final char[] DFA146_max = DFA.unpackEncodedStringToUnsignedChars(DFA146_maxS);
    static final short[] DFA146_accept = DFA.unpackEncodedString(DFA146_acceptS);
    static final short[] DFA146_special = DFA.unpackEncodedString(DFA146_specialS);
    static final short[][] DFA146_transition;

    static {
        int numStates = DFA146_transitionS.length;
        DFA146_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA146_transition[i] = DFA.unpackEncodedString(DFA146_transitionS[i]);
        }
    }

    class DFA146 extends DFA {

        public DFA146(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 146;
            this.eot = DFA146_eot;
            this.eof = DFA146_eof;
            this.min = DFA146_min;
            this.max = DFA146_max;
            this.accept = DFA146_accept;
            this.special = DFA146_special;
            this.transition = DFA146_transition;
        }
        public String getDescription() {
            return "579:1: lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA146_0 = input.LA(1);

                         
                        int index146_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA146_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA146_0==Constr) ) {s = 2;}

                        else if ( (LA146_0==Id) ) {s = 3;}

                        else if ( (LA146_0==UNDERSCORE) && (synpred11_babel17())) {s = 4;}

                        else if ( (LA146_0==String) ) {s = 5;}

                        else if ( (LA146_0==Num) ) {s = 6;}

                        else if ( (LA146_0==L_true) ) {s = 7;}

                        else if ( (LA146_0==L_false) ) {s = 8;}

                        else if ( (LA146_0==L_nil) ) {s = 9;}

                        else if ( ((LA146_0>=A_infinity && LA146_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA146_0==MINUS) ) {s = 11;}

                        else if ( (LA146_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA146_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA146_0==L_exception) ) {s = 14;}

                        else if ( ((LA146_0>=A_ELLIPSIS && LA146_0<=U_ELLIPSIS)) && (synpred11_babel17())) {s = 15;}

                        else if ( (LA146_0==L_begin||(LA146_0>=L_with && LA146_0<=L_if)||(LA146_0>=L_while && LA146_0<=L_for)||LA146_0==L_match||LA146_0==L_try||(LA146_0>=L_concurrent && LA146_0<=L_lazy)||(LA146_0>=L_this && LA146_0<=L_random)||LA146_0==L_typeof||LA146_0==A_NOT||LA146_0==U_NOT||LA146_0==L_force) ) {s = 16;}

                         
                        input.seek(index146_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA146_1 = input.LA(1);

                         
                        int index146_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_babel17()) ) {s = 26;}

                        else if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA146_2 = input.LA(1);

                         
                        int index146_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA146_3 = input.LA(1);

                         
                        int index146_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA146_5 = input.LA(1);

                         
                        int index146_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA146_6 = input.LA(1);

                         
                        int index146_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA146_7 = input.LA(1);

                         
                        int index146_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA146_8 = input.LA(1);

                         
                        int index146_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA146_9 = input.LA(1);

                         
                        int index146_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA146_10 = input.LA(1);

                         
                        int index146_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA146_11 = input.LA(1);

                         
                        int index146_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA146_12 = input.LA(1);

                         
                        int index146_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA146_13 = input.LA(1);

                         
                        int index146_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA146_14 = input.LA(1);

                         
                        int index146_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index146_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 146, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA147_eotS =
        "\33\uffff";
    static final String DFA147_eofS =
        "\33\uffff";
    static final String DFA147_minS =
        "\1\103\3\0\1\uffff\12\0\14\uffff";
    static final String DFA147_maxS =
        "\1\u00a1\3\0\1\uffff\12\0\14\uffff";
    static final String DFA147_acceptS =
        "\4\uffff\1\2\12\uffff\1\2\1\3\11\uffff\1\1";
    static final String DFA147_specialS =
        "\1\0\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\14\uffff}>";
    static final String[] DFA147_transitionS = {
            "\1\20\2\uffff\2\20\3\uffff\2\20\2\uffff\1\20\5\uffff\1\16\2"+
            "\uffff\1\20\1\uffff\2\12\3\20\1\uffff\1\7\1\10\2\20\1\11\4\uffff"+
            "\1\20\17\uffff\1\13\5\uffff\1\20\2\uffff\1\20\12\uffff\2\17"+
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

    static final short[] DFA147_eot = DFA.unpackEncodedString(DFA147_eotS);
    static final short[] DFA147_eof = DFA.unpackEncodedString(DFA147_eofS);
    static final char[] DFA147_min = DFA.unpackEncodedStringToUnsignedChars(DFA147_minS);
    static final char[] DFA147_max = DFA.unpackEncodedStringToUnsignedChars(DFA147_maxS);
    static final short[] DFA147_accept = DFA.unpackEncodedString(DFA147_acceptS);
    static final short[] DFA147_special = DFA.unpackEncodedString(DFA147_specialS);
    static final short[][] DFA147_transition;

    static {
        int numStates = DFA147_transitionS.length;
        DFA147_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA147_transition[i] = DFA.unpackEncodedString(DFA147_transitionS[i]);
        }
    }

    class DFA147 extends DFA {

        public DFA147(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 147;
            this.eot = DFA147_eot;
            this.eof = DFA147_eof;
            this.min = DFA147_min;
            this.max = DFA147_max;
            this.accept = DFA147_accept;
            this.special = DFA147_special;
            this.transition = DFA147_transition;
        }
        public String getDescription() {
            return "584:1: p_lop_expr : ( ( lambda_expr )=> lambda_expr | ( lambda_expr_nobrackets )=> lambda_expr_nobrackets | p_op_expr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA147_0 = input.LA(1);

                         
                        int index147_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA147_0==ROUND_BRACKET_OPEN) ) {s = 1;}

                        else if ( (LA147_0==Constr) ) {s = 2;}

                        else if ( (LA147_0==Id) ) {s = 3;}

                        else if ( (LA147_0==UNDERSCORE) && (synpred13_babel17())) {s = 4;}

                        else if ( (LA147_0==String) ) {s = 5;}

                        else if ( (LA147_0==Num) ) {s = 6;}

                        else if ( (LA147_0==L_true) ) {s = 7;}

                        else if ( (LA147_0==L_false) ) {s = 8;}

                        else if ( (LA147_0==L_nil) ) {s = 9;}

                        else if ( ((LA147_0>=A_infinity && LA147_0<=U_infinity)) ) {s = 10;}

                        else if ( (LA147_0==MINUS) ) {s = 11;}

                        else if ( (LA147_0==SQUARE_BRACKET_OPEN) ) {s = 12;}

                        else if ( (LA147_0==CURLY_BRACKET_OPEN) ) {s = 13;}

                        else if ( (LA147_0==L_exception) ) {s = 14;}

                        else if ( ((LA147_0>=A_ELLIPSIS && LA147_0<=U_ELLIPSIS)) && (synpred13_babel17())) {s = 15;}

                        else if ( (LA147_0==L_begin||(LA147_0>=L_with && LA147_0<=L_if)||(LA147_0>=L_while && LA147_0<=L_for)||LA147_0==L_match||LA147_0==L_try||(LA147_0>=L_concurrent && LA147_0<=L_lazy)||(LA147_0>=L_this && LA147_0<=L_random)||LA147_0==L_typeof||LA147_0==A_NOT||LA147_0==U_NOT||LA147_0==L_force) ) {s = 16;}

                         
                        input.seek(index147_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA147_1 = input.LA(1);

                         
                        int index147_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_babel17()) ) {s = 26;}

                        else if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA147_2 = input.LA(1);

                         
                        int index147_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA147_3 = input.LA(1);

                         
                        int index147_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA147_5 = input.LA(1);

                         
                        int index147_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA147_6 = input.LA(1);

                         
                        int index147_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA147_7 = input.LA(1);

                         
                        int index147_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA147_8 = input.LA(1);

                         
                        int index147_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA147_9 = input.LA(1);

                         
                        int index147_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA147_10 = input.LA(1);

                         
                        int index147_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA147_11 = input.LA(1);

                         
                        int index147_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA147_12 = input.LA(1);

                         
                        int index147_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA147_13 = input.LA(1);

                         
                        int index147_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA147_14 = input.LA(1);

                         
                        int index147_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_babel17()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index147_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 147, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA297_eotS =
        "\20\uffff";
    static final String DFA297_eofS =
        "\20\uffff";
    static final String DFA297_minS =
        "\1\103\10\uffff\1\103\4\uffff\1\103\1\uffff";
    static final String DFA297_maxS =
        "\1\u009f\10\uffff\1\u00a2\4\uffff\1\u00a2\1\uffff";
    static final String DFA297_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\1\15\1\uffff\1\11";
    static final String DFA297_specialS =
        "\20\uffff}>";
    static final String[] DFA297_transitionS = {
            "\1\14\2\uffff\2\14\3\uffff\2\14\2\uffff\1\14\10\uffff\1\14\1"+
            "\uffff\2\12\4\uffff\1\5\1\6\1\7\1\uffff\1\10\61\uffff\1\4\1"+
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
            "\uffff\1\13\1\uffff\5\13\1\uffff\5\13\4\uffff\1\13\17\uffff"+
            "\1\13\5\uffff\1\13\2\uffff\1\13\12\uffff\2\13\3\uffff\1\13\2"+
            "\uffff\1\16\3\13\1\uffff\4\13\1\uffff\1\13\1\uffff\1\13\1\17",
            "",
            "",
            "",
            "",
            "\1\13\1\uffff\3\13\3\uffff\2\13\2\uffff\1\13\5\uffff\1\13\2"+
            "\uffff\1\13\1\uffff\5\13\1\uffff\5\13\4\uffff\1\13\17\uffff"+
            "\1\13\5\uffff\1\13\2\uffff\1\13\12\uffff\2\13\3\uffff\1\13\3"+
            "\uffff\3\13\1\uffff\4\13\1\uffff\1\13\1\uffff\1\13\1\17",
            ""
    };

    static final short[] DFA297_eot = DFA.unpackEncodedString(DFA297_eotS);
    static final short[] DFA297_eof = DFA.unpackEncodedString(DFA297_eofS);
    static final char[] DFA297_min = DFA.unpackEncodedStringToUnsignedChars(DFA297_minS);
    static final char[] DFA297_max = DFA.unpackEncodedStringToUnsignedChars(DFA297_maxS);
    static final short[] DFA297_accept = DFA.unpackEncodedString(DFA297_acceptS);
    static final short[] DFA297_special = DFA.unpackEncodedString(DFA297_specialS);
    static final short[][] DFA297_transition;

    static {
        int numStates = DFA297_transitionS.length;
        DFA297_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA297_transition[i] = DFA.unpackEncodedString(DFA297_transitionS[i]);
        }
    }

    class DFA297 extends DFA {

        public DFA297(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 297;
            this.eot = DFA297_eot;
            this.eof = DFA297_eof;
            this.min = DFA297_min;
            this.max = DFA297_max;
            this.accept = DFA297_accept;
            this.special = DFA297_special;
            this.transition = DFA297_transition;
        }
        public String getDescription() {
            return "773:1: primitive_expr : ( Num | String | Id | Constr | L_true | L_false | L_this | L_nil | type_expr | token_infinity | list_expr | with_control_expr | map_or_set_expr );";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog250 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_Id_in_typeid1690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_typeid1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_typeid1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_typeid1698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_typeid1701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_typeid_in_typeannotation1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_typeannotation1726 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_typeannotation1728 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_typeannotation1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_pattern1748 = new BitSet(new long[]{0x0000000000000002L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_pattern1751 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_pattern1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_pattern1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_pattern1776 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADA00000L});
    public static final BitSet FOLLOW_NL_in_pattern1778 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002AD800000L});
    public static final BitSet FOLLOW_primitive_pattern_in_pattern1781 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_L_exception_in_pattern1800 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_pattern1802 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_pattern1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ELLIPSIS_in_pattern1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1828 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_defpattern1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_defpattern1834 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADA00000L});
    public static final BitSet FOLLOW_NL_in_defpattern1836 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002AD800000L});
    public static final BitSet FOLLOW_primitive_pattern_in_defpattern1839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_Constr_in_defpattern1857 = new BitSet(new long[]{0x0000000000000002L,0x020000130C000000L,0x00000002ADC00000L});
    public static final BitSet FOLLOW_defpattern_in_defpattern1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_casepattern1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_casepattern1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_casepattern1895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_casepattern1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_typeannotation_in_casepattern1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_casepattern1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_L_as_in_bracket_pattern1948 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1950 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_bracket_pattern1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000220000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_bracket_pattern1987 = new BitSet(new long[]{0x0000000000000002L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern1990 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_bracket_pattern2019 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_bracket_pattern2036 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2038 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_for_in_bracket_pattern2060 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498F8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2062 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498F8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern2066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_bracket_pattern2073 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2075 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_bracket_pattern2078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_bracket_pattern2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_L_if_in_bracket_pattern2118 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2120 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_bracket_pattern2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_bracket_pattern2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_bracket_pattern2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_typeannotation_in_bracket_pattern2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_bracket_pattern2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_ARROW_in_arrow_or_assign2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_arrow_or_assign2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2210 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2213 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_arrow_or_assign_in_mselem_pattern2216 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_mselem_pattern2218 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_mselem_pattern2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_pattern2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERSCORE_in_primitive_pattern2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_pattern2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_pattern2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_pattern2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_pattern2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2294 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2296 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_pattern2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_primitive_pattern2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_Num_in_primitive_pattern2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_primitive_pattern2330 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2333 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2344 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2346 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040008000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_primitive_pattern2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_primitive_pattern2379 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2382 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2393 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2396 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_bracket_pattern_in_primitive_pattern2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_primitive_pattern2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2448 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2451 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_COMMA_in_primitive_pattern2462 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2465 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2498E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_mselem_pattern_in_primitive_pattern2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_primitive_pattern2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_token_ARROW_in_primitive_pattern2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100200000L});
    public static final BitSet FOLLOW_NL_in_primitive_pattern2503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_primitive_pattern2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sep2522 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2538 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_block2541 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2544 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_block2546 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_block2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sep_in_block2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_pure_block2583 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_sep_in_pure_block2586 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_statement_in_pure_block2588 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_st_typedef_in_statement2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_val_in_statement2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_def_in_statement2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_yield_in_statement2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_memoize_in_statement2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_private_in_statement2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_module_in_statement2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_st_import_in_statement2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_assign_in_statement2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PRINT_in_statement2661 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_LOG_in_statement2677 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_PROFILE_in_statement2693 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRAGMA_ASSERT_in_statement2709 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_statement2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_objelem_assign2731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_objelem_assign2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_val_in_st_val2752 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_st_val2754 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_st_val2758 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_st_val2762 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_val2765 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_val2768 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_val2770 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_val2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_def2802 = new BitSet(new long[]{0x0000000200000000L,0x020000130C000000L,0x00000006ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_def2804 = new BitSet(new long[]{0x0000000200000000L,0x020000130C000000L,0x00000006ADC00000L});
    public static final BitSet FOLLOW_defpattern_in_st_def2808 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_st_def2810 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_st_def2821 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2823 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2828 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_def2830 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_def2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_def_in_st_def2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_L_this_in_st_def2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_st_def2866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_st_def2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_def2871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_st_def2874 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_st_def2876 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_st_def2879 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_st_def2881 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_def2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_typedef_in_st_typedef2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_typedef2912 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2914 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_typedef2923 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_NL_in_st_typedef2925 = new BitSet(new long[]{0x0000000000000000L,0x020000130C000000L,0x00000002ADE00000L});
    public static final BitSet FOLLOW_typedef_clause_in_st_typedef2928 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2966 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2968 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_typedef_clause2971 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_typedef_clause2973 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_typedef_clause2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_typedef_clause2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_yield_in_st_yield3010 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_st_yield3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_memoize_in_st_memoize3033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize3035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_memoize3038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_memoize3041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008A00000L});
    public static final BitSet FOLLOW_NL_in_st_memoize3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008800000L});
    public static final BitSet FOLLOW_memo_id_in_st_memoize3046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_Id_in_memo_id3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_memo_id3088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_memo_id3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_memo_id3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_private_in_st_private3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_private_id_in_st_private3111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_NL_in_st_private3114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_st_private3117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_private3119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_private_id_in_st_private3122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000208000L});
    public static final BitSet FOLLOW_Id_in_private_id3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_testid0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testid_in_moduleid3181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_moduleid3184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_moduleid3187 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_moduleid3189 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_testid_in_moduleid3192 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_L_module_in_st_module3212 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_module3214 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_moduleid_in_st_module3217 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_st_module3219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_st_module3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testid_in_importprefix3241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_importprefix3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_importprefix3247 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importprefix3249 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_testid_in_importprefix3252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_UNDERSCORE_in_importall3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testid_in_importsetclause3290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_importsetclause3293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_importsetclause3296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importsetclause3299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_importsetclause3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_importsetclause3322 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_importsetclause3324 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_testid_in_importsetclause3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_importall_in_importsetclause3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_importset3350 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_NL_in_importset3352 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_importsetclause_in_importset3355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_importset3358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_importset3361 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_NL_in_importset3363 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_importsetclause_in_importset3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_importset3370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_importset3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_import_in_st_import3391 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_import3393 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_importprefix_in_st_import3396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210600L});
    public static final BitSet FOLLOW_NL_in_st_import3399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000210600L});
    public static final BitSet FOLLOW_PERIOD_in_st_import3403 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_NL_in_st_import3405 = new BitSet(new long[]{0x0000000000000000L,0x0200100000000000L,0x0000000200A00000L});
    public static final BitSet FOLLOW_importall_in_st_import3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_st_import3412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080200000L});
    public static final BitSet FOLLOW_NL_in_st_import3414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080200000L});
    public static final BitSet FOLLOW_importset_in_st_import3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_st_import3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_st_import3423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_st_import3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_expr_or_assign3474 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_expr_or_assign3478 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3481 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr_or_assign3484 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_expr_or_assign3486 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_or_assign3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lop_expr_in_expr3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_expr3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_expr_in_control_expr3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_do_expr_in_control_expr3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_match_expr_in_control_expr3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_expr_in_control_expr3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_expr_in_control_expr3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_begin_end_in_control_expr3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_expr_in_with_control_expr3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_with_in_with_control_expr3575 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3577 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_with_control_expr3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_with_control_expr3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_do_in_with_control_expr3585 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_with_control_expr3587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_with_control_expr3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_lop_expr_in_protected_expr3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_obj_expr_in_protected_expr3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_protected_expr_nc3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_begin_in_begin_end3640 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_begin_end3642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_begin_end3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_parents3662 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMES_in_parents3677 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_primitive_expr_in_parents3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3707 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_obj_expr3709 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_parents_in_obj_expr3712 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_obj_expr3714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_obj_expr3744 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_obj_expr3746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_obj_expr3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_lop_expr3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_lop_expr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_op_expr_in_lop_expr3792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_p_lop_expr3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_p_lop_expr3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_op_expr_in_p_lop_expr3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_if_in_if_expr3834 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_if_expr3836 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_if_expr3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_L_then_in_if_expr3844 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CDEF8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000610L});
    public static final BitSet FOLLOW_L_elseif_in_if_expr3852 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_if_expr3854 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_if_expr3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_if_expr3859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_L_then_in_if_expr3862 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CDEF8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000610L});
    public static final BitSet FOLLOW_L_else_in_if_expr3872 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_if_expr3874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_if_expr3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_while_in_while_do_expr3902 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3904 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_while_do_expr3907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_while_do_expr3909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_do_in_while_do_expr3912 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_while_do_expr3914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_while_do_expr3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_full_cases_in_cases3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_cases3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_cases3953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_cases3956 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_cases3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_case_expr_in_full_cases3981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_L_case_in_case_expr4002 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_case_expr4004 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_casepattern_in_case_expr4007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_case_expr4009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_case_expr4012 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_case_expr4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_match_in_match_expr4035 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_match_expr4037 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_op_expr_in_match_expr4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_match_expr4042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000200000L});
    public static final BitSet FOLLOW_full_cases_in_match_expr4045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_match_expr4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_try_in_try_expr4073 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_try_expr4075 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_try_expr4078 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_try_expr4080 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_L_catch_in_try_expr4083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_try_expr4085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000200000L});
    public static final BitSet FOLLOW_full_cases_in_try_expr4088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_try_expr4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_lambda_expr4114 = new BitSet(new long[]{0x0000000000000000L,0x020000130C210000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr4116 = new BitSet(new long[]{0x0000000000000000L,0x020000130C210000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_lambda_cases_in_lambda_expr4119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_lambda_expr4121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_lambda_expr4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_cases_nobrackets_in_lambda_expr_nobrackets4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases_nobrackets4161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets4163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases_nobrackets4166 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_cases_nobrackets4168 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_lop_expr_in_lambda_cases_nobrackets4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_case_in_lambda_case_expr4199 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4201 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_casepattern_in_lambda_case_expr4204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_case_expr4209 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_case_expr4211 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_lambda_case_expr4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_lambda_cases4235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200600L});
    public static final BitSet FOLLOW_token_DOUBLE_ARROW_in_lambda_cases4240 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4242 = new BitSet(new long[]{0x0000000000000000L,0x82000F9FFD2CD8E8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_pure_block_in_lambda_cases4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4264 = new BitSet(new long[]{0x0000000000000002L,0x020000130C210000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_lambda_cases4267 = new BitSet(new long[]{0x0000000000000000L,0x020000130C210000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_lambda_case_expr_in_lambda_cases4270 = new BitSet(new long[]{0x0000000000000002L,0x020000130C210000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_L_for_in_for_expr4288 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADE06000L});
    public static final BitSet FOLLOW_NL_in_for_expr4290 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_for_expr4293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_for_expr4295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_L_in_in_for_expr4298 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_for_expr4300 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_in_for_expr4303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_for_expr4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_L_do_in_for_expr4308 = new BitSet(new long[]{0x0000000000000000L,0x82800F9FFD2CD8F8L,0x0000007AADE46004L});
    public static final BitSet FOLLOW_block_in_for_expr4310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_L_end_in_for_expr4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_op_expr4337 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_op_expr_in_op_expr4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_expr_in_op_expr4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_builtin_primitive_in_p_op_expr4355 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_op_expr4358 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_op_expr_in_p_op_expr4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_expr_in_p_op_expr4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_builtin_primitive0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_or_expr_in_bool_expr4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_bool_or_expr_in_p_bool_expr4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4430 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4433 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_token_OR_in_bool_or_expr4437 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_or_expr4440 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_and_expr_in_bool_or_expr4444 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4456 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4459 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_token_OR_in_p_bool_or_expr4463 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_or_expr4466 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_and_expr_in_p_bool_or_expr4470 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L,0x0000000000200001L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4482 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4485 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_AND_in_bool_and_expr4489 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_and_expr4492 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_and_expr4496 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4508 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4511 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_AND_in_p_bool_and_expr4515 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_and_expr4518 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_and_expr4522 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_token_NOT_in_bool_not_expr4534 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_bool_not_expr4537 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_bool_not_expr_in_bool_not_expr4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rel_expr_in_bool_not_expr4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_in_p_bool_not_expr4557 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_bool_not_expr4560 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_bool_not_expr_in_p_bool_not_expr4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_rel_expr_in_p_bool_not_expr4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4578 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_rel_expr4581 = new BitSet(new long[]{0x0000000000000000L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rel_op_in_rel_expr4584 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_rel_expr4586 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_expr_in_rel_expr4589 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4616 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4619 = new BitSet(new long[]{0x0000000000000000L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rel_op_in_p_rel_expr4622 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_rel_expr4624 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_expr_in_p_rel_expr4627 = new BitSet(new long[]{0x0000000000000002L,0x007FE00000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_token_EQUAL_in_rel_op4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_NOT_EQUAL_in_rel_op4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_rel_op4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_GREATER_EQ_in_rel_op4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_rel_op4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_LESS_EQ_in_rel_op4673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusplus_expr_in_arith_expr4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_plusplus_expr_in_p_arith_expr4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4705 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_PLUSPLUS_in_plusplus_expr4713 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUSMINUS_in_plusplus_expr4716 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_plusplus_expr4720 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_timestimes_expr_in_plusplus_expr4724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_PLUSPLUS_in_p_plusplus_expr4744 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUSMINUS_in_p_plusplus_expr4747 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_plusplus_expr4751 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_timestimes_expr_in_p_plusplus_expr4755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200180L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_TIMESTIMES_in_timestimes_expr4775 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_timestimes_expr4778 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_timestimes_expr4782 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_simple_expr_in_timestimes_expr4786 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4799 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_TIMESTIMES_in_p_timestimes_expr4807 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_QUOTIENTQUOTIENT_in_p_timestimes_expr4810 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_timestimes_expr4814 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_simple_expr_in_p_timestimes_expr4818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200060L});
    public static final BitSet FOLLOW_cons_expr_in_simple_expr4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_cons_expr_in_p_simple_expr4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4847 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_cons_expr4850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_cons_expr4853 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_cons_expr4855 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_to_expr_in_cons_expr4858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4878 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_token_DOUBLE_COLON_in_p_cons_expr4884 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_cons_expr4886 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_to_expr_in_p_cons_expr4889 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200018L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_to_expr4912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_L_to_in_to_expr4917 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_L_downto_in_to_expr4921 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_to_expr4925 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_plus_expr_in_to_expr4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_L_to_in_p_to_expr4950 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_L_downto_in_p_to_expr4954 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_to_expr4958 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_plus_expr_in_p_to_expr4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4974 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4978 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_PLUS_in_arith_plus_expr4982 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_MINUS_in_arith_plus_expr4987 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_plus_expr4991 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_uminus_expr_in_arith_plus_expr4995 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr5006 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr5009 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_plus_expr5013 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_plus_expr5022 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_uminus_expr_in_p_arith_plus_expr5026 = new BitSet(new long[]{0x0000000000000002L,0x0300000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_MINUS_in_arith_uminus_expr5039 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_uminus_expr5041 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_mult_expr_in_arith_uminus_expr5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_p_arith_uminus_expr5068 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_uminus_expr5070 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_p_arith_mult_expr_in_p_arith_uminus_expr5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr5095 = new BitSet(new long[]{0x0000000000000002L,0x0C00006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr5098 = new BitSet(new long[]{0x0000000000000000L,0x0C00006000000000L});
    public static final BitSet FOLLOW_set_in_arith_mult_expr5102 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_mult_expr5119 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_arith_pow_expr_in_arith_mult_expr5123 = new BitSet(new long[]{0x0000000000000002L,0x0C00006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5135 = new BitSet(new long[]{0x0000000000000002L,0x0C00006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr5138 = new BitSet(new long[]{0x0000000000000000L,0x0C00006000000000L});
    public static final BitSet FOLLOW_set_in_p_arith_mult_expr5142 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_mult_expr5159 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_arith_pow_expr_in_p_arith_mult_expr5163 = new BitSet(new long[]{0x0000000000000002L,0x0C00006000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr5174 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr5177 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_arith_pow_expr5180 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_arith_pow_expr5182 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_apply_expr_in_arith_pow_expr5185 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr5206 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5209 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_POW_tok_in_p_arith_pow_expr5212 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_arith_pow_expr5214 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_apply_expr_in_p_arith_pow_expr5217 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_basic_expr_in_apply_expr5238 = new BitSet(new long[]{0x0000000000000002L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5256 = new BitSet(new long[]{0x0000000000000002L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_p_apply_expr5259 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098C8L,0x00000002ADC46004L});
    public static final BitSet FOLLOW_p_basic_expr_in_p_apply_expr5262 = new BitSet(new long[]{0x0000000000000002L,0x8200021F7D2098C8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_message_send_expr_in_basic_expr5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_send_expr_in_p_basic_expr5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitive_expr_in_message_send_expr5300 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PERIOD_in_message_send_expr5306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_message_send_expr5308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_Id_in_message_send_expr5311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_OPEN_in_list_expr5335 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5337 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002EDE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5347 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5349 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_SQUARE_BRACKET_CLOSE_in_list_expr5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_list_expr5375 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5377 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002BDE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5387 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_list_expr5389 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_list_expr5392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010208000L});
    public static final BitSet FOLLOW_NL_in_list_expr5396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
    public static final BitSet FOLLOW_COMMA_in_list_expr5400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_list_expr5402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_list_expr5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5438 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5440 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000003ADE46004L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_COMMA_in_map_or_set_expr5450 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5452 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_map_or_set_elem_expr_in_map_or_set_expr5455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100208000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100008000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_BRACKET_OPEN_in_map_or_set_expr5484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_token_ARROW_in_map_or_set_expr5489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100200000L});
    public static final BitSet FOLLOW_NL_in_map_or_set_expr5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_CURLY_BRACKET_CLOSE_in_map_or_set_expr5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5511 = new BitSet(new long[]{0x0000000200000002L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5514 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000201800L});
    public static final BitSet FOLLOW_arrow_or_assign_in_map_or_set_elem_expr5517 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_NL_in_map_or_set_elem_expr5519 = new BitSet(new long[]{0x0000000000000000L,0x8200021F7D2098E8L,0x00000002ADE46004L});
    public static final BitSet FOLLOW_protected_expr_nc_in_map_or_set_elem_expr5522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROUND_BRACKET_OPEN_in_type_expr5549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_type_expr5551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_type_expr5554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_NL_in_type_expr5556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeid_in_type_expr5559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010200000L});
    public static final BitSet FOLLOW_NL_in_type_expr5561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ROUND_BRACKET_CLOSE_in_type_expr5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Num_in_primitive_expr5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_primitive_expr5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_primitive_expr5591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Constr_in_primitive_expr5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_true_in_primitive_expr5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_false_in_primitive_expr5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_this_in_primitive_expr5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_nil_in_primitive_expr5617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_primitive_expr5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_token_infinity_in_primitive_expr5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_expr_in_primitive_expr5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_with_control_expr_in_primitive_expr5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_or_set_expr_in_primitive_expr5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred1_babel171880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_synpred1_babel171882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_synpred1_babel171885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred2_babel171933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred2_babel171935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_L_as_in_synpred2_babel171938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protected_expr_in_synpred3_babel171969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000220000L});
    public static final BitSet FOLLOW_NL_in_synpred3_babel171971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_synpred3_babel171974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Id_in_synpred4_babel172012 = new BitSet(new long[]{0x0000000000000000L,0x020000130C200000L,0x00000002ADC06000L});
    public static final BitSet FOLLOW_pattern_in_synpred4_babel172014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred5_babel172103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred5_babel172105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_L_if_in_synpred5_babel172108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred6_babel172139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400200000L});
    public static final BitSet FOLLOW_NL_in_synpred6_babel172141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_COLON_in_synpred6_babel172144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defpattern_in_synpred7_babel172956 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred7_babel172958 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred7_babel172961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_in_synpred8_babel173458 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_objelem_assign_in_synpred8_babel173462 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred8_babel173465 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ASSIGN_in_synpred8_babel173468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_L_obj_in_synpred9_babel173697 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_NL_in_synpred9_babel173699 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_parents_in_synpred9_babel173702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred10_babel173771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred11_babel173782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_in_synpred12_babel173803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_expr_nobrackets_in_synpred13_babel173814 = new BitSet(new long[]{0x0000000000000002L});

}