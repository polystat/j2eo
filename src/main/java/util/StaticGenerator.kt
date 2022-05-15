package util

import arrow.core.flatten
import eotree.EOBndExpr
import lexer.TokenCode
import translator.mapClassDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration

/**
 * Maps all static class members to EO bindings, skipping non-static ones.
 */
fun generateStatic(clsDec: NormalClassDeclaration): List<EOBndExpr> {
    return try {
        clsDec.body.declarations
            .filter { dec: Declaration ->
                dec.modifiers != null &&
                        dec.modifiers.modifiers.modifiers.find { code: TokenCode -> code == TokenCode.Static } != null
            }
            .map { mapClassDeclaration(it) }
            .flatten()
    } catch (e: NullPointerException) {
        logger.warn { "Caught NullPointerException while mapping static class members in generateStatic" }
        ArrayList()
    }
}
