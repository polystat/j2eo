package eotree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * EO comments tests.
 */
public class TestEOComment {

    @Test
    public void testGenerateEOZeroIndent() {
        var comment = new EOComment("test comment");
        assertEquals(comment.generateEO(0), "# test comment");
    }

    @Test
    public void testGenerateEONonZeroIndent() {
        var comment = new EOComment("test comment");
        assertEquals(comment.generateEO(2), "# test comment");
    }
}
