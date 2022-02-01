/**
 * This file contains higher-level abstractions for some EO objects, such as functions, function calls, etc.
 */

package eotree

import arrow.core.None
import arrow.core.Option

/**
 * Generator of seq > @ blocks.
 */
fun EOSeqCall(vararg statements: EOCopy): EOBndExpr = EOSeqCall(statements.toList())

// TODO: maybe expand list type from List<EOCopy> to List<EOExpr>?
/**
 * Generator of seq > @ blocks.
 */
fun EOSeqCall(statements: List<EOCopy>): EOBndExpr =
    EOBndExpr(EOCopy("seq", statements), "@")

/**
 * Generator for EO functions.
 *
 * @param name function name
 * @param args free attributes of the function (arguments)
 * @param vararg optional variable argument
 * @param bnds bindings that go before seq (declarative bindings)
 * @param statements imperative calls that go inside seq block
 */
fun EOFunctionDeclaration(
    name: String,
    args: List<String>,
    vararg: Option<String> = None,
    bnds: List<EOBndExpr> = emptyList(),
    statements: List<EOCopy> = emptyList(),
    comment: String = "",
): EOBndExpr =
    EOBndExpr(
        EOObject(
            args,
            vararg,
            bnds + EOSeqCall(statements),
            comment,
        ),
        name
    )
