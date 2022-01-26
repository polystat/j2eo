package eotree

class EOCopy : EOExpr {
    val trg: EODot
    val args: List<EOExpr>

    constructor(trg: String, args: List<EOExpr>) {
        this.trg = trg.eoDot()
        this.args = args
    }

    constructor(trg: EODot, args: List<EOExpr>) {
        this.trg = trg
        this.args = args
    }

    constructor(trg: String, vararg args: EOExpr) : this(trg, args.toList())

    constructor(trg: EODot, vararg args: EOExpr) : this(trg, args.toList())

    override fun generateEO(indent: Int): String {
        return trg.generateEO(indent) + args
            .map { arg -> "\n${arg.generateEO(indent + 1)}" }
            .joinToString("")
    }

    override fun toString(): String =
        "$trg(${args.joinToString()})"
}
