package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.polystat.j2eo.eotree.data.EOFloatData;

/**
 * EO float data tests.
 */
public class TestEOFloatData {

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EOFloatData(3.14f);

        assertEquals(f.generateEO(0), "3.14");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOFloatData(3.14f);

        assertEquals(f.generateEO(1), "  3.14");
    }
}
