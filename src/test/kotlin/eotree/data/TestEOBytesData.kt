package eotree.data

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.data.EOByte
import org.polystat.j2eo.eotree.data.EOBytesData
import java.util.Arrays
import java.util.stream.Collectors

/**
 * EO bytes data tests.
 */
class TestEOBytesData {
    @Test
    fun testGenerateEOZeroIndent() {
        val bytes = EOBytesData(
            EOByte(1.toByte()),
            EOByte(255.toByte())
        )
        Assertions.assertEquals(bytes.generateEO(0), "01-FF")
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val bytes = EOBytesData(
            Arrays.stream(
                arrayOf(
                    EOByte(1.toByte()),
                    EOByte(255.toByte())
                )
            ).collect(Collectors.toList())
        )
        Assertions.assertEquals(bytes.generateEO(1), "01-FF")
    }
}
