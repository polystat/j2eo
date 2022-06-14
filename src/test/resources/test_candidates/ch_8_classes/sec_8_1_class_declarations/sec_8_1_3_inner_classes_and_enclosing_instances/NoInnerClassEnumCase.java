
class A {
    enum B {
        C, D;
    }
}

public class NoInnerClassEnumCase {
    public static void main(String[] args) {
        A.B e = A.B.C;
        System.out.println(e == A.B.C);
        System.out.println(e == A.B.D);
        System.out.println("passed");
    }
}
