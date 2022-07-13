
class A {
    public void m() {
        enum B {
            C, D;
        };

        B e = B.C;
        System.out.println(e == B.C);
        System.out.println(e == B.D);
    }
}

public class NoInnerClassLocalEnumCase {
    public static void main(String[] args) {
        new A().m();
        System.out.println("passed");
    }
}
