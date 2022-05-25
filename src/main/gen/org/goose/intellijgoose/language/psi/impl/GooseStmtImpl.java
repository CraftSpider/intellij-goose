// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.goose.intellijgoose.language.psi.GooseTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.goose.intellijgoose.language.psi.*;

public class GooseStmtImpl extends ASTWrapperPsiElement implements GooseStmt {

  public GooseStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GooseVisitor visitor) {
    visitor.visitStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GooseVisitor) accept((GooseVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GooseAssign getAssign() {
    return findChildByClass(GooseAssign.class);
  }

  @Override
  @Nullable
  public GooseExpr getExpr() {
    return findChildByClass(GooseExpr.class);
  }

  @Override
  @Nullable
  public GooseFunc getFunc() {
    return findChildByClass(GooseFunc.class);
  }

  @Override
  @Nullable
  public GooseOnceStmt getOnceStmt() {
    return findChildByClass(GooseOnceStmt.class);
  }

  @Override
  @Nullable
  public GooseSyncStmt getSyncStmt() {
    return findChildByClass(GooseSyncStmt.class);
  }

}
