package eotree.data;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestEOByte {

    @Test
    public void TestGenerateEOZeroIndent() {
        // Single-digit byte
        var b = new EOByte((byte) 1);
        assertEquals(b.generateEO(0), "01");

        // Double-digit byte
        b = new EOByte((byte) 255);
        assertEquals(b.generateEO(0), "FF");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var b = new EOByte((byte) 1);
        assertEquals(b.generateEO(1), "01");

        // Double-digit byte
        b = new EOByte((byte) 255);
        assertEquals(b.generateEO(1), "FF");
    }
}
