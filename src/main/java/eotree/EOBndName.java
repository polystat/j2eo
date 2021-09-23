package eotree;

public class EOBndName extends EONode {
    public String name;

    public EOBndName(String name) {
        this.name = name;
    }

    @Override
    public String generateEO(int indent) {
        return name;
    }
}
