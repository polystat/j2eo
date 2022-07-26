package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOComment

/**
 * EO comments tests.
 */
class TestEOComment {
    @Test
    fun testGenerateEOZeroIndent() {
        val comment = EOComment("test comment")
        Assertions.assertEquals(comment.generateEO(0), "# test comment")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val comment = EOComment("test comment")
        Assertions.assertEquals(comment.generateEO(2), "# test comment")
    }
}
