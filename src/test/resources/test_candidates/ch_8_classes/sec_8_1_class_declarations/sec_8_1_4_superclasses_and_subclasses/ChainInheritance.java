
class A {
    public void m() {
        System.out.println("a.m()");
    }
}

class B extends A {}

class C extends B {
    public void m() {
        System.out.println("c.m()");
    }
}

public class ChainInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.m();
        b.m();
        c.m();
        System.out.println("passed");
    }
}
