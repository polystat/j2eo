package eotree;

import arrow.core.Some;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

public class TestEOObject {

    @Test
    public void TestGenerateEOZeroIndent() {
        var object = new EOObject(
                listOf(
                        "free1",
                        "free2"
                ),
                new Some<>("vararg"),
                listOf(
                        new EOBndExpr(
                                new EODot("memory"),
                                "bnd1"
                        ),
                        new EOBndExpr(
                                new EODot("memory"),
                                "bnd2"
                        )
                ),
                ""
        );
        assertEquals(
                """
                        [free1 free2 vararg...]
                          memory > bnd1
                          memory > bnd2""",
                object.generateEO(0)
        );
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var object = new EOObject(
                listOf("free1", "free2"),
                new Some<>("vararg"),
                listOf(
                        new EOBndExpr(
                                new EODot("memory"),
                                "bnd1"
                        ),
                        new EOBndExpr(
                                new EODot("memory"),
                                "bnd2"
                        )
                ),
                ""
        );
        //noinspection TextBlockMigration
        assertEquals(
                "  [free1 free2 vararg...]\n" +
                "    memory > bnd1\n" +
                "    memory > bnd2",
                object.generateEO(1)
        );
    }
}
