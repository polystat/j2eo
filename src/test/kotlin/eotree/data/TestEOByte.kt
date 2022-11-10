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
        val oneByte = EOByte(1.toByte())
        Assertions.assertEquals(oneByte.generateEO(0), "01")

        // Double-digit byte
        val maxByte = EOByte(255.toByte())
        Assertions.assertEquals(maxByte.generateEO(0), "FF")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val oneByte = EOByte(1.toByte())
        Assertions.assertEquals(oneByte.generateEO(1), "01")

        // Double-digit byte
        val maxByte = EOByte(255.toByte())
        Assertions.assertEquals(maxByte.generateEO(1), "FF")
    }
}
