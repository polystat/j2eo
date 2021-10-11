package eotree;

/**
 * EBNF representation:
 * <code>
 * '+' name ' ' ANY EOL
 * </code>
 */
public class EOMeta extends EONode {
    public String name;
    public String value;

    public EOMeta(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String generateEO(int indent) {
        return "+" + name + " " + value;
    }
}
