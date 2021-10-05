package eotree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOComment {

    @Test
    public void TestGenerateEOZeroIndent() {
        var comment = new EOComment("test comment");
        assertEquals(comment.generateEO(0), "# test comment");
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var comment = new EOComment("test comment");
        assertEquals(comment.generateEO(2), "# test comment");
    }
}
