
public class MultipleConstructorDecl {
    public MultipleConstructorDecl() {
        super();
        System.out.println("Constructor 1");
    }

    public MultipleConstructorDecl(int a) {
        super();
        System.out.println(a);
        System.out.println("Constructor 2");
    }

    public MultipleConstructorDecl(int a, int b) {
        super();
        System.out.println(a);
        System.out.println(b);
        System.out.println("Constructor 3");
    }

    public static void main(String[] args) {
        new MultipleConstructorDecl();
        new MultipleConstructorDecl(1);
        new MultipleConstructorDecl(1, 2);
        System.out.println("passed");
    }
}
