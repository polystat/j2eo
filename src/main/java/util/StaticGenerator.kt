package util

import arrow.core.flatten
import arrow.core.flattenOption
import eotree.EOBndExpr
import lexer.TokenCode
import translator.mapClassDeclaration
import tree.Declaration.ClassDeclaration
import tree.Declaration.ConstructorDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration

fun generateStatic(clsDec: NormalClassDeclaration): List<EOBndExpr> {
    return clsDec.body.declarations
        .filter { dec: Declaration ->
            dec.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } != null ||
                    dec is ConstructorDeclaration ||
                    dec is ClassDeclaration /* FIXME (IT'S NOT ALWAYS TRUE) */
        } // TODO
        .map { mapClassDeclaration(it) }
        .flatten()
}
