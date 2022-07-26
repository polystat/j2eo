package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOBndExpr
import org.polystat.j2eo.eotree.EODot

/**
 * EO bound expression tests.
 */
class TestEOBndExpr {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOBndExpr(
            EODot("memory"),
            "bnd1"
        )
        Assertions.assertEquals("memory > bnd1", f.generateEO(0))
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOBndExpr(
            EODot("memory"),
            "bnd1"
        )
        Assertions.assertEquals("  memory > bnd1", f.generateEO(1))
    }
}
