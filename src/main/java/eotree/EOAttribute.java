package eotree;

/**
 * EBNF representation:
 * <code>
 * '@' | name [ '...' ]
 * </code>
 */
public class EOAttribute extends EONode {
    public static final EOAttribute DECORATEE = new EOAttribute("@", false);
    public static final EOAttribute PARENT    = new EOAttribute("^", false);
    public static final EOAttribute CURRENT   = new EOAttribute("$", false);

    String  name;
    boolean isVarArg;

    public EOAttribute(String name, boolean isVarArg) {
        this.name = name;
        this.isVarArg = isVarArg;
    }

    @Override
    public String generateEO(int indent) {
        return name + (isVarArg ? " ..." : "");
    }
}
