package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO int data tests.
 */
public class TestEOIntData {

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EOIntData(42);

        assertEquals(f.generateEO(0), "42");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOIntData(42);

        assertEquals(f.generateEO(1), "  42");
    }
}
