package eotree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOLicense {
    @Test
    public void TestGenerateEOZeroIndent() {
        var license = new EOLicense(
                new EOComment("test comment 1"),
                new EOComment("test comment 2")
        );
        assertEquals(license.generateEO(0),
                "# test comment 1\n" +
                "# test comment 2");


        license = new EOLicense(
                Arrays.stream(new EOComment[]{
                        new EOComment("test comment 1"),
                        new EOComment("test comment 2")
                }).collect(Collectors.toList())
        );
        assertEquals(license.generateEO(0),
                "# test comment 1\n" +
                "# test comment 2");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var license = new EOLicense(
                new EOComment("test comment 1"),
                new EOComment("test comment 2")
        );
        assertEquals(license.generateEO(1),
                "# test comment 1\n" +
                "# test comment 2");


        license = new EOLicense(
                Arrays.stream(new EOComment[]{
                        new EOComment("test comment 1"),
                        new EOComment("test comment 2")
                }).collect(Collectors.toList())
        );
        assertEquals(license.generateEO(1),
                "# test comment 1\n" +
                "# test comment 2");
    }
}
