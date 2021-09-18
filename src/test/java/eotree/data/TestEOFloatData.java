package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOFloatData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOFloatData(3.14f);

        assertEquals(f.generateEO(0), "3.14");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOFloatData(3.14f);

        assertEquals(f.generateEO(1), "3.14");
    }
}
