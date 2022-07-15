package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOMeta

/**
 * EO meta tests.
 */
class TestEOMeta {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOMeta("key", "value")
        Assertions.assertEquals("+key value", f.generateEO(0))
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOMeta("key", "value")
        Assertions.assertEquals("+key value", f.generateEO(1))
    }
}
