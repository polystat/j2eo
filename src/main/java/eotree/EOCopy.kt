package eotree

import java.util.stream.Collectors

class EOCopy(var trg: EODot, var args: List<EOBnd>) : EOExpr() {
    override fun generateEO(indent: Int): String {
        return trg.generateEO(indent) + args
            .map { arg: EOBnd -> "\n${arg.generateEO(indent + 1)}" }
            .joinToString("")
    }
}