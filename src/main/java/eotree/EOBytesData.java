package eotree;

import java.util.List;
import java.util.stream.Collectors;

/**
 * EBNF representation:
 * <code>
 * byte { '-' byte }
 * </code>
 *
 */
public class EOBytesData extends EOData {
    public EOBytesData(List<EOByte> bytes) {
        this.bytes = bytes;
    }

    List<EOByte> bytes;

    @Override
    public String generateEO(int indent) {
        return bytes.stream()
                .map(b -> b.generateEO(indent))
                .collect(Collectors.joining("-"));
    }
}
