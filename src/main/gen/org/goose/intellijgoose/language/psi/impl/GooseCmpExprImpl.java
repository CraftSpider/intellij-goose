// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.goose.intellijgoose.language.psi.GooseTypes.*;
import org.goose.intellijgoose.language.psi.*;

public class GooseCmpExprImpl extends GooseExprImpl implements GooseCmpExpr {

  public GooseCmpExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull GooseVisitor visitor) {
    visitor.visitCmpExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GooseVisitor) accept((GooseVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GooseExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GooseExpr.class);
  }

}
