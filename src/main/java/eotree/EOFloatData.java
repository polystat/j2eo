package eotree;

/**
 * EBNF representation:
 * <code>
 * /[+-]?\d+(\.\d+)?/
 * </code>
 */
public class EOFloatData extends EOData {
    Float f;

    public EOFloatData(Float f) {
        this.f = f;
    }

    @Override
    public String generateEO(int indent) {
        return f.toString();
    }
}
