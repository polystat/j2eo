package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

import org.junit.jupiter.api.Test;

/**
 * EO copying feature tests.
 */
public class TestEOCopy {

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EOCopy(
                new EODot("name"),
                listOf(
                        new EODot("arg1"),
                        new EODot("arg2")
                        )
        );
        assertEquals("name\n  arg1\n  arg2", f.generateEO(0));
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOCopy(
                new EODot("name"),
                listOf(
                        new EODot("arg1"),
                        new EODot("arg2")
                )
        );
        assertEquals("  name\n    arg1\n    arg2", f.generateEO(1));
    }
}
