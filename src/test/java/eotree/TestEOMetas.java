package eotree;

import arrow.core.Some;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

public class TestEOMetas {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOMetas(
                new Some<>("org.eolang.package"),
                listOf(
                        new EOMeta("key1", "value1"),
                        new EOMeta("key2", "value2")
                )
        );
        assertEquals("""
                        +package org.eolang.package
                        +key1 value1
                        +key2 value2""",
                f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOMetas(
                new Some<>("org.eolang.package"),
                listOf(
                        new EOMeta("key1", "value1"),
                        new EOMeta("key2", "value2")
                )
        );
        assertEquals("""
                        +package org.eolang.package
                        +key1 value1
                        +key2 value2""",
                f.generateEO(1));
    }
}
