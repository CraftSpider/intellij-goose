package org.goose.intellijgoose.language

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.goose.intellijgoose.language.psi.GooseTypes


class GooseSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val COMMENT = createTextAttributesKey("GOOSE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val MULTI_LINE_COMMENT = createTextAttributesKey("GOOSE_MULTILINE_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)

        val NUMBER = createTextAttributesKey("GOOSE_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val CHAR = createTextAttributesKey("GOOSE_CHAR", DefaultLanguageHighlighterColors.STRING)
        val STRING = createTextAttributesKey("GOOSE_STRING", DefaultLanguageHighlighterColors.STRING)

        val KEYWORD = createTextAttributesKey("GOOSE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val IDENT = createTextAttributesKey("GOOSE_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val PARAM = createTextAttributesKey("GOOSE_PARAMETER", DefaultLanguageHighlighterColors.PARAMETER)

        val BAD_CHARACTER = createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(COMMENT)
        val MULTI_LINE_COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(MULTI_LINE_COMMENT)

        val NUMBER_KEYS: Array<TextAttributesKey> = arrayOf(NUMBER)
        val CHAR_KEYS: Array<TextAttributesKey> = arrayOf(CHAR)
        val STRING_KEYS: Array<TextAttributesKey> = arrayOf(STRING)

        val KEYWORD_KEYS: Array<TextAttributesKey> = arrayOf(KEYWORD)
        val IDENT_KEYS: Array<TextAttributesKey> = arrayOf(IDENT)
        val PARAM_KEYS: Array<TextAttributesKey> = arrayOf(PARAM)

        val BAD_CHARACTER_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER)
        val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf()
    }

    override fun getHighlightingLexer(): Lexer = GooseLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when(tokenType) {
            GooseTypes.COMMENT -> COMMENT_KEYS
            GooseTypes.MULTILINE_COMMENT -> MULTI_LINE_COMMENT_KEYS

            GooseTypes.INT -> NUMBER_KEYS
            GooseTypes.FLOAT -> NUMBER_KEYS

            GooseTypes.CHAR -> CHAR_KEYS
            GooseTypes.CHARARRAY -> STRING_KEYS

            GooseTypes.DEF -> KEYWORD_KEYS
            GooseTypes.FN -> KEYWORD_KEYS
            GooseTypes.ONCE -> KEYWORD_KEYS
            GooseTypes.SYNC -> KEYWORD_KEYS
            GooseTypes.UNIQUE -> KEYWORD_KEYS
            GooseTypes.CARRYOVER -> KEYWORD_KEYS

            GooseTypes.PARAM_NAME -> PARAM_KEYS

            GooseTypes.IDENT -> IDENT_KEYS

            TokenType.BAD_CHARACTER -> BAD_CHARACTER_KEYS
            else -> EMPTY_KEYS
        }
    }
}