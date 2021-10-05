package eotree;

import eotree.data.EOIntData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOBndName {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOBndName("name");
        assertEquals(f.generateEO(0), "name");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOBndName("name");
        assertEquals(f.generateEO(1), "name");
    }
}
