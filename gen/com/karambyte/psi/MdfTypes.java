// This is a generated file. Not intended for manual editing.
package com.karambyte.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.karambyte.psi.impl.*;

public interface MdfTypes {

  IElementType PROPERTY = new MdfElementType("PROPERTY");

  IElementType COMMENT = new MdfTokenType("COMMENT");
  IElementType CRLF = new MdfTokenType("CRLF");
  IElementType KEY = new MdfTokenType("KEY");
  IElementType SEPARATOR = new MdfTokenType("SEPARATOR");
  IElementType VALUE = new MdfTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new MdfPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
