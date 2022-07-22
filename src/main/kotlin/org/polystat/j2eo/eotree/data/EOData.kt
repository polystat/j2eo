package org.polystat.j2eo.eotree.data

import org.polystat.j2eo.eotree.EOExpr

/**
 * EBNF representation:
 * `
 * bytes | string | integer | char | float | regex
` *
 *
 */
abstract class EOData : EOExpr()
