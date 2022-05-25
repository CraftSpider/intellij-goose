package org.goose.intellijgoose.language.psi

import com.intellij.psi.tree.IElementType
import org.goose.intellijgoose.GooseLanguage

class GooseTokenType(debugName: String) : IElementType(debugName, GooseLanguage.INSTANCE) {
    override fun toString(): String = "GooseTokenType." + super.toString()
}
