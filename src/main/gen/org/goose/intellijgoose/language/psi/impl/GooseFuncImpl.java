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

public class GooseFuncImpl extends ASTWrapperPsiElement implements GooseFunc {

  public GooseFuncImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GooseVisitor visitor) {
    visitor.visitFunc(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GooseVisitor) accept((GooseVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GooseExpr getExpr() {
    return findNotNullChildByClass(GooseExpr.class);
  }

  @Override
  @NotNull
  public List<GooseFnArg> getFnArgList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GooseFnArg.class);
  }

  @Override
  @NotNull
  public List<GooseStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GooseStmt.class);
  }

  @Override
  @NotNull
  public GooseType getType() {
    return findNotNullChildByClass(GooseType.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
