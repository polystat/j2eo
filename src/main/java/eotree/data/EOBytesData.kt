package eotree.data

import java.util.*
import java.util.stream.Collectors

/**
 * EBNF representation:
 * `
 * byte { '-' byte }
` *
 */
class EOBytesData(var bytes: List<EOByte>) : EOData() {
    constructor(vararg bytes: EOByte) : this(Arrays.stream<EOByte>(bytes).collect(Collectors.toList<EOByte>())) {}

    override fun generateEO(indent: Int): String {
        return bytes.stream()
            .map { b: EOByte -> b.generateEO(indent) }
            .collect(Collectors.joining("-"))
    }
}