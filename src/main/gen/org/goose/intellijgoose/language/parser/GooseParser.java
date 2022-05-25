// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.goose.intellijgoose.language.psi.GooseTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GooseParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return gooseFile(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ATOM_EXPR, CALL_EXPR, CMP_EXPR, EXPR,
      LIT_EXPR, MUL_EXPR, PLUS_EXPR),
  };

  /* ********************************************************** */
  // (UNIQUE|CARRYOVER)? IDENT assign_op expr ";"
  public static boolean assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN, "<assign>");
    r = assign_0(b, l + 1);
    r = r && consumeToken(b, IDENT);
    r = r && assign_op(b, l + 1);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (UNIQUE|CARRYOVER)?
  private static boolean assign_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_0")) return false;
    assign_0_0(b, l + 1);
    return true;
  }

  // UNIQUE|CARRYOVER
  private static boolean assign_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_0_0")) return false;
    boolean r;
    r = consumeToken(b, UNIQUE);
    if (!r) r = consumeToken(b, CARRYOVER);
    return r;
  }

  /* ********************************************************** */
  // "=" | "+=" | "-=" | "*=" | "/="
  public static boolean assign_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_op")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN_OP, "<assign op>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, PLUSEQ);
    if (!r) r = consumeToken(b, DASHEQ);
    if (!r) r = consumeToken(b, STAREQ);
    if (!r) r = consumeToken(b, SLASHEQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // lit_expr | call_expr | IDENT
  public static boolean atom_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atom_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, ATOM_EXPR, "<expression>");
    r = lit_expr(b, l + 1);
    if (!r) r = call_expr(b, l + 1);
    if (!r) r = consumeToken(b, IDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENT "(" (expr (',' expr)* ','?)? ")"
  public static boolean call_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr")) return false;
    if (!nextTokenIs(b, "<expression>", IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_EXPR, "<expression>");
    r = consumeTokens(b, 0, IDENT, OPEN_PAREN);
    r = r && call_expr_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (expr (',' expr)* ','?)?
  private static boolean call_expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_2")) return false;
    call_expr_2_0(b, l + 1);
    return true;
  }

  // expr (',' expr)* ','?
  private static boolean call_expr_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && call_expr_2_0_1(b, l + 1);
    r = r && call_expr_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' expr)*
  private static boolean call_expr_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!call_expr_2_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "call_expr_2_0_1", c)) break;
    }
    return true;
  }

  // ',' expr
  private static boolean call_expr_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_2_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean call_expr_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "call_expr_2_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // cmp_op pre_cmp
  public static boolean cmp_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, CMP_EXPR, "<expression>");
    r = cmp_op(b, l + 1);
    r = r && pre_cmp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "==" | "!=" | "<" | ">" | "<=" | ">="
  static boolean cmp_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmp_op")) return false;
    boolean r;
    r = consumeToken(b, EQEQ);
    if (!r) r = consumeToken(b, BANGEQ);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LTEQ);
    if (!r) r = consumeToken(b, GTEQ);
    return r;
  }

  /* ********************************************************** */
  // pre_cmp cmp_expr*
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<expression>");
    r = pre_cmp(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // cmp_expr*
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!cmp_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // param_name ":" type
  public static boolean fn_arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fn_arg")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_name(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, FN_ARG, r);
    return r;
  }

  /* ********************************************************** */
  // DEF IDENT ":" type "(" (fn_arg (',' fn_arg)* ','?)? ")" "->" "|" expr "|" "[" stmt* "]"
  public static boolean func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func")) return false;
    if (!nextTokenIs(b, DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF, IDENT, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && func_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    r = r && consumeToken(b, "->");
    r = r && consumeToken(b, PIPE);
    r = r && expr(b, l + 1);
    r = r && consumeTokens(b, 0, PIPE, OPEN_BRACKET);
    r = r && func_12(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, FUNC, r);
    return r;
  }

  // (fn_arg (',' fn_arg)* ','?)?
  private static boolean func_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_5")) return false;
    func_5_0(b, l + 1);
    return true;
  }

  // fn_arg (',' fn_arg)* ','?
  private static boolean func_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fn_arg(b, l + 1);
    r = r && func_5_0_1(b, l + 1);
    r = r && func_5_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' fn_arg)*
  private static boolean func_5_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_5_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!func_5_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_5_0_1", c)) break;
    }
    return true;
  }

  // ',' fn_arg
  private static boolean func_5_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_5_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && fn_arg(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean func_5_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_5_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  // stmt*
  private static boolean func_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_12")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "func_12", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // stmt*
  static boolean gooseFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gooseFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "gooseFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // literal
  public static boolean lit_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lit_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIT_EXPR, "<expression>");
    r = literal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // INT | FLOAT | BIT | CHAR | CHARARRAY
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, BIT);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, CHARARRAY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mul_op pre_mul
  public static boolean mul_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_expr")) return false;
    if (!nextTokenIs(b, "<expression>", SLASH, STAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, MUL_EXPR, "<expression>");
    r = mul_op(b, l + 1);
    r = r && pre_mul(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '*'|'/'
  static boolean mul_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mul_op")) return false;
    if (!nextTokenIs(b, "", SLASH, STAR)) return false;
    boolean r;
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
    return r;
  }

  /* ********************************************************** */
  // ONCE "{" stmt* "}"
  public static boolean once_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_stmt")) return false;
    if (!nextTokenIs(b, ONCE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ONCE, OPEN_CURLY);
    r = r && once_stmt_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_CURLY);
    exit_section_(b, m, ONCE_STMT, r);
    return r;
  }

  // stmt*
  private static boolean once_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "once_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "once_stmt_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT
  public static boolean param_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_name")) return false;
    if (!nextTokenIs(b, IDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENT);
    exit_section_(b, m, PARAM_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // plus_op pre_add
  public static boolean plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_expr")) return false;
    if (!nextTokenIs(b, "<expression>", DASH, PLUS)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, PLUS_EXPR, "<expression>");
    r = plus_op(b, l + 1);
    r = r && pre_add(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+'|'-'
  static boolean plus_op(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plus_op")) return false;
    if (!nextTokenIs(b, "", DASH, PLUS)) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, DASH);
    return r;
  }

  /* ********************************************************** */
  // pre_mul mul_expr*
  static boolean pre_add(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_add")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pre_mul(b, l + 1);
    r = r && pre_add_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mul_expr*
  private static boolean pre_add_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_add_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mul_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pre_add_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // pre_add plus_expr*
  static boolean pre_cmp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_cmp")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pre_add(b, l + 1);
    r = r && pre_cmp_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // plus_expr*
  private static boolean pre_cmp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_cmp_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!plus_expr(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pre_cmp_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // atom_expr
  static boolean pre_mul(PsiBuilder b, int l) {
    return atom_expr(b, l + 1);
  }

  /* ********************************************************** */
  // func | expr ';' | assign | once_stmt | sync_stmt
  public static boolean stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STMT, "<stmt>");
    r = func(b, l + 1);
    if (!r) r = stmt_1(b, l + 1);
    if (!r) r = assign(b, l + 1);
    if (!r) r = once_stmt(b, l + 1);
    if (!r) r = sync_stmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // expr ';'
  private static boolean stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SYNC "{" stmt* "}"
  public static boolean sync_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sync_stmt")) return false;
    if (!nextTokenIs(b, SYNC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SYNC, OPEN_CURLY);
    r = r && sync_stmt_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_CURLY);
    exit_section_(b, m, SYNC_STMT, r);
    return r;
  }

  // stmt*
  private static boolean sync_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sync_stmt_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!stmt(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sync_stmt_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENT | "[" type "]" | FN ":" type "(" (type (',' type)* ','?)? ")"
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = consumeToken(b, IDENT);
    if (!r) r = type_1(b, l + 1);
    if (!r) r = type_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "[" type "]"
  private static boolean type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // FN ":" type "(" (type (',' type)* ','?)? ")"
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN, COLON);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, OPEN_PAREN);
    r = r && type_2_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // (type (',' type)* ','?)?
  private static boolean type_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2_4")) return false;
    type_2_4_0(b, l + 1);
    return true;
  }

  // type (',' type)* ','?
  private static boolean type_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && type_2_4_0_1(b, l + 1);
    r = r && type_2_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' type)*
  private static boolean type_2_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2_4_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!type_2_4_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_2_4_0_1", c)) break;
    }
    return true;
  }

  // ',' type
  private static boolean type_2_4_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2_4_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ','?
  private static boolean type_2_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2_4_0_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

}
