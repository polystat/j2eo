package eotree.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOBytesData {

    @Test
    public void TestGenerateEOZeroIndent() {
        var bytes = new EOBytesData(
                new EOByte((byte) 1),
                new EOByte((byte) 255)
        );

        assertEquals(bytes.generateEO(0), "01-FF");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var bytes = new EOBytesData(
                new EOByte((byte) 1),
                new EOByte((byte) 255)
        );

        assertEquals(bytes.generateEO(1), "01-FF");
    }
}
