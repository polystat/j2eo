package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOByte

/**
 * EO byte tests.
 */
class TestEOByte {
    @Test
    fun testGenerateEOZeroIndent() {
        // Single-digit byte
        var b = EOByte(1.toByte())
        Assertions.assertEquals(b.generateEO(0), "01")

        // Double-digit byte
        b = EOByte(255.toByte())
        Assertions.assertEquals(b.generateEO(0), "FF")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        var b = EOByte(1.toByte())
        Assertions.assertEquals(b.generateEO(1), "01")

        // Double-digit byte
        b = EOByte(255.toByte())
        Assertions.assertEquals(b.generateEO(1), "FF")
    }
}
