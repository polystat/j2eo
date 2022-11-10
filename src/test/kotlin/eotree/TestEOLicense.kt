package eotree

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOComment
import org.polystat.j2eo.eotree.EOLicense
import java.util.Arrays
import java.util.stream.Collectors

/**
 * EO license tests.
 */
class TestEOLicense {
    @Test
    fun testGenerateEOZeroIndent() {
        val license = EOLicense(
            EOComment("test comment 1"),
            EOComment("test comment 2")
        )
        Assertions.assertEquals(
            license.generateEO(0),
            """
     # test comment 1
     # test comment 2
            """.trimIndent()
        )
        val licenseFromStream = EOLicense(
            Arrays.stream(
                arrayOf(
                    EOComment("test comment 3"),
                    EOComment("test comment 4")
                )
            ).collect(Collectors.toList())
        )
        Assertions.assertEquals(
            licenseFromStream.generateEO(0),
            """
     # test comment 3
     # test comment 4
            """.trimIndent()
        )
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val license = EOLicense(
            EOComment("test comment 5"),
            EOComment("test comment 6")
        )
        Assertions.assertEquals(
            license.generateEO(1),
            """
     # test comment 5
     # test comment 6
            """.trimIndent()
        )
        val licenseFromStream = EOLicense(
            Arrays.stream(
                arrayOf(
                    EOComment("test comment 7"),
                    EOComment("test comment 8")
                )
            ).collect(Collectors.toList())
        )
        Assertions.assertEquals(
            licenseFromStream.generateEO(1),
            """
     # test comment 7
     # test comment 8
            """.trimIndent()
        )
    }
}
