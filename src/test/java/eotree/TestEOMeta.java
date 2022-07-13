package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.polystat.j2eo.eotree.EOMeta;

/**
 * EO meta tests.
 */
public class TestEOMeta {

    @Test
    public void testGenerateEOZeroIndent() {
        var f = new EOMeta("key", "value");
        assertEquals("+key value", f.generateEO(0));
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var f = new EOMeta("key", "value");
        assertEquals("+key value", f.generateEO(1));
    }
}
