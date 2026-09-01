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
        val f = EORegexData(REGEX_SAMPLE)
        Assertions.assertEquals(f.generateEO(0), REGEX_SAMPLE)
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EORegexData(REGEX_SAMPLE)
        Assertions.assertEquals(f.generateEO(1), REGEX_SAMPLE)
    }

    companion object {
        private const val REGEX_SAMPLE = "/[a-z]+.+/m"
    }
}
