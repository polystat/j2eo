package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOCopy
import org.polystat.j2eo.eotree.EODot
import org.polystat.j2eo.util.ListUtils.listOf

/**
 * EO copying feature tests.
 */
class TestEOCopy {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOCopy(
            EODot("name"),
            listOf(
                EODot("arg1"),
                EODot("arg2")
            )
        )
        Assertions.assertEquals("name\n  arg1\n  arg2", f.generateEO(0))
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOCopy(
            EODot("name"),
            listOf(
                EODot("arg1"),
                EODot("arg2")
            )
        )
        Assertions.assertEquals("  name\n    arg1\n    arg2", f.generateEO(1))
    }
}
