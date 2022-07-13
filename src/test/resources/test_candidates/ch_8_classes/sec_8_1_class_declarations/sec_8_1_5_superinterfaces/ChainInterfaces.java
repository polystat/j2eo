
interface A {
    public void a();
}

interface B extends A {
    public void b();
}

class C implements B {
    public void a() {
        System.out.println("c.a()");
    }
    public void b() {
        System.out.println("c.b()");
    }
}

public class ChainInterfaces {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
        System.out.println("passed");
    }
}
