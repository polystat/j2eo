package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO bound expression tests.
 */
public class TestEOBndExpr {

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EOBndExpr(
                new EODot("memory"),
                "bnd1"
        );
        assertEquals("memory > bnd1", f.generateEO(0));
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOBndExpr(
                new EODot("memory"),
                "bnd1"
        );
        assertEquals("  memory > bnd1", f.generateEO(1));
    }
}
