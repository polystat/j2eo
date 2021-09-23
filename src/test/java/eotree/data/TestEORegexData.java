package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEORegexData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EORegexData("/[a-z]+.+/m");

        assertEquals(f.generateEO(0), "/[a-z]+.+/m");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EORegexData("/[a-z]+.+/m");

        assertEquals(f.generateEO(1), "/[a-z]+.+/m");
    }
}
