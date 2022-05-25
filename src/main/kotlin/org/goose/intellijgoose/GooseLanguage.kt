package org.goose.intellijgoose

import com.intellij.lang.Language;

class GooseLanguage private constructor() : Language("Goose") {
    companion object {
        @JvmField
        val INSTANCE: GooseLanguage = GooseLanguage()
    }
}