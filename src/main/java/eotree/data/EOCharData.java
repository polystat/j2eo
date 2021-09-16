package eotree.data;

import eotree.data.EOData;

/**
 * EBNF representation:
 * <code>
 * /'([^']|\\\d+)'/
 * </code>
 */
public class EOCharData extends EOData {
    public Character c;

    public EOCharData(Character c) {
        this.c = c;
    }

    @Override
    public String generateEO(int indent) {
        return "'" + c + "'";
    }
}
