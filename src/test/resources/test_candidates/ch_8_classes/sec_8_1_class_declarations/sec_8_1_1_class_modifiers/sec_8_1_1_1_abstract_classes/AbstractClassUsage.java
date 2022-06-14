
abstract class A {
    public void m();
}

class B extends A {
    public void m() {
        System.out.println("b.m()");
    }
}

public class AbstractClassUsage {
    public static void main(String[] args) {
        A a = new B();
        a.m();
        System.out.println("passed");
    }
}
