// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.goose.intellijgoose.language.psi.impl.*;

public interface GooseTypes {

  IElementType ASSIGN = new GooseElementType("ASSIGN");
  IElementType ASSIGN_OP = new GooseElementType("ASSIGN_OP");
  IElementType ATOM_EXPR = new GooseElementType("ATOM_EXPR");
  IElementType CALL_EXPR = new GooseElementType("CALL_EXPR");
  IElementType CMP_EXPR = new GooseElementType("CMP_EXPR");
  IElementType EXPR = new GooseElementType("EXPR");
  IElementType FN_ARG = new GooseElementType("FN_ARG");
  IElementType FUNC = new GooseElementType("FUNC");
  IElementType LITERAL = new GooseElementType("LITERAL");
  IElementType LIT_EXPR = new GooseElementType("LIT_EXPR");
  IElementType MUL_EXPR = new GooseElementType("MUL_EXPR");
  IElementType ONCE_STMT = new GooseElementType("ONCE_STMT");
  IElementType PARAM_NAME = new GooseElementType("PARAM_NAME");
  IElementType PLUS_EXPR = new GooseElementType("PLUS_EXPR");
  IElementType STMT = new GooseElementType("STMT");
  IElementType SYNC_STMT = new GooseElementType("SYNC_STMT");
  IElementType TYPE = new GooseElementType("TYPE");

  IElementType AND = new GooseTokenType("&");
  IElementType AT = new GooseTokenType("@");
  IElementType BACKSLASH = new GooseTokenType("\\\\");
  IElementType BANG = new GooseTokenType("!");
  IElementType BANGEQ = new GooseTokenType("!=");
  IElementType BIT = new GooseTokenType("BIT");
  IElementType CARET = new GooseTokenType("^");
  IElementType CARRYOVER = new GooseTokenType("carryover");
  IElementType CHAR = new GooseTokenType("CHAR");
  IElementType CHARARRAY = new GooseTokenType("CHARARRAY");
  IElementType CLOSE_BRACKET = new GooseTokenType("]");
  IElementType CLOSE_CURLY = new GooseTokenType("}");
  IElementType CLOSE_PAREN = new GooseTokenType(")");
  IElementType COLON = new GooseTokenType(":");
  IElementType COMMA = new GooseTokenType(",");
  IElementType COMMENT = new GooseTokenType("COMMENT");
  IElementType DASH = new GooseTokenType("-");
  IElementType DASHEQ = new GooseTokenType("-=");
  IElementType DEF = new GooseTokenType("def");
  IElementType DOLLAR = new GooseTokenType("$");
  IElementType DOT = new GooseTokenType(".");
  IElementType EQ = new GooseTokenType("=");
  IElementType EQEQ = new GooseTokenType("==");
  IElementType FLOAT = new GooseTokenType("FLOAT");
  IElementType FN = new GooseTokenType("fn");
  IElementType GT = new GooseTokenType(">");
  IElementType GTEQ = new GooseTokenType(">=");
  IElementType HASH = new GooseTokenType("#");
  IElementType IDENT = new GooseTokenType("IDENT");
  IElementType INT = new GooseTokenType("INT");
  IElementType LT = new GooseTokenType("<");
  IElementType LTEQ = new GooseTokenType("<=");
  IElementType MULTILINE_COMMENT = new GooseTokenType("MULTILINE_COMMENT");
  IElementType ONCE = new GooseTokenType("once");
  IElementType OPEN_BRACKET = new GooseTokenType("[");
  IElementType OPEN_CURLY = new GooseTokenType("{");
  IElementType OPEN_PAREN = new GooseTokenType("(");
  IElementType PERCENT = new GooseTokenType("%");
  IElementType PIPE = new GooseTokenType("|");
  IElementType PLUS = new GooseTokenType("+");
  IElementType PLUSEQ = new GooseTokenType("+=");
  IElementType QUESTION = new GooseTokenType("?");
  IElementType SEMICOLON = new GooseTokenType(";");
  IElementType SLASH = new GooseTokenType("/");
  IElementType SLASHEQ = new GooseTokenType("/=");
  IElementType STAR = new GooseTokenType("*");
  IElementType STAREQ = new GooseTokenType("*=");
  IElementType SYNC = new GooseTokenType("sync");
  IElementType UNIQUE = new GooseTokenType("UNIQUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ASSIGN) {
        return new GooseAssignImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new GooseAssignOpImpl(node);
      }
      else if (type == ATOM_EXPR) {
        return new GooseAtomExprImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new GooseCallExprImpl(node);
      }
      else if (type == CMP_EXPR) {
        return new GooseCmpExprImpl(node);
      }
      else if (type == FN_ARG) {
        return new GooseFnArgImpl(node);
      }
      else if (type == FUNC) {
        return new GooseFuncImpl(node);
      }
      else if (type == LITERAL) {
        return new GooseLiteralImpl(node);
      }
      else if (type == LIT_EXPR) {
        return new GooseLitExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new GooseMulExprImpl(node);
      }
      else if (type == ONCE_STMT) {
        return new GooseOnceStmtImpl(node);
      }
      else if (type == PARAM_NAME) {
        return new GooseParamNameImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new GoosePlusExprImpl(node);
      }
      else if (type == STMT) {
        return new GooseStmtImpl(node);
      }
      else if (type == SYNC_STMT) {
        return new GooseSyncStmtImpl(node);
      }
      else if (type == TYPE) {
        return new GooseTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
