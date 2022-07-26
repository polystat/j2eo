package eotree

import arrow.core.Some
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EODot
import org.polystat.j2eo.eotree.EOObject
import org.polystat.j2eo.util.ListUtils.listOf

/**
 * EO object tests.
 */
class TestEOObject {
    @Test
    fun testGenerateEOZeroIndent() {
        val eoObject = EOObject(
            listOf(
                "free1",
                "free2"
            ),
            Some("vararg"),
            listOf(
                EOBndExpr(
                    EODot(memAtom),
                    "bnd1"
                ),
                EOBndExpr(
                    EODot(memAtom),
                    "bnd2"
                )
            ),
            "comment"
        )
        Assertions.assertEquals(
            "# comment\n" +
                "[free1 free2 vararg...]\n" +
                "  memory > bnd1\n" +
                "  memory > bnd2",
            eoObject.generateEO(0)
        )
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val eoObject = EOObject(
            listOf("free1", "free2"),
            Some("vararg"),
            listOf(
                EOBndExpr(
                    EODot(memAtom),
                    "bnd1"
                ),
                EOBndExpr(
                    EODot(memAtom),
                    "bnd2"
                )
            ),
            "comment"
        )
        Assertions.assertEquals(
            """  # comment
  [free1 free2 vararg...]
    memory > bnd1
    memory > bnd2""",
            eoObject.generateEO(1)
        )
    }

    companion object {
        private const val memAtom = "memory"
    }
}
