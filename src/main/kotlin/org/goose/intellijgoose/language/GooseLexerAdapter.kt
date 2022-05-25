package org.goose.intellijgoose.language

import com.intellij.lexer.FlexAdapter

class GooseLexerAdapter : FlexAdapter(_GooseLexer(null)) {}