package eotree;

/**
 * EBNF representation:
 * <code>
 * '+' name '␣' ANY EOL
 * </code>
 */
public abstract class EOMeta extends EONode {
    String name;
    String value;

    public EOMeta(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String generateEO(int indent) {
        return "+" + name + " " + value;
    }
}
