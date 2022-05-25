package org.goose.intellijgoose.language.psi

import com.intellij.psi.tree.IElementType
import org.goose.intellijgoose.GooseLanguage

class GooseElementType(debugName: String) : IElementType(debugName, GooseLanguage.INSTANCE) {}
