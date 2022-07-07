
class A {
    public String f() {
        return "a.f()";
    }
}

class B extends A {
    public String f() {
        return "b.f()";
    }
}

public class RefTypeArrayInheritanceVar {
    public static void main(String[] args) {
        A[] array = {new B(), new A(), new B()};
        System.out.println(array[0].f());
        System.out.println(array[1].f());
        System.out.println(array[2].f());
        System.out.println("passed");
    }
}
