package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOCharData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var c = new EOCharData('a');

        assertEquals(c.generateEO(0), "'a'");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var c = new EOCharData('a');

        assertEquals(c.generateEO(1), "'a'");
    }
}
