package eotree

import arrow.core.Some
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.polystat.j2eo.eotree.EOMeta
import org.polystat.j2eo.eotree.EOMetas
import org.polystat.j2eo.util.ListUtils.listOf

/**
 * EO metas tests.
 */
class TestEOMetas {
    @Test
    fun testGenerateEOZeroIndent() {
        val f = EOMetas(
            Some("org.eolang.package"),
            listOf(
                EOMeta("key1", "value1"),
                EOMeta("key2", "value2")
            )
        )
        Assertions.assertEquals(
            "+package org.eolang.package\n" +
                "+key1 value1\n" +
                "+key2 value2",
            f.generateEO(0)
        )
    }

    @Test
    fun testGenerateEONonZeroIndent() {
        val f = EOMetas(
            Some("org.eolang.package"),
            listOf(
                EOMeta("key1", "value1"),
                EOMeta("key2", "value2")
            )
        )
        Assertions.assertEquals(
            "+package org.eolang.package\n" +
                "+key1 value1\n" +
                "+key2 value2",
            f.generateEO(1)
        )
    }
}
