package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOStringData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EORegexData("hello world");

        assertEquals(f.generateEO(0), "\"hello world\"");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EORegexData("hello world");

        assertEquals(f.generateEO(1), "\"hello world\"");
    }
}
