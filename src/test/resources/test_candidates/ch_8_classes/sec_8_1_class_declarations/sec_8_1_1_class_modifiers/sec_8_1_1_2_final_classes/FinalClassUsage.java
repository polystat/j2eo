
class A {
    public void m() {
        System.out.println("a.m()");
    }
}

final class B extends A {
    public void m() {
        System.out.println("b.m()");
    }
}

public class FinalClassUsage {
    public static void main(String[] args) {
        A a = new B();
        a.m();
        System.out.println("passed");
    }
}
