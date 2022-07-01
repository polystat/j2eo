
interface A {
    public String f();
}

class B implements A {
    public String f() {
        return "b.f()";
    }
}

public class InterfaceTypeImplementVar {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f());
        System.out.println("passed");
    }
}
