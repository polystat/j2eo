package eotree;

/**
 * EBNF representation:
 * <code>
 * '#' ANY EOL
 * </code>
 */
public class EOComment extends EONode {
    String comment;

    public EOComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String generateEO(int indent) {
        return "# " + comment;
    }
}
