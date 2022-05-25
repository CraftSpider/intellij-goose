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

public class GooseFnArgImpl extends ASTWrapperPsiElement implements GooseFnArg {

  public GooseFnArgImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GooseVisitor visitor) {
    visitor.visitFnArg(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GooseVisitor) accept((GooseVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GooseParamName getParamName() {
    return findNotNullChildByClass(GooseParamName.class);
  }

  @Override
  @NotNull
  public GooseType getType() {
    return findNotNullChildByClass(GooseType.class);
  }

}
