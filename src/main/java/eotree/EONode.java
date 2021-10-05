package eotree;

public abstract class EONode {
    public static final int INDENT_SIZE = 2;

    public static String indent(int indent) {
        return " ".repeat(indent * INDENT_SIZE);
    }

    public abstract String generateEO(int indent);
}
