package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO string data tests.
 */
public class TestEOStringData {

    @Test
    public void testGenerateEOZeroIndent() {
        var s = new EOStringData("hello world");

        assertEquals(s.generateEO(0), "\"hello world\"");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOStringData("hello world");

        assertEquals(f.generateEO(1), "  \"hello world\"");
    }
}
