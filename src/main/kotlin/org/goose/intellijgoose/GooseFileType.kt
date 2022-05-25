package org.goose.intellijgoose

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GooseFileType private constructor() : LanguageFileType(GooseLanguage.INSTANCE) {
    companion object {
        @JvmField
        val INSTANCE: GooseFileType = GooseFileType()
    }

    override fun getName(): String = "Goose File"

    override fun getDescription(): String = "Goose language file"

    override fun getDefaultExtension(): String = "hnk"

    override fun getIcon(): Icon = GooseIcons.FILE
}