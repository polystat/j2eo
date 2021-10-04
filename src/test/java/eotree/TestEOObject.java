package eotree;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

public class TestEOObject {

    @Test
    public void TestGenerateEOZeroIndent() {
        var object = new EOObject(
                listOf(
                        new EOBndName("free1"),
                        new EOBndName("free2")
                ),
                Optional.of(
                        new EOBndName("vararg")
                ),
                listOf(
                        new EOBndExpr(
                                new EODot(Optional.empty(), "memory"),
                                new EOBndName("bnd1")
                        ),
                        new EOBndExpr(
                                new EODot(Optional.empty(), "memory"),
                                new EOBndName("bnd2")
                        )
                ),
                Optional.of("objectName")
        );
        assertEquals(
                """
                        [free1 free2 vararg...] > objectName
                          memory > bnd1
                          memory > bnd2""",
                object.generateEO(0)
        );
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var object = new EOObject(
                listOf(
                        new EOBndName("free1"),
                        new EOBndName("free2")
                ),
                Optional.of(
                        new EOBndName("vararg")
                ),
                listOf(
                        new EOBndExpr(
                                new EODot(Optional.empty(), "memory"),
                                new EOBndName("bnd1")
                        ),
                        new EOBndExpr(
                                new EODot(Optional.empty(), "memory"),
                                new EOBndName("bnd2")
                        )
                ),
                Optional.of("objectName")
        );
        //noinspection TextBlockMigration
        assertEquals(
                "  [free1 free2 vararg...] > objectName\n" +
                "    memory > bnd1\n" +
                "    memory > bnd2",
                object.generateEO(1)
        );
    }
}
