package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOCharData

/**
 * EO char data tests.
 */
class TestEOCharData {
    @Test
    fun testGenerateEOZeroIndent() {
        val c = EOCharData('a')
        Assertions.assertEquals(c.generateEO(0), "'a'")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val c = EOCharData('a')
        Assertions.assertEquals(c.generateEO(1), "'a'")
    }
}
