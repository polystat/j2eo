package eotree;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.ListUtils.listOf;

public class TestEOCopy {

    @Test
    public void TestGenerateEOZeroIndent() {
        var f = new EOCopy(
                new EODot("name"),
                listOf(
                        new EODot("arg1"),
                        new EODot("arg2")
                        )
        );
        assertEquals("name\n  arg1\n  arg2", f.generateEO(0));
    }

    @Test
    public void TestGenerateEONonZeroIndent() {
        var f = new EOCopy(
                new EODot("name"),
                listOf(
                        new EODot("arg1"),
                        new EODot("arg2")
                )
        );
        assertEquals("  name\n    arg1\n    arg2", f.generateEO(1));
    }
}
