// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GooseFnCall extends PsiElement {

  @NotNull
  List<GooseExpr> getExprList();

  @NotNull
  PsiElement getIdent();

}
