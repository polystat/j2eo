
class A {
    public String f() {
        return "a.f()";
    }
}

public class ClassTypeVar {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.f());
        System.out.println("passed");
    }
}
