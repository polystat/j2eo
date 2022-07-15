package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.polystat.j2eo.eotree.EOComment;
import org.polystat.j2eo.eotree.EOLicense;

/**
 * EO license tests.
 */
public class TestEOLicense {
    @Test
    public void testGenerateEOZeroIndent() {
        var license = new EOLicense(
                new EOComment("test comment 1"),
                new EOComment("test comment 2")
        );
        assertEquals(license.generateEO(0),
                "# test comment 1\n"
                        + "# test comment 2");


        license = new EOLicense(
                Arrays.stream(new EOComment[]{
                        new EOComment("test comment 3"),
                        new EOComment("test comment 4")
                }).collect(Collectors.toList())
        );
        assertEquals(license.generateEO(0),
                "# test comment 3\n"
                        + "# test comment 4");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var license = new EOLicense(
                new EOComment("test comment 5"),
                new EOComment("test comment 6")
        );
        assertEquals(license.generateEO(1),
                "# test comment 5\n"
                        + "# test comment 6");


        license = new EOLicense(
                Arrays.stream(new EOComment[]{
                        new EOComment("test comment 7"),
                        new EOComment("test comment 8")
                }).collect(Collectors.toList())
        );
        assertEquals(license.generateEO(1),
                "# test comment 7\n"
                        + "# test comment 8");
    }
}
