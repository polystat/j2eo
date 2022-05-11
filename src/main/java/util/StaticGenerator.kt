package util

import arrow.core.flatten
import arrow.core.flattenOption
import eotree.EOBndExpr
import lexer.TokenCode
import translator.mapClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration

fun generateStatic(clsDec: NormalClassDeclaration): List<EOBndExpr> {
    try {
        return clsDec.body.declarations
            .filter { dec: Declaration ->
                dec.modifiers != null &&
                    dec.modifiers.modifiers.modifiers.find { code: TokenCode -> code == TokenCode.Static } != null
            } // TODO
            .map { mapClassDeclaration(it) }
            .flatten()
    } catch (e: NullPointerException) {
        return ArrayList()
    }
}
