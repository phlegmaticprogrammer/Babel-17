package com.babel17.interpreter.parser;

import com.babel17.antlr.babel17Parser;
import com.babel17.antlr.babel17Lexer;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import com.babel17.syntaxtree.*;
import com.babel17.syntaxtree.patterns.*;
import java.util.*;

public class Parser {

  public static Collection<String> KEYWORDS =
    Collections.unmodifiableCollection(keywords());

  private static TreeSet<String> keywords() {
    TreeSet<String> k = new TreeSet<String>();
    k.add("begin");
    k.add("end");
    k.add("object");
    k.add("with");
    k.add("if");
    k.add("then");
    k.add("else");
    k.add("elseif");
    k.add("while");
    k.add("for");
    k.add("do");
    k.add("yield");
    k.add("match");
    k.add("case");
    k.add("as");
    k.add("val");
    k.add("def");
    k.add("in");
    k.add("exception");
    k.add("to");
    k.add("downto");
    k.add("infinity");
    k.add("concurrent");
    k.add("choose");
    k.add("lazy");
    k.add("force");   
    k.add("memoize");
    k.add("true");
    k.add("false");
    k.add("this");
    k.add("random");
    k.add("nil");
    k.add("div");
    k.add("mod");
    k.add("try");
    k.add("catch");
    k.add("module");
    k.add("typedef");
    k.add("typeof");
    k.add("private");
    k.add("import");

    return k;
  }

  private static void printIndent(int depth) {
    for (int i = 0; i < depth; i++) {
      System.out.print(" ");
    }
  }

  private static void printTree(Tree tree, int depth) {
    printIndent(depth);
    System.out.println("" + tree);
    for (int i = 0; i < tree.getChildCount(); i++) {
      printTree(tree.getChild(i), depth + 2);
    }
  }

  private NodeList toNodeList(Tree tree) {
    NodeList l = new NodeList();
    int count = tree.getChildCount();
    for (int i = 0; i < count; i++) {
      l = l.cons(toNode(tree.getChild(i)));
    }
    return l.reverse();
  }

  private NodeList toPatternList(Tree tree) {
    NodeList l = new NodeList();
    int count = tree.getChildCount();
    for (int i = 0; i < count; i++) {
      l = l.cons(toPattern(tree.getChild(i)));
    }
    return l.reverse();
  }

  private Node rightassocBinary(NodeList l, int op) {
    if (l.tail().empty()) {
      return l.head();
    } else {
      return new BinaryNode(new OperatorNode(op),
              l.head(), rightassocBinary(l.tail(), op)).mergeLocation();
    }

  }

  private Node leftassocBinary(NodeList l, int op) {
    Node result = l.head();
    for (Node n : l.tail()) {
      result = new BinaryNode(new OperatorNode(op),
              result, n);
      result.mergeLocation(n.location());
    }
    return result;
  }

  private BinaryNode toBinaryNode(Tree tree, int op) {
    Location loc = getLocation(tree);
    BinaryNode n = new BinaryNode(
            new OperatorNode(op),
            toNode(tree.getChild(0)),
            toNode(tree.getChild(1)));
    return (BinaryNode) n.mergeLocation(loc).mergeLocation();
  }

  private UnaryNode toUnaryNode(Tree tree, int op) {
    Location loc = getLocation(tree);
    UnaryNode n = new UnaryNode(
            new OperatorNode(op),
            toNode(tree.getChild(0)));
    return (UnaryNode) n.mergeLocation(loc).mergeLocation();
  }

  private Node toNullaryNode(int op) {
    return new NullaryNode(new OperatorNode(op));
  }

  private Location getLocation(Tree tree) {
    int ti1 = tree.getTokenStartIndex();
    int ti2 = tree.getTokenStopIndex();
    return getLocation(tree, ti1, ti2);  
  }
  
  private Location getLocation(Tree tree, int ti1, int ti2) {
    if (ti1 < 0) {
      if (ti2 < 0) {
        return lastKnownLocations.peek();
      } else {
        ti1 = ti2;
      }
    } else if (ti2 < 0) {
      ti2 = ti1;
    }
    Token t1;
    Token t2;
    try {
      t1 = tokens.get(ti1);
      t2 = tokens.get(ti2);
    } catch (Exception e) {
      return lastKnownLocations.peek();
    }
    Location l1 = new Location(source, t1.getLine(), t1.getCharPositionInLine() + 1);
    Location l2 = new Location(source, t2.getLine(), t2.getCharPositionInLine() + 1 + t2.getText().length() - 1);
    Location l = l1.add(l2);
    if (Location.invalid(l)) return lastKnownLocations.peek();
    return l;
  }

  private Node toNode(Tree tree) {
    Location loc = getLocation(tree);
    lastKnownLocations.push(loc);
    try {
      switch (tree.getType()) {
        case babel17Parser.PROG:
          return toNode(tree.getChild(0));
        case babel17Parser.BLOCK:
          return new BlockNode(toNodeList(tree)).mergeLocation(loc).mergeLocation();
        case babel17Parser.ASSIGN:
        case babel17Parser.VAL: {
          boolean assign = tree.getType() == babel17Parser.ASSIGN;
          Tree left = tree.getChild(0);
          if (left.getType() == babel17Parser.OBJELEM_ASSIGN) {
            IdentifierNode id = (IdentifierNode) toNode(left.getChild(0));
            IdentifierNode mid = (IdentifierNode) toNode(left.getChild(1));
            MessageNode m = new MessageNode(mid.name());
            m.mergeLocation(mid.location());
            Node rightSide = toNode(tree.getChild(1));
            return new ObjectUpdateNode(assign, id, m, rightSide).
                    mergeLocation(loc).mergeLocation();

          } else {
            PatternNode pattern = toPattern(tree.getChild(0));
            Node rightSide = toNode(tree.getChild(1));
            return new ValNode(assign, pattern, rightSide).mergeLocation(loc).
                  mergeLocation();
          }
        }
        case babel17Parser.Id: {
          String name = tree.getText();
          if (KEYWORDS.contains(name.toLowerCase()))
            pe.addMessage(loc, "cannot use keyword as identifier");
          return new IdentifierNode(name).mergeLocation(loc);
        }
        case babel17Parser.Constr: {
          return new ConstrNode(tree.getText(), loc, null).mergeLocation(loc);
        }
        case babel17Parser.DEF: {
          Node n = toNode(tree.getChild(0));
          IdentifierNode id = (IdentifierNode) n;
          id = (IdentifierNode) n;
          PatternNode pattern;
          Node rightSide;
          if (2 == tree.getChildCount()) {
            pattern = null;
            rightSide = toNode(tree.getChild(1));
          } else {
            pattern = toPattern(tree.getChild(1));
            rightSide = toNode(tree.getChild(2));
          }
          return new DefNode(id, pattern, rightSide).mergeLocation(loc).
                  mergeLocation();
        }
        case babel17Parser.COMPARE: {
          NodeList l = toNodeList(tree);
          if (l.tail().empty()) {
            return l.head();
          } else {
            return new CompareNode(l).mergeLocation();
          }
        }
        case babel17Parser.LIST_CONS: {
          NodeList l = toNodeList(tree);
          return rightassocBinary(l, OperatorNode.CONS).
                  mergeLocation(loc);
        }
        case babel17Parser.POW: {
          NodeList l = toNodeList(tree);
          return leftassocBinary(l, OperatorNode.POW).mergeLocation(loc);
        }
        case babel17Parser.APPLY: {
          NodeList l = toNodeList(tree);
          if (l.head() instanceof ConstrNode) {
            ConstrNode c = (ConstrNode) l.head();
            if (c.arg() == null && !l.tail().empty()) {
              c = (ConstrNode) new ConstrNode(c.name(), c.location(), l.tail().head()).mergeLocation(c.location()).mergeLocation();
              l = l.tail().tail().cons(c);
            }
          }
          return leftassocBinary(l, OperatorNode.APPLY).mergeLocation(loc);
        }
        case babel17Parser.MESSAGE_SEND: {
          NodeList l = toNodeList(tree);
          if (l.hasErrors()) return BeginNode.empty();
          Node result = l.head();
          for (Node n : l.tail()) {
            IdentifierNode id = (IdentifierNode) n;
            MessageNode m = new MessageNode(id.name());
            m.mergeLocation(id.location());
            result = new BinaryNode(new OperatorNode(OperatorNode.MESSAGE_SEND),
                    result, m).mergeLocation(m.location());
          }
          return result.mergeLocation(loc);
        }
        case babel17Parser.A_OR:
        case babel17Parser.U_OR:
          return toBinaryNode(tree, OperatorNode.OR);
        case babel17Parser.A_AND:
        case babel17Parser.U_AND:
          return toBinaryNode(tree, OperatorNode.AND);
        case babel17Parser.A_NOT:
        case babel17Parser.U_NOT:
          return toUnaryNode(tree, OperatorNode.NOT);
        case babel17Parser.PLUSPLUS:
          return toBinaryNode(tree, OperatorNode.PLUSPLUS);
        case babel17Parser.MINUSMINUS:
          return toBinaryNode(tree, OperatorNode.MINUSMINUS);
        case babel17Parser.TIMESTIMES:
          return toBinaryNode(tree, OperatorNode.TIMESTIMES);
        case babel17Parser.QUOTIENTQUOTIENT:
          return toBinaryNode(tree, OperatorNode.QUOTIENTQUOTIENT);
        case babel17Parser.L_to:
          return toBinaryNode(tree, OperatorNode.TO);
        case babel17Parser.L_downto:
          return toBinaryNode(tree, OperatorNode.DOWNTO);
        case babel17Parser.PLUS:
          return toBinaryNode(tree, OperatorNode.PLUS);
        case babel17Parser.MINUS:
          return toBinaryNode(tree, OperatorNode.MINUS);
        case babel17Parser.UMINUS:
          return toUnaryNode(tree, OperatorNode.UMINUS);
        case babel17Parser.TIMES:
          return toBinaryNode(tree, OperatorNode.TIMES);
        case babel17Parser.QUOTIENT:
          return toBinaryNode(tree, OperatorNode.QUOTIENT);          
        case babel17Parser.L_div:
          return toBinaryNode(tree, OperatorNode.DIV);
        case babel17Parser.L_mod:
          return toBinaryNode(tree, OperatorNode.MOD);
        case babel17Parser.A_EQUAL:
        case babel17Parser.U_EQUAL:
          return new OperatorNode(OperatorNode.EQUAL);
        case babel17Parser.A_NOT_EQUAL:
        case babel17Parser.U_NOT_EQUAL:
          return new OperatorNode(OperatorNode.UNEQUAL);
        case babel17Parser.GREATER:
          return new OperatorNode(OperatorNode.GREATER);
        case babel17Parser.A_GREATER_EQ:
        case babel17Parser.U_GREATER_EQ:
          return new OperatorNode(OperatorNode.GREATER_EQ);
        case babel17Parser.LESS:
          return new OperatorNode(OperatorNode.LESS);
        case babel17Parser.A_LESS_EQ:
        case babel17Parser.U_LESS_EQ:
          return new OperatorNode(OperatorNode.LESS_EQ);
        case babel17Parser.A_infinity:
        case babel17Parser.U_infinity:
          return new NullaryNode(new OperatorNode(
                  OperatorNode.INFINITY));
        case babel17Parser.Num:
          return new IntegerNode(ConstParser.num(tree.getText())).mergeLocation(loc);
        case babel17Parser.String: {
          try {
            return new StringNode(ConstParser.string(source, tree.getText())).mergeLocation(loc);
          } catch (ParseException e) {
            Location l = e.location();
            if (l != null) {
              l = l.shift(loc.startLine() - 1, loc.startColumn() - 1);
            } else {
              l = loc;
            }
            pe.addMessage(l, e.getMessage());
            return new StringNode("").mergeLocation(loc);
          }
        }
        case babel17Parser.L_true:
          return toNullaryNode(OperatorNode.TRUE).
                  mergeLocation(loc);
        case babel17Parser.L_false:
          return toNullaryNode(OperatorNode.FALSE).
                  mergeLocation(loc);
        case babel17Parser.L_this:
          return toNullaryNode(OperatorNode.THIS).
                  mergeLocation(loc);
        case babel17Parser.L_random:
          return toUnaryNode(tree, OperatorNode.RANDOM);
        case babel17Parser.L_choose:
          return toUnaryNode(tree, OperatorNode.CHOOSE);
        case babel17Parser.L_exception:
          return toUnaryNode(tree, OperatorNode.EXCEPTION);
        case babel17Parser.L_lazy:
          return toUnaryNode(tree, OperatorNode.LAZY);
        case babel17Parser.L_concurrent:
          return toUnaryNode(tree, OperatorNode.CONCURRENT);
        case babel17Parser.L_force:
          return toUnaryNode(tree, OperatorNode.FORCE);
        case babel17Parser.EMPTY_MAP:
          return new MapNode(new NodeList()).mergeLocation(loc);
        case babel17Parser.L_nil:
          return new RecordNode(new NodeList()).mergeLocation(loc);
        case babel17Parser.SQUARE_LIST:
          return new ListNode(toNodeList(tree), false).mergeLocation(loc).mergeLocation();
        case babel17Parser.ROUND_LIST: {
          int commas = tree.getChild(0).getChildCount();
          NodeList l = toNodeList(tree.getChild(1));
          int len = l.length();
          if (len == 1 && commas == 0) {
            return l.head().mergeLocation(loc);
          } else {
            if (len == commas && len > 1)
              pe.addMessage(getLocation(tree.getChild(0).getChild(commas-1)),
                "trailing comma notation is only for vectors of length 1");
            return new ListNode(l, true).mergeLocation(loc).mergeLocation();
          }
        }
        case babel17Parser.MAP_OR_SET_OR_OBJ: {
          NodeList l = new NodeList();
          int count = tree.getChildCount();
          boolean is_set = false;
          boolean is_map = false;
          boolean is_obj = false;
          boolean error = false;
          for (int i = 0; i < count && !error; i++) {
            Tree t = tree.getChild(i);
            NodeList c = toNodeList(t.getChild(0));
            if (c.length() == 1) {
              if (is_map || is_obj) {
                pe.addMessage(getLocation(t),
                        "set element in map or object");
                error = true;
              } else {
                is_set = true;
                l = l.cons(c.head().mergeLocation(getLocation(t)));
              }
            } else {
              int ty = t.getChild(1).getType();
              if (ty == babel17Parser.ARROW) {
                if (is_set || is_obj) {
                  pe.addMessage(getLocation(t),
                        "map element in set or object");
                  error = true;
                } else {
                  is_map = true;
                  l = l.cons(new MapNode.KeyValue(c.head(), c.tail().head()).mergeLocation(getLocation(t)));
                }
              } else if (ty == babel17Parser.ASSIGN) {
                if (is_set || is_map) {
                  pe.addMessage(getLocation(t),
                        "object element in set or map");
                  error = true;
                } else {
                  is_obj = true;
                  Node m = c.head();
                  Node v = c.tail().head();
                  if (m instanceof IdentifierNode) {
                    IdentifierNode message = (IdentifierNode)m;
                    l = l.cons(new RecordNode.MessageValue(message, v).mergeLocation(getLocation(t)));
                  } else {
                    pe.addMessage(m.location(), "message identifier expected");
                    error = true;
                  }
                }
              } else throw new RuntimeException("ARROW or ASSIGN expected, ty="+ty+" found");
            }
          }
          if (is_map) {
            return new MapNode(l.reverse()).mergeLocation(loc).mergeLocation();
          } else if (is_obj) {
            return new RecordNode(l.reverse()).mergeLocation(loc).mergeLocation();
          } else {
            return new SetNode(l.reverse()).mergeLocation(loc).mergeLocation();
          }
        }
        case babel17Parser.IF: {
          NodeList children = toNodeList(tree);
          if (children.hasErrors()) return BeginNode.empty();
          NodeList conditions = new NodeList();
          NodeList blocks = new NodeList();
          int len = children.length();
          int i = 0;
          for (Node n : children) {
            if (i < len / 2) {
              conditions = conditions.cons(n);
            } else {
              blocks = blocks.cons(n);
            }
            i++;
          }
          return new IfNode(conditions.reverse(), blocks.reverse()).mergeLocation(loc);
        }
        case babel17Parser.BEGIN:
          return new BeginNode(toNode(tree.getChild(0)).toBlock()).mergeLocation(loc);
        case babel17Parser.OBJ: {
          BlockNode block = toNode(tree.getChild(0)).toBlock();
          if (tree.getChildCount() > 1) {
              int t = tree.getChild(1).getType();
              int combine_method;
              if (t == babel17Parser.PARENTS_PLUS)
                  combine_method = ObjectNode.COMBINE_GLUE;
              else
                  combine_method = ObjectNode.COMBINE_MERGE;
              Node parents = toNode(tree.getChild(1).getChild(0));
              return new ObjectNode(block, combine_method, parents);
          } else
              return new ObjectNode(block).mergeLocation(loc);
        }
        case babel17Parser.WHILE_DO:
          return new WhileNode(
                  toNode(tree.getChild(0)),
                  toNode(tree.getChild(1)).toBlock()).mergeLocation(loc);
        case babel17Parser.FOR_EXPR:
          return new ForNode(
                  toPattern(tree.getChild(0)),
                  toNode(tree.getChild(1)),
                  toNode(tree.getChild(2)).toBlock()).mergeLocation(loc);
        case babel17Parser.MATCH: {
          Node value = toNode(tree.getChild(0));
          Tree t = tree.getChild(1);
          int count = t.getChildCount();
          NodeList patterns = new NodeList();
          NodeList blocks = new NodeList();
          for (int i = 0; i < count; i++) {
            Tree s = t.getChild(i);
            PatternNode pattern = toPattern(s.getChild(0));
            BlockNode block = toNode(s.getChild(1)).toBlock();
            patterns = patterns.cons(pattern);
            blocks = blocks.cons(block);
          }
          return new MatchNode(value, patterns.reverse(), blocks.reverse()).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.TRY: {
            Node mainblock = toNode(tree.getChild(0));
            Tree t = tree.getChild(1);
            int count = t.getChildCount();
            NodeList patterns = new NodeList();
            NodeList blocks = new NodeList();
            for (int i = 0; i < count; i++) {
              Tree s = t.getChild(i);
              PatternNode pattern = toPattern(s.getChild(0));
              BlockNode block = toNode(s.getChild(1)).toBlock();
              patterns = patterns.cons(pattern);
              blocks = blocks.cons(block);
            }
            return new TryNode(mainblock, patterns.reverse(), blocks.reverse()).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.LAMBDA: {
          Tree t = tree.getChild(0);
          int count = t.getChildCount();
          NodeList patterns = new NodeList();
          NodeList blocks = new NodeList();
          for (int i = 0; i < count; i++) {
            Tree s = t.getChild(i);
            PatternNode pattern = toPattern(s.getChild(0));
            BlockNode block = toNode(s.getChild(1)).toBlock();
            patterns = patterns.cons(pattern);
            blocks = blocks.cons(block);
          }
          return new LambdaNode(patterns.reverse(), blocks.reverse()).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.WITH: {
          NodeList l = toNodeList(tree);
          if (l.hasErrors()) return BeginNode.empty();
          return new WithNode(
                  l.get(0),
                  (ControlNode) l.get(1)).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.ID_STRONG:
          return new MemoizeNode.MemoId(true,
                  (IdentifierNode) toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
        case babel17Parser.ID_WEAK:
          return new MemoizeNode.MemoId(false,
                  (IdentifierNode) toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
        case babel17Parser.MEMOIZE:
          return new MemoizeNode(toNodeList(tree).suppressErrors()).mergeLocation(loc).mergeLocation();
        case babel17Parser.YIELD:
          return new YieldNode(toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
          case babel17Parser.PRAGMA_PRINT:
              return new PragmaNode(PragmaNode.PRAGMA_PRINT, toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
        case babel17Parser.PRAGMA_LOG:
            return new PragmaNode(PragmaNode.PRAGMA_LOG, toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
          case babel17Parser.PRAGMA_ASSERT:
              return new PragmaNode(PragmaNode.PRAGMA_ASSERT, toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();
          case babel17Parser.PRAGMA_PROFILE:
              return new PragmaNode(PragmaNode.PRAGMA_PROFILE, toNode(tree.getChild(0))).mergeLocation(loc).mergeLocation();

        default:
          return new ParseErrorNode().mergeLocation(loc);
      }
    } finally {
      lastKnownLocations.pop();
    }
  }

  private PatternNode makeConsPatterns(Tree tree, int i) {
    Location loc = getLocation(tree.getChild(i));
    PatternNode p = (PatternNode) toPattern(tree.getChild(i)).mergeLocation(loc);
    if (i + 1 == tree.getChildCount()) {
      return p;
    } else {
      return (PatternNode) new ConsPattern(p, makeConsPatterns(tree, i + 1)).mergeLocation();
    }
  }

  private PatternNode toPattern(Tree tree) {
    Location loc = getLocation(tree);
    lastKnownLocations.push(loc);
    try {
      switch (tree.getType()) {
        case babel17Parser.Id: {
          String name = tree.getText();
          if (KEYWORDS.contains(name.toLowerCase()))
            pe.addMessage(loc, "cannot use keyword as identifier");
          return (PatternNode) new IdentifierPattern(name).mergeLocation(loc);
        }
        case babel17Parser.Num:
          return (PatternNode) new IntegerPattern(ConstParser.num(tree.getText())).mergeLocation(loc);
        case babel17Parser.String:
          try {
            return (PatternNode) new StringPattern(ConstParser.string(
                    source, tree.getText())).mergeLocation(loc);
          } catch (ParseException e) {
            Location l = e.location();
            if (l != null) {
              l = l.shift(loc.startLine() - 1, loc.startColumn() - 1);
            } else {
              l = loc;
            }
            pe.addMessage(l, e.getMessage());
            return (PatternNode) new StringPattern("").mergeLocation(loc);
          }
        case babel17Parser.ANY:
          return (PatternNode) new NullaryPattern(NullaryPattern.ANY).mergeLocation(loc);
        case babel17Parser.A_ELLIPSIS:
        case babel17Parser.U_ELLIPSIS:
          return (PatternNode) new NullaryPattern(NullaryPattern.ELLIPSIS).mergeLocation(loc);
        case babel17Parser.L_true:
          return (PatternNode) new NullaryPattern(NullaryPattern.TRUE).mergeLocation(loc);
        case babel17Parser.L_nil:
          return (PatternNode) new RecordPattern(new NodeList()).mergeLocation(loc);
        case babel17Parser.L_false:
          return (PatternNode) new NullaryPattern(NullaryPattern.FALSE).mergeLocation(loc);
        case babel17Parser.A_infinity:
        case babel17Parser.U_infinity:
          return (PatternNode) new NullaryPattern(NullaryPattern.INFINITY).mergeLocation(loc);
        case babel17Parser.UMINUS: {
          PatternNode p = toPattern(tree.getChild(0));
          if (p instanceof IntegerPattern) {
            return (PatternNode) new IntegerPattern(
                    ((IntegerPattern) p).value().negate()).mergeLocation(loc);
          } else if (NullaryPattern.is(p, NullaryPattern.INFINITY)) {
            return (PatternNode) new NullaryPattern(NullaryPattern.NEGATIVE_INFINITY).mergeLocation(loc);
          } else {
            throw new RuntimeException("pattern cannot be used in negation");
          }
        }
        case babel17Parser.L_as:
          return (PatternNode) new AsPattern((IdentifierPattern) toPattern(tree.getChild(0)),
                  toPattern(tree.getChild(1))).mergeLocation(loc);
        case babel17Parser.IF_PATTERN:
          if (tree.getChildCount() == 2) {
            return (PatternNode) new IfPattern(toPattern(tree.getChild(0)),
                    toNode(tree.getChild(1))).mergeLocation(loc);
          } else {
            return toPattern(tree.getChild(0));
          }
        case babel17Parser.L_val:
          return (PatternNode) new ValPattern(toNode(tree.getChild(0))).mergeLocation(loc);
        case babel17Parser.L_exception:
          return (PatternNode) new ExceptionPattern(toPattern(tree.getChild(0))).mergeLocation(loc);
        case babel17Parser.QUESTION_MARK:
          return (PatternNode) new PredicatePattern(toNode(tree.getChild(0)),
                  tree.getChildCount() == 2 ? toPattern(tree.getChild(1)) : null);
        case babel17Parser.ROUND_LIST: {
          int commas = tree.getChild(0).getChildCount();
          NodeList l = toPatternList(tree.getChild(1));
          int len = l.length();
          if (len == 1 && commas == 0) {
            return (PatternNode) l.head().mergeLocation(loc);
          } else {
            if (len == commas && len > 1)
              pe.addMessage(getLocation(tree.getChild(0).getChild(commas-1)),
                "trailing comma notation is only for vectors of length 1");
            return (PatternNode) new ListPattern(l, true).
                    mergeLocation(loc).mergeLocation();
          }
        }
        case babel17Parser.L_for: {
          NodeList l = toPatternList(tree);
          return (PatternNode) new ForPattern(l).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.SQUARE_LIST: {
          NodeList l = toPatternList(tree);
          return (PatternNode) new ListPattern(l, false).mergeLocation(loc).mergeLocation();
        }
        case babel17Parser.MAP_OR_SET_OR_OBJ: {
          NodeList l = new NodeList();
          int count = tree.getChildCount();
          boolean is_set = false;
          boolean is_map = false;
          boolean is_obj = false;
          boolean error = false;
          for (int i = 0; i < count && !error; i++) {
            Tree t = tree.getChild(i);
            NodeList c = toPatternList(t.getChild(0));
            if (c.length() == 1) {
              if (is_map || is_obj) {
                if (i != count - 1) {
                  pe.addMessage(getLocation(t),
                        "set element in map or object");
                  error = true;
                } else
                  l = l.cons(c.head().mergeLocation(getLocation(t)));                  
              } else {
                is_set = true;
                l = l.cons(c.head().mergeLocation(getLocation(t)));
              }
            } else {
              int ty = t.getChild(1).getType();
              if (ty == babel17Parser.ARROW) {
                if (is_set || is_obj) {
                  pe.addMessage(getLocation(t),
                        "map element in set or object");
                  error = true;
                } else {
                  is_map = true;
                  l = l.cons(new MapPattern.KeyValue((PatternNode) c.head(),
                          (PatternNode) c.tail().head()).mergeLocation(getLocation(t)));
                }
              } else if (ty == babel17Parser.ASSIGN) {
                if (is_set || is_map) {
                  pe.addMessage(getLocation(t),
                        "object element in set or map");
                  error = true;
                } else {
                  is_obj = true;
                  Node m = c.head();
                  PatternNode v = (PatternNode) c.tail().head();
                  if (m instanceof IdentifierPattern) {
                    IdentifierPattern message = (IdentifierPattern)m;
                    l = l.cons(new RecordPattern.MessageValue(message, v).mergeLocation(getLocation(t)));
                  } else {
                    pe.addMessage(m.location(), "message identifier expected");
                    error = true;
                  }
                }
              } else throw new RuntimeException("ARROW or ASSIGN expected, ty="+ty+" found");
            }
          }
          if (is_map) {
            return (PatternNode) new MapPattern(l.reverse()).mergeLocation(loc).mergeLocation();
          } else if (is_set) {
            return (PatternNode) new SetPattern(l.reverse()).mergeLocation(loc).mergeLocation();
          } else if (is_obj) {
            return (PatternNode) new RecordPattern(l.reverse()).mergeLocation(loc).mergeLocation();
          }
        }
        case babel17Parser.LIST_CONS:
          return makeConsPatterns(tree, 0);
        case babel17Parser.EMPTY_MAP:
          return (PatternNode) new MapPattern(new NodeList()).mergeLocation(loc);
        case babel17Parser.Constr:
          if (tree.getChildCount() == 0) {
            return (PatternNode) new ConstrPattern(tree.getText(), loc, null).mergeLocation(loc);
          } else {
            Location l = getLocation(tree, tree.getTokenStartIndex(), tree.getTokenStartIndex());
            return (PatternNode) new ConstrPattern(tree.getText(), l, toPattern(tree.getChild(0))).mergeLocation(loc).mergeLocation();
          }
        default: {
          return (PatternNode) new ParseErrorNode().mergeLocation(loc);
        }
      }
    } finally {
      lastKnownLocations.pop();
    }
  }
  private CommonTokenStream tokens;
  private Source source;
  private ParseException pe;
  private java.util.Stack<Location> lastKnownLocations;

  private Parser(Source source, CommonTokenStream tokens, ParseException pe) {
    this.tokens = tokens;
    this.pe = pe;
    this.source = source;
    lastKnownLocations = new java.util.Stack();
    lastKnownLocations.push(new Location(source, 1, 1));
  }

  public static class ParseResult {

    private Node node;
    private ParseException pe;

    public ParseResult(Node n, ParseException p) {
      node = n;
      pe = p;
    }

    public boolean hasErrors() {
      return pe != null;
    }

    public Node node() {
      return node;
    }

    public ParseException exception() {
      return pe;
    }
  }

  public static void lexit(String filename) throws java.io.IOException {
    ANTLRFileStream stream = new ANTLRFileStream(filename, "UTF-8");
    babel17Lexer lexer = new babel17Lexer(stream);
    System.out.println("start lexing...");
    do {
      Token t = lexer.nextToken();
      if (t.getType() == lexer.EOF) {
        break;
      }
      System.out.println("token " + t.getType());
    } while (true);
    System.out.println("... done lexing.");
  }

  public static ParseResult parse(String filename) throws java.io.IOException {
    ANTLRFileStream stream = new ANTLRFileStream(filename, "UTF-8");
    return parse(new Source(filename), stream);
  }

  public static ParseResult parse(Source source,  CharStream stream) throws java.io.IOException {
    babel17Lexer lexer = new babel17Lexer(stream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    babel17Parser parser = new babel17Parser(tokens);
    ParseException pe = new ParseException();
    CommonTree tree = null;
    try {
      tree = (CommonTree) parser.prog().getTree();
    } catch (RecognitionException e) {
      int line = e.line;
      int pos = e.charPositionInLine;
      pe.addMessage(new Location(source, line, pos + 1), "syntax error");
    }
    if (lexer.errorDuringLexing) {
      int numErrors = lexer.lexingErrors.size();
      for (int i = 0; i < numErrors; i++) {
        RecognitionException e = lexer.lexingErrors.get(i);
        int line = e.line;
        int pos = e.charPositionInLine;
        pe.addMessage(new Location(source, line, pos + 1), "lexical error");
      }
    }
    if (parser.errorDuringParsing) {
      int numErrors = parser.parsingErrors.size();
      for (int i = 0; i < numErrors; i++) {
        RecognitionException e = parser.parsingErrors.get(i);
        int line = e.line;
        int pos = e.charPositionInLine;
        pe.addMessage(new Location(source, line, pos + 1), "syntax error");
      }
    }
    if (tree != null) {
      Parser p = new Parser(source, tokens, pe);
      Node n = p.toNode(tree);
      n.mergeLocation(new Location(source, 1, 1)).distributeLocation();
      return new ParseResult(n, pe.countMessages() == 0 ? null : pe);
    }
    return new ParseResult(null, pe);
  }
}
