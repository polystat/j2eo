
interface A {
    public String f();
}

class B implements A {
    public String f() {
        return "b.f()";
    }
}

class C extends B {
    public String f() {
        return "c.f()";
    }
}

public class RefTypeArrayInhAndImpVar {
    public static void main(String[] args) {
        A[] array = { new B(), new C(), new B() };
        System.out.println(array[0].f());
        System.out.println(array[1].f());
        System.out.println(array[2].f());
        System.out.println("passed");
    }
}
