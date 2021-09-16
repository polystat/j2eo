package eotree;

/**
 * EBNF representation:
 * <code>
 * /'([^']|\\\d+)'/
 * </code>
 */
public class EOCharData extends EOData {
    Character c;

    public EOCharData(Character c) {
        this.c = c;
    }

    @Override
    public String generateEO(int indent) {
        return "'" + c + "'";
    }
}
