package eotree

class EOAnonExpr(expr: EOExpr) : EOBnd(expr) {
    override fun generateEO(indent: Int): String {
        return expr.generateEO(indent)
    }
}

fun EOExpr.anonExpr(): EOAnonExpr = EOAnonExpr(this)

fun List<EOExpr>.anonExprs(): List<EOAnonExpr> = map { e -> e.anonExpr() }