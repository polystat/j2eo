package eotree.data;

/**
 * EBNF representation:
 * <code>
 * / /.+/[a-z]* /
 * </code>
 */
public class EORegexData extends EOData {
    public String regex;

    public EORegexData(String regex) {
        this.regex = regex;
    }

    @Override
    public String generateEO(int indent) {
        return regex;
    }
}
