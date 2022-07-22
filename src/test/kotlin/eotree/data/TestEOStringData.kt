package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOStringData

/**
 * EO string data tests.
 */
class TestEOStringData {
    @Test
    fun testGenerateEOZeroIndent() {
        val s = EOStringData("hello world")
        Assertions.assertEquals(s.generateEO(0), "\"hello world\"")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOStringData("hello world")
        Assertions.assertEquals(f.generateEO(1), "  \"hello world\"")
    }
}
