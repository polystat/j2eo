package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EORegexData

/**
 * EO regex data tests.
 */
class TestEORegexData {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EORegexData(regexSample)
        Assertions.assertEquals(f.generateEO(0), regexSample)
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EORegexData(regexSample)
        Assertions.assertEquals(f.generateEO(1), regexSample)
    }

    companion object {
        private const val regexSample = "/[a-z]+.+/m"
    }
}
