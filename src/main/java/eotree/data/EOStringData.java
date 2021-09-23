package eotree.data;

/**
 * EBNF representation:
 * <code>
 * /"[^"]*"/
 * </code>
 */
public class EOStringData extends EOData {
    public String str;

    public EOStringData(String str) {
        this.str = str;
    }

    @Override
    public String generateEO(int indent) {
        return "\"" + str + "\"";
    }
}
