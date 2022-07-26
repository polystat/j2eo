package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOIntData

/**
 * EO int data tests.
 */
class TestEOIntData {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOIntData(42)
        Assertions.assertEquals(f.generateEO(0), "42")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOIntData(42)
        Assertions.assertEquals(f.generateEO(1), "  42")
    }
}
