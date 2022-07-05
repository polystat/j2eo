
public class SimpleExplicitConstructorInv {
    public SimpleExplicitConstructorInv() {
        super();
        System.out.println("simple constructor");
    }

    public SimpleExplicitConstructorInv(int a) {
        this();
        System.out.println(a);
        System.out.println("complex costructor");
    }

    public static void main(String[] args) {
        new SimpleExplicitConstructorInv(1);
        System.out.println("passed");
    }
}
