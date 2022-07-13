package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.polystat.j2eo.eotree.data.EOByte;

/**
 * EO byte tests.
 */
public class TestEOByte {

    @Test
    public void testGenerateEOZeroIndent() {
        // Single-digit byte
        var b = new EOByte((byte) 1);
        assertEquals(b.generateEO(0), "01");

        // Double-digit byte
        b = new EOByte((byte) 255);
        assertEquals(b.generateEO(0), "FF");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var b = new EOByte((byte) 1);
        assertEquals(b.generateEO(1), "01");

        // Double-digit byte
        b = new EOByte((byte) 255);
        assertEquals(b.generateEO(1), "FF");
    }
}
