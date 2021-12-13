package eotree;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOAnonExpr {
    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOAnonExpr(
                new EODot("memory")
        );
        assertEquals("memory", f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOAnonExpr(
                new EODot("memory")
        );
        assertEquals("  memory", f.generateEO(1));
    }
}
