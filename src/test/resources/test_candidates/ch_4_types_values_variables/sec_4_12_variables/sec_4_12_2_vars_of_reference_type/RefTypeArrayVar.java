
class A {
    public String f() {
        return "a.f()";
    }
}

public class RefTypeArrayVar {
    public static void main(String[] args) {
        A[] array = { new A(), new A(), new A() };
        System.out.println(array[0].f());
        System.out.println(array[1].f());
        System.out.println(array[2].f());
        System.out.println("passed");
    }
}
