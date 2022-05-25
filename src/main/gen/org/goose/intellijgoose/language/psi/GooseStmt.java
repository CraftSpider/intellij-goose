// This is a generated file. Not intended for manual editing.
package org.goose.intellijgoose.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GooseStmt extends PsiElement {

  @Nullable
  GooseAssign getAssign();

  @Nullable
  GooseExpr getExpr();

  @Nullable
  GooseFunc getFunc();

  @Nullable
  GooseOnceStmt getOnceStmt();

  @Nullable
  GooseSyncStmt getSyncStmt();

}
