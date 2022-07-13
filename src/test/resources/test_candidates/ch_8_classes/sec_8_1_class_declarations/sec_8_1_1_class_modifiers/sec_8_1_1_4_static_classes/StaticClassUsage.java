
class A {
    static class B {
        public void m() {
            System.out.println("a.b.m()");
        }
    }
}

public class StaticClassUsage {
    public static void main(String[] args) {
        A.B b = new A.B();
        b.m();
        System.out.println("passed");
    }
}
