package eotree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOMeta {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOMeta("key", "value");
        assertEquals("+key value", f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOMeta("key", "value");
        assertEquals("+key value", f.generateEO(1));
    }
}
