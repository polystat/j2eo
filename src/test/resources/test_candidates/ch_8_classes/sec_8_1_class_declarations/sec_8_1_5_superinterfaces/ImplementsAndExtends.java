
interface A {
    public void a();
}

class B implements A {
    public void a() {
        System.out.println("b.a()");
    }
}

class C extends B {
    public void a() {
        System.out.println("c.a()");
    }
}

public class ImplementsAndExtends {
    public static void main(String[] args) {
        A a = new C();
        a.a();
        System.out.println("passed");
    }
}
