package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.polystat.j2eo.util.ListUtils.listOf;

import org.junit.jupiter.api.Test;
import org.polystat.j2eo.eotree.EOCopy;
import org.polystat.j2eo.eotree.EODot;

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
