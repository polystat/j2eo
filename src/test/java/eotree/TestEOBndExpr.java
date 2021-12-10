package eotree;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEOBndExpr {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOBndExpr(
                new EODot("memory"),
                "bnd1"
        );
        assertEquals("memory > bnd1", f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOBndExpr(
                new EODot("memory"),
                "bnd1"
        );
        assertEquals("  memory > bnd1", f.generateEO(1));
    }
}
