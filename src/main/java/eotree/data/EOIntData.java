package eotree.data;

/**
 * EBNF representation:
 * <code>
 * /[+-]?\d+|0x[a-f\d]+/
 * </code>
 */
public class EOIntData extends EOData {
    public Integer i;

    public EOIntData(Integer i) {
        this.i = i;
    }

    @Override
    public String generateEO(int indent) {
        return indent(indent) + i.toString();
    }
}
