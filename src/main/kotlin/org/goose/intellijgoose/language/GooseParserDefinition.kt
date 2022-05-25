package org.goose.intellijgoose.language

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.goose.intellijgoose.GooseLanguage
import org.goose.intellijgoose.language.parser.GooseParser
import org.goose.intellijgoose.language.psi.GooseFile
import org.goose.intellijgoose.language.psi.GooseTypes

class GooseParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS: TokenSet = TokenSet.create(GooseTypes.COMMENT, GooseTypes.MULTILINE_COMMENT)

        val FILE: IFileElementType = IFileElementType(GooseLanguage.INSTANCE)
    }

    override fun createLexer(project: Project): Lexer = GooseLexerAdapter()

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createParser(project: Project?): PsiParser = GooseParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile = GooseFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    override fun createElement(node: ASTNode?): PsiElement = GooseTypes.Factory.createElement(node)
}