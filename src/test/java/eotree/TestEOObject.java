package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

import arrow.core.Some;
import org.junit.jupiter.api.Test;

/**
 * EO object tests.
 */
public class TestEOObject {

    private static final String memAtom = "memory";

    @Test
    public void testGenerateEOZeroIndent() {
        var object = new EOObject(
                listOf(
                        "free1",
                        "free2"
                ),
                new Some<>("vararg"),
                listOf(
                        new EOBndExpr(
                                new EODot(memAtom),
                                "bnd1"
                        ),
                        new EOBndExpr(
                                new EODot(memAtom),
                                "bnd2"
                        )
                ),
                "comment"
        );
        assertEquals(
                "# comment\n" +
                "[free1 free2 vararg...]\n" +
                "  memory > bnd1\n" +
                "  memory > bnd2",
                object.generateEO(0)
        );
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var object = new EOObject(
                listOf("free1", "free2"),
                new Some<>("vararg"),
                listOf(
                        new EOBndExpr(
                                new EODot(memAtom),
                                "bnd1"
                        ),
                        new EOBndExpr(
                                new EODot(memAtom),
                                "bnd2"
                        )
                ),
                "comment"
        );
        //noinspection TextBlockMigration
        assertEquals(
                "  # comment\n"
                + "  [free1 free2 vararg...]\n"
                + "    memory > bnd1\n"
                + "    memory > bnd2",
                object.generateEO(1)
        );
    }
}
