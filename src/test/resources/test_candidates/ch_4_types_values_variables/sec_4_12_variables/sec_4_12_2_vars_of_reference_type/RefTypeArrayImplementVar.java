
interface A {
    public String f();
}

class B implements A {
    public String f() {
        return "b.f()";
    }
}

public class RefTypeArrayImplementVar {
    public static void main(String[] args) {
        A[] array = {new B(), new B(), new B()};
        System.out.println(array[0].f());
        System.out.println(array[1].f());
        System.out.println(array[2].f());
        System.out.println("passed");
    }
}
