package eotree

import java.util.stream.Collectors

class EOCopy(var trg: EOExpr, var args: List<EOBnd>) : EOExpr() {
    override fun generateEO(indent: Int): String {
        return trg.generateEO(indent) + args.stream()
            .map { arg: EOBnd ->
                """
     
     ${arg.generateEO(indent + 1)}
     """.trimIndent()
            }
            .collect(Collectors.joining())
    }
}