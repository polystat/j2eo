package util

import arrow.core.flatten
import eotree.EOBndExpr
import lexer.TokenCode
import translator.Context
import translator.mapClassDeclaration
import tree.Declaration.ClassDeclaration
import tree.Declaration.ConstructorDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration

/**
 * Maps all static class members to EO bindings, skipping non-static ones.
 */
fun generateStatic(clsDec: NormalClassDeclaration, context: Context): List<EOBndExpr> {
    return clsDec.body.declarations
        .filter { dec: Declaration ->
            dec.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } != null ||
                    dec is ConstructorDeclaration ||
                    dec is ClassDeclaration /* FIXME (IT'S NOT ALWAYS TRUE) */
        } // TODO
        .map { mapClassDeclaration(it, context) }
        .flatten()
}
