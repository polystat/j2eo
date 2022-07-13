interface A {
    public default void a() {
        System.out.println("a.a()");
    }
}

class B implements A {}

public class InterfaceDefaultExample {
    public static void main(String[] args) {
        new B().a();
        System.out.println("passed");
    }
}
