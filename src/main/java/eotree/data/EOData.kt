package eotree.data

import eotree.EOExpr

/**
 * EBNF representation:
 * `
 * bytes | string | integer | char | float | regex
` *
 *
 */
abstract class EOData : EOExpr()
