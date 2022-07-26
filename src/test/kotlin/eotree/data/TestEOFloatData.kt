package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOFloatData

/**
 * EO float data tests.
 */
class TestEOFloatData {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOFloatData(3.14f)
        Assertions.assertEquals(f.generateEO(0), "3.14")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOFloatData(3.14f)
        Assertions.assertEquals(f.generateEO(1), "  3.14")
    }
}
