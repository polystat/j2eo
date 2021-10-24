package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOIntData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOIntData(42);

        assertEquals(f.generateEO(0), "42");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOIntData(42);

        assertEquals(f.generateEO(1), "  42");
    }
}
