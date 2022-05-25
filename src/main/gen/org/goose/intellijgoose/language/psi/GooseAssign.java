// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GooseAssign extends PsiElement {

  @NotNull
  GooseAssignOp getAssignOp();

  @NotNull
  GooseExpr getExpr();

  @NotNull
  PsiElement getIdent();

  @Nullable
  PsiElement getUnique();

}
