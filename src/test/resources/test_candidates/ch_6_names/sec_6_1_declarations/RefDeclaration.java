
class A {
    public int i = 0;
}

public class RefDeclaration {
    A a = new A();
    public static void main(String[] args) {
        System.out.println(new RefDeclaration().a.i);
        System.out.println("passed");
    }
}
