// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class GooseVisitor extends PsiElementVisitor {

  public void visitAssign(@NotNull GooseAssign o) {
    visitPsiElement(o);
  }

  public void visitAssignOp(@NotNull GooseAssignOp o) {
    visitPsiElement(o);
  }

  public void visitAtomExpr(@NotNull GooseAtomExpr o) {
    visitExpr(o);
  }

  public void visitCallExpr(@NotNull GooseCallExpr o) {
    visitExpr(o);
  }

  public void visitCmpExpr(@NotNull GooseCmpExpr o) {
    visitExpr(o);
  }

  public void visitExpr(@NotNull GooseExpr o) {
    visitPsiElement(o);
  }

  public void visitFnArg(@NotNull GooseFnArg o) {
    visitPsiElement(o);
  }

  public void visitFunc(@NotNull GooseFunc o) {
    visitPsiElement(o);
  }

  public void visitLitExpr(@NotNull GooseLitExpr o) {
    visitExpr(o);
  }

  public void visitLiteral(@NotNull GooseLiteral o) {
    visitPsiElement(o);
  }

  public void visitMulExpr(@NotNull GooseMulExpr o) {
    visitExpr(o);
  }

  public void visitOnceStmt(@NotNull GooseOnceStmt o) {
    visitPsiElement(o);
  }

  public void visitParamName(@NotNull GooseParamName o) {
    visitPsiElement(o);
  }

  public void visitPlusExpr(@NotNull GoosePlusExpr o) {
    visitExpr(o);
  }

  public void visitStmt(@NotNull GooseStmt o) {
    visitPsiElement(o);
  }

  public void visitSyncStmt(@NotNull GooseSyncStmt o) {
    visitPsiElement(o);
  }

  public void visitType(@NotNull GooseType o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
