package eotree;

/**
 * EBNF representation:
 * <code>
 * /"[^"]*"/
 * </code>
 */
public class EOStringData extends EOData {
    String str;

    public EOStringData(String str) {
        this.str = str;
    }

    @Override
    public String generateEO(int indent) {
        return "\"" + str + "\"";
    }
}
