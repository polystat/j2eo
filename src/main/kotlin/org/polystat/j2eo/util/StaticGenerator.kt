package org.polystat.j2eo.util

import arrow.core.flatten
import lexer.TokenCode
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.translator.Context
import org.polystat.j2eo.translator.mapClassDeclaration
import tree.Declaration.ClassDeclaration
import tree.Declaration.ConstructorDeclaration
import tree.Declaration.Declaration
import tree.Declaration.NormalClassDeclaration

/**
 * Maps all static class members to EO bindings, skipping non-static ones.
 */
// @todo #165:90m dec is ClassDeclaration is not always true
fun generateStatic(clsDec: NormalClassDeclaration, context: Context): List<EOBndExpr> {
    return clsDec.body.declarations
        .filter { dec: Declaration ->
            dec.modifiers?.modifiers?.modifiers?.find { it == TokenCode.Static } != null ||
                dec is ConstructorDeclaration ||
                dec is ClassDeclaration
        }
        .map { mapClassDeclaration(it, context) }
        .flatten()
}
