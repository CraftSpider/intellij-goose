package org.goose.intellijgoose.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.goose.intellijgoose.GooseFileType
import org.goose.intellijgoose.GooseLanguage

class GooseFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, GooseLanguage.INSTANCE) {

    override fun getFileType(): FileType = GooseFileType.INSTANCE

    override fun toString(): String = "Goose File"
}
