package com.babel17.netbeans;

import com.babel17.antlr.babel17Lexer;

public enum TokenType {

  COMMENT(babel17Lexer.COMMENT, "comment"),
  LINECOMMENT(babel17Lexer.LINECOMMENT, "comment"),

  BEGIN(babel17Lexer.L_begin),
  END(babel17Lexer.L_end),
  OBJECT(babel17Lexer.L_obj),
  WITH(babel17Lexer.L_with),
  IF(babel17Lexer.L_if),
  THEN(babel17Lexer.L_then),
  ELSE(babel17Lexer.L_else),
  ELSEIF(babel17Lexer.L_elseif),
  WHILE(babel17Lexer.L_while),
  FOR(babel17Lexer.L_for),
  DO(babel17Lexer.L_do),
  YIELD(babel17Lexer.L_yield),
  MATCH(babel17Lexer.L_match),
  CASE(babel17Lexer.L_case),
  AS(babel17Lexer.L_as),
  VAL(babel17Lexer.L_val),
  DEF(babel17Lexer.L_def),
  IN(babel17Lexer.L_in),
  EXCEPTION(babel17Lexer.L_exception),
  TO(babel17Lexer.L_to, "keyword_operator"),
  DOWNTO(babel17Lexer.L_downto, "keyword_operator"),
  CONCURRENT(babel17Lexer.L_concurrent),
  CHOOSE(babel17Lexer.L_choose, "keyword_operator"),
  LAZY(babel17Lexer.L_lazy),
  LENS(babel17Lexer.L_lens),
  MEMOIZE(babel17Lexer.L_memoize),
  THIS(babel17Lexer.L_this, "keyword_operator"),
  RANDOM(babel17Lexer.L_random, "keyword_operator"),
  FORCE(babel17Lexer.L_force),
  DIV(babel17Lexer.L_div, "keyword_operator"),
  MOD(babel17Lexer.L_mod, "keyword_operator"),
  TRY(babel17Lexer.L_try),
  CATCH(babel17Lexer.L_catch),
  MODULE(babel17Lexer.L_module),
  TYPEDEF(babel17Lexer.L_typedef),
  TYPEOF(babel17Lexer.L_typeof, "keyword_operator"),
  PRIVATE(babel17Lexer.L_private),
  IMPORT(babel17Lexer.L_import),
  UNITTEST(babel17Lexer.L_unittest, "unittest"),
  AND(babel17Lexer.L_and, "keyword_operator"),
  OR(babel17Lexer.L_or, "keyword_operator"),
  NOT(babel17Lexer.L_not, "keyword_operator"),
  XOR(babel17Lexer.L_xor, "keyword_operator"),  
  ROOT(babel17Lexer.L_root, "keyword_operator"),
  NATIVE(babel17Lexer.L_native, "keyword_operator"),
  MAX(babel17Lexer.L_max, "keyword_operator"),
  MIN(babel17Lexer.L_min, "keyword_operator"),


  COLON(babel17Lexer.COLON, "operator"),
  A_EQUAL(babel17Lexer.A_EQUAL, "operator"),
  U_EQUAL(babel17Lexer.U_EQUAL, "symbol_equal"),
  A_NOT_EQUAL(babel17Lexer.A_NOT_EQUAL, "operator"),
  U_NOT_EQUAL(babel17Lexer.U_NOT_EQUAL, "symbol_not_equal"),
  LESS(babel17Lexer.LESS, "operator"),
  A_LESS_EQ(babel17Lexer.A_LESS_EQ, "operator"),
  U_LESS_EQ(babel17Lexer.U_LESS_EQ, "symbol_less_eq"),
  GREATER(babel17Lexer.GREATER, "operator"),
  A_GREATER_EQ(babel17Lexer.A_GREATER_EQ, "operator"),
  U_GREATER_EQ(babel17Lexer.U_GREATER_EQ, "symbol_greater_eq"),
  PLUS(babel17Lexer.PLUS, "operator"),
  MINUS(babel17Lexer.MINUS, "operator"),
  TIMES(babel17Lexer.TIMES, "operator"),
  QUOT(babel17Lexer.QUOTIENT, "operator"),
  POW(babel17Lexer.POW_tok, "operator"),
  A_DOUBLE_COLON(babel17Lexer.A_DOUBLE_COLON, "operator"),
  U_DOUBLE_COLON(babel17Lexer.U_DOUBLE_COLON, "symbol_double_colon"),
  TIMESTIMES(babel17Lexer.TIMESTIMES, "operator"),
  QUOTQUOT(babel17Lexer.QUOTIENTQUOTIENT, "operator"),
  PLUSPLUS(babel17Lexer.PLUSPLUS, "operator"),
  MINUSMINUS(babel17Lexer.MINUSMINUS, "operator"),
  A_DOUBLE_ARROW(babel17Lexer.A_DOUBLE_ARROW, "operator"),
  A_ARROW(babel17Lexer.A_ARROW, "operator"),
  A_ELLIPSIS(babel17Lexer.A_ELLIPSIS, "operator"),
  U_DOUBLE_ARROW(babel17Lexer.U_DOUBLE_ARROW, "symbol_double_arrow"),
  U_ARROW(babel17Lexer.U_ARROW, "symbol_arrow"),
  U_ELLIPSIS(babel17Lexer.U_ELLIPSIS, "symbol_ellipsis"),
  PERIOD(babel17Lexer.PERIOD, "operator"),
  QUESTION_MARK(babel17Lexer.QUESTION_MARK, "operator"),
  EXCLAMATION_MARK(babel17Lexer.EXCLAMATION_MARK, "operator"),
  UNDERSCORE(babel17Lexer.UNDERSCORE, "operator"),
  RELATE(babel17Lexer.TOK_RELATE, "operator"),
  CONVERT(babel17Lexer.TOK_CONVERT, "operator"),

  SC(babel17Lexer.SC, "separator"),
  COMMA(babel17Lexer.COMMA, "separator"),
  ASSIGN(babel17Lexer.ASSIGN, "separator"),
  ML_PLUS(babel17Lexer.ML_plus, "separator"),
  ML_PLUSPLUS(babel17Lexer.ML_plusplus, "separator"),
  MR_PLUS(babel17Lexer.MR_plus, "separator"),
  MR_PLUSPLUS(babel17Lexer.MR_plusplus, "separator"),
  ML_MINUS(babel17Lexer.ML_minus, "separator"),
  ML_MINUSMINUS(babel17Lexer.ML_minusminus, "separator"),
  MR_MINUS(babel17Lexer.MR_minus, "separator"),
  MR_MINUSMINUS(babel17Lexer.MR_minusminus, "separator"),
  ML_TIMES(babel17Lexer.ML_times, "separator"),
  ML_TIMESTIMES(babel17Lexer.ML_timestimes, "separator"),
  MR_TIMES(babel17Lexer.MR_times, "separator"),
  MR_TIMESTIMES(babel17Lexer.MR_timestimes, "separator"),
  ML_SLASH(babel17Lexer.ML_slash, "separator"),
  ML_SLASHSLASH(babel17Lexer.ML_slashslash, "separator"),
  MR_SLASH(babel17Lexer.MR_slash, "separator"),
  MR_SLASHSLASH(babel17Lexer.MR_slashslash, "separator"),
  ML_POW(babel17Lexer.ML_pow, "separator"),
  MR_POW(babel17Lexer.MR_pow, "separator"),

  WS(babel17Lexer.WS, "whitespace"),
  NL(babel17Lexer.NL, "whitespace"),

  CONSTR(babel17Lexer.Constr, "constructor"),
  ID(babel17Lexer.Id, "identifier"),
  NUM(babel17Lexer.Num, "number"),
  FLOAT(babel17Lexer.Float, "number"),
  STRING(babel17Lexer.String, "string"),
  TRUE(babel17Lexer.L_true, "boolean"),
  FALSE(babel17Lexer.L_false, "boolean"),
  NIL(babel17Lexer.L_nil, "nil"),

  ROUND_BRACKET_OPEN(babel17Lexer.ROUND_BRACKET_OPEN, "bracket"),
  ROUND_BRACKET_CLOSE(babel17Lexer.ROUND_BRACKET_CLOSE, "bracket"),
  SQUARE_BRACKET_OPEN(babel17Lexer.SQUARE_BRACKET_OPEN, "bracket"),
  SQUARE_BRACKET_CLOSE(babel17Lexer.SQUARE_BRACKET_CLOSE, "bracket"),
  CURLY_BRACKET_OPEN(babel17Lexer.CURLY_BRACKET_OPEN, "bracket"),
  CURLY_BRACKET_CLOSE(babel17Lexer.CURLY_BRACKET_CLOSE, "bracket"),
  
  PRAGMA_ASSERT(babel17Lexer.PRAGMA_ASSERT, "pragma"),
  PRAGMA_CATCH(babel17Lexer.PRAGMA_CATCH, "pragma"),
  PRAGMA_LOG(babel17Lexer.PRAGMA_LOG, "pragma"),
  PRAGMA_PROFILE(babel17Lexer.PRAGMA_PROFILE, "pragma"),
  PRAGMA_PRINT(babel17Lexer.PRAGMA_PRINT, "pragma");
  
  
  public int id;
  public String category;

  private TokenType(int id, String category) {
    this.id = id;
    this.category = category;
  }

  private TokenType(int id) {
    this.id = id;
    this.category = "keyword";
  }

  public static TokenType valueOf(int id) {
    TokenType[] values = values();
    for (TokenType value : values) {
      if (value.id == id) {
        return value;
      }
    }
    throw new IllegalArgumentException("The id " + id + " is not recognized");
  }
}
