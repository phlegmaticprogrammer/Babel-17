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
  TO(babel17Lexer.L_to),
  DOWNTO(babel17Lexer.L_downto),
  CONCURRENT(babel17Lexer.L_concurrent),
  CHOOSE(babel17Lexer.L_choose),
  LAZY(babel17Lexer.L_lazy),
  MEMOIZE(babel17Lexer.L_memoize),
  THIS(babel17Lexer.L_this),
  RANDOM(babel17Lexer.L_random),
  FORCE(babel17Lexer.L_force),
  DIV(babel17Lexer.L_div),
  MOD(babel17Lexer.L_mod),
  TRY(babel17Lexer.L_try),
  CATCH(babel17Lexer.L_catch),
  MODULE(babel17Lexer.L_module),
  TYPEDEF(babel17Lexer.L_typedef),
  TYPEOF(babel17Lexer.L_typeof),
  PRIVATE(babel17Lexer.L_private),
  IMPORT(babel17Lexer.L_import),
  UNITTEST(babel17Lexer.L_unittest),

  COLON(babel17Lexer.COLON, "keyword"),

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
  A_OR(babel17Lexer.A_OR, "operator"),
  A_AND(babel17Lexer.A_AND, "operator"),
  A_NOT(babel17Lexer.A_NOT, "operator"),
  A_DOUBLE_COLON(babel17Lexer.A_DOUBLE_COLON, "operator"),
  U_OR(babel17Lexer.U_OR, "symbol_or"),
  U_AND(babel17Lexer.U_AND, "symbol_and"),
  U_NOT(babel17Lexer.U_NOT, "symbol_not"),
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
  UNDERSCORE(babel17Lexer.UNDERSCORE, "operator"),

  SC(babel17Lexer.SC, "separator"),
  COMMA(babel17Lexer.COMMA, "separator"),
  ASSIGN(babel17Lexer.ASSIGN, "separator"),

  WS(babel17Lexer.WS, "whitespace"),
  NL(babel17Lexer.NL, "whitespace"),

  CONSTR(babel17Lexer.Constr, "constructor"),
  ID(babel17Lexer.Id, "identifier"),
  NUM(babel17Lexer.Num, "number"),
  STRING(babel17Lexer.String, "string"),
  TRUE(babel17Lexer.L_true, "boolean"),
  FALSE(babel17Lexer.L_false, "boolean"),
  NIL(babel17Lexer.L_nil, "nil"),
  A_INFINITY(babel17Lexer.A_infinity, "number"),
  U_INFINITY(babel17Lexer.U_infinity, "symbol_infinity"),

  ROUND_BRACKET_OPEN(babel17Lexer.ROUND_BRACKET_OPEN, "bracket"),
  ROUND_BRACKET_CLOSE(babel17Lexer.ROUND_BRACKET_CLOSE, "bracket"),
  SQUARE_BRACKET_OPEN(babel17Lexer.SQUARE_BRACKET_OPEN, "bracket"),
  SQUARE_BRACKET_CLOSE(babel17Lexer.SQUARE_BRACKET_CLOSE, "bracket"),
  CURLY_BRACKET_OPEN(babel17Lexer.CURLY_BRACKET_OPEN, "bracket"),
  CURLY_BRACKET_CLOSE(babel17Lexer.CURLY_BRACKET_CLOSE, "bracket"),
  
  PRAGMA_ASSERT(babel17Lexer.PRAGMA_ASSERT, "pragma"),
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
