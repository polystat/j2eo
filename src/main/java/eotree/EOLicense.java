package eotree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * EBNF representation:
 * <code>
 * { comment EOL } EOL
 * </code>
 */
public class EOLicense extends EONode {
    public List<EOComment> comments;

    public EOLicense(List<EOComment> comments) {
        this.comments = comments;
    }

    public EOLicense(EOComment... comments) {
        this(Arrays.stream(comments).collect(Collectors.toList()));
    }

    @Override
    public String generateEO(int indent) {
        return comments.stream()
                .map(comment -> comment.generateEO(indent))
                .collect(Collectors.joining("\n"));
    }
}