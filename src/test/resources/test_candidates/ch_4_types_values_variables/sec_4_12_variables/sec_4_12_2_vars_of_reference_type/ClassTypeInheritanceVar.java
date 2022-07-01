
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

public class ClassTypeInheritanceVar {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f());
        System.out.println("passed");
    }
}
