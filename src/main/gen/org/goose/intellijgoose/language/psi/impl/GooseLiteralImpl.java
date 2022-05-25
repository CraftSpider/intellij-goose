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

public class GooseLiteralImpl extends ASTWrapperPsiElement implements GooseLiteral {

  public GooseLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GooseVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GooseVisitor) accept((GooseVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getBit() {
    return findChildByType(BIT);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

  @Override
  @Nullable
  public PsiElement getChararray() {
    return findChildByType(CHARARRAY);
  }

  @Override
  @Nullable
  public PsiElement getFloat() {
    return findChildByType(FLOAT);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

}
