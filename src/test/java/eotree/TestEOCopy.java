package eotree;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

public class TestEOCopy {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOCopy(
                new EODot(Optional.empty(), "name"),
                listOf(
                        new EOAnonExpr(
                                new EODot(Optional.empty(), "arg1")
                        ),
                        new EOAnonExpr(
                                new EODot(Optional.empty(), "arg2")
                        )
                )
        );
        System.out.println(f.generateEO(0));
        assertEquals("name.\n  arg1\n  arg2", f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOBndName("name");
        assertEquals(f.generateEO(1), "name");
    }
}
