
interface A {
    public String f();
}

interface B extends A {}

class C implements B {
    public String f() {
        return "c.f()";
    }
}

public class RefTypeArrayInterfaceInhVar {
    public static void main(String[] args) {
        A[] array = { new C(), new C(), new C() };
        System.out.println(array[0].f());
        System.out.println(array[1].f());
        System.out.println(array[2].f());
        System.out.println("passed");
    }
}
