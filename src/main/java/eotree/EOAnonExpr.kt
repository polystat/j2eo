package eotree

class EOAnonExpr(expr: EOExpr) : EOBnd(expr) {
    override fun generateEO(indent: Int): String {
        return expr.generateEO(indent)
    }
}