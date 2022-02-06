package eotree

import arrow.core.Some
import eotree.data.EOIntData
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for EO Meta Objects (i.e. high-level abstractions on top of EO)
 */
class TestEOMetaObjects {

    @Test
    fun testEOSeqCall() {
        val expr = EOSeqCall(
            EOCopy("function1", "arg1".eoDot(), "arg2".eoDot()),
            EOCopy("function2", "arg1".eoDot(), "arg2".eoDot()),
        )
        assertEquals(
            """
            seq > @
              function1
                arg1
                arg2
              function2
                arg1
                arg2
            """.trimIndent(),
            expr.generateEO(0)
        )
    }

    @Test
    fun testEOFunctionDeclaration() {
        val expr = EOFunctionDeclaration(
            "function",
            listOf("arg1", "arg2"),
            Some("vararg"),
            listOf(
                EOBndExpr(EOIntData(1), "bnd1"),
                EOBndExpr(EOIntData(2), "bnd2"),
            ),
            listOf(
                EOCopy("call1", "arg1".eoDot(), "arg2".eoDot()),
                EOCopy("call2", "arg1".eoDot(), "arg2".eoDot()),
            ),
            "comment",
        )

        assertEquals(
            """
            # comment
            [arg1 arg2 vararg...] > function
              1 > bnd1
              2 > bnd2
              seq > @
                call1
                  arg1
                  arg2
                call2
                  arg1
                  arg2
            """.trimIndent(),
            expr.generateEO(0)
        )
    }
}
