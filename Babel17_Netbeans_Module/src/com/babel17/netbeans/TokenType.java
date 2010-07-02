package com.babel17.netbeans;

import com.babel17.antlr.babel17Lexer;

public enum TokenType {

  COMMENT1(babel17Lexer.COMMENT1, "comment"),
  COMMENT2(babel17Lexer.COMMENT2, "comment"),

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
  MODULE(babel17Lexer.L_module),
  PRIVATE(babel17Lexer.L_private),
  PROTECTED(babel17Lexer.L_protected),
  PUBLIC(babel17Lexer.L_public),
  ROOT(babel17Lexer.L_root),
  EXTERNAL(babel17Lexer.L_external),
  CONCURRENT(babel17Lexer.L_concurrent),
  AWAIT(babel17Lexer.L_await),
  LAZY(babel17Lexer.L_lazy),
  MEMOIZE(babel17Lexer.L_memoize),
  THIS(babel17Lexer.L_this),
  HERE(babel17Lexer.L_here),
  RANDOM(babel17Lexer.L_random),
  PACKAGE(babel17Lexer.L_package),

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
  UNRELATED(babel17Lexer.UNRELATED, "operator"),
  PLUS(babel17Lexer.PLUS, "operator"),
  MINUS(babel17Lexer.MINUS, "operator"),
  TIMES(babel17Lexer.TIMES, "operator"),
  DIV(babel17Lexer.DIV, "operator"),
  MOD(babel17Lexer.MOD, "operator"),
  POW(babel17Lexer.POW, "operator"),
  MODULE_KEY(babel17Lexer.MODULE_KEY, "keyword_op"),
  A_OR(babel17Lexer.A_OR, "operator"),
  A_AND(babel17Lexer.A_AND, "operator"),
  A_NOT(babel17Lexer.A_NOT, "operator"),
  A_DOUBLE_COLON(babel17Lexer.A_DOUBLE_COLON, "operator"),
  U_OR(babel17Lexer.U_OR, "symbol_or"),
  U_AND(babel17Lexer.U_AND, "symbol_and"),
  U_NOT(babel17Lexer.U_NOT, "symbol_not"),
  U_DOUBLE_COLON(babel17Lexer.U_DOUBLE_COLON, "symbol_double_colon"),
  TIMESTIMES(babel17Lexer.TIMESTIMES, "operator"),
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
  TILDE(babel17Lexer.TILDE, "keyword_op"),
  UNDERSCORE(babel17Lexer.UNDERSCORE, "operator"),

  SC(babel17Lexer.SC, "separator"),
  COMMA(babel17Lexer.COMMA, "separator"),
  ASSIGN(babel17Lexer.ASSIGN, "separator"),
  COLON(babel17Lexer.COLON, "separator"),

  WS(babel17Lexer.WS, "whitespace"),
  NL(babel17Lexer.NL, "whitespace"),

  CONSTR(babel17Lexer.Constr, "constructor"),
  ID(babel17Lexer.Id, "identifier"),
  NUM(babel17Lexer.Num, "number"),
  STRING(babel17Lexer.String, "string"),
  TRUE(babel17Lexer.L_true, "boolean"),
  FALSE(babel17Lexer.L_false, "boolean"),
  A_INFINITY(babel17Lexer.A_infinity, "number"),
  U_INFINITY(babel17Lexer.U_infinity, "symbol_infinity"),

  ROUND_BRACKET_OPEN(babel17Lexer.ROUND_BRACKET_OPEN, "bracket"),
  ROUND_BRACKET_CLOSE(babel17Lexer.ROUND_BRACKET_CLOSE, "bracket"),
  SQUARE_BRACKET_OPEN(babel17Lexer.SQUARE_BRACKET_OPEN, "bracket"),
  SQUARE_BRACKET_CLOSE(babel17Lexer.SQUARE_BRACKET_CLOSE, "bracket"),
  CURLY_BRACKET_OPEN(babel17Lexer.CURLY_BRACKET_OPEN, "bracket"),
  CURLY_BRACKET_CLOSE(babel17Lexer.CURLY_BRACKET_CLOSE, "bracket");
  
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
