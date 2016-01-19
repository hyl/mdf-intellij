// This is a generated file. Not intended for manual editing.
package com.karambyte.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.karambyte.psi.MdfTypes.*;
import com.karambyte.psi.*;

public class MdfPropertyImpl extends MdfNamedElementImpl implements MdfProperty {

  public MdfPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MdfVisitor) ((MdfVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
