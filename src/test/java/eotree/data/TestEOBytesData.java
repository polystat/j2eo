package eotree.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * EO bytes data tests.
 */
public class TestEOBytesData {

    @Test
    public void testGenerateEOZeroIndent() {
        var bytes = new EOBytesData(
                new EOByte((byte) 1),
                new EOByte((byte) 255)
        );

        assertEquals(bytes.generateEO(0), "01-FF");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var bytes = new EOBytesData(
                Arrays.stream(new EOByte[] {
                        new EOByte((byte) 1),
                        new EOByte((byte) 255)
                }).collect(Collectors.toList())
        );

        assertEquals(bytes.generateEO(1), "01-FF");
    }
}
