package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO char data tests.
 */
public class TestEOCharData {

    @Test
    public void testGenerateEOZeroIndent() {
        var c = new EOCharData('a');

        assertEquals(c.generateEO(0), "'a'");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var c = new EOCharData('a');

        assertEquals(c.generateEO(1), "'a'");
    }
}
