package eotree.data;

/**
 * EBNF representation:
 * <code>
 * /[+-]?\d+(\.\d+)?/
 * </code>
 */
public class EOFloatData extends EOData {
    public Float f;

    public EOFloatData(Float f) {
        this.f = f;
    }

    @Override
    public String generateEO(int indent) {
        return indent(indent) + f.toString();
    }
}
