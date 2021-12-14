package eotree

class EOCopy : EOExpr {
    val trg: EODot
    val args: List<EOAnonExpr>

    constructor(trg: String, args: List<EOAnonExpr>) {
        this.trg = trg.eoDot()
        this.args = args
    }

    constructor(trg: EODot, args: List<EOAnonExpr>) {
        this.trg = trg
        this.args = args
    }

    override fun generateEO(indent: Int): String {
        return trg.generateEO(indent) + args
            .map { arg: EOBnd -> "\n${arg.generateEO(indent + 1)}" }
            .joinToString("")
    }
}