package eotree.data;

import eotree.EONode;

/**
 * EBNF representation:
 * <code>
 * /[\dA-F][\dA-F]/
 * </code>
 */
public class EOByte extends EONode {
    public Byte b;

    public EOByte(Byte b) {
        this.b = b;
    }

    @Override
    public String generateEO(int indent) {
        return String.format("%02x", b).toUpperCase();
    }
}
