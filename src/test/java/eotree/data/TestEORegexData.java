package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO regex data tests.
 */
public class TestEORegexData {

    private static final String regexSample = "/[a-z]+.+/m";

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EORegexData(regexSample);

        assertEquals(f.generateEO(0), regexSample);
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EORegexData(regexSample);

        assertEquals(f.generateEO(1), regexSample);
    }
}
