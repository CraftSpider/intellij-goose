// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GooseFunc extends PsiElement {

  @NotNull
  GooseExpr getExpr();

  @NotNull
  List<GooseFnArg> getFnArgList();

  @NotNull
  List<GooseStmt> getStmtList();

  @NotNull
  GooseType getType();

  @NotNull
  PsiElement getIdent();

}
