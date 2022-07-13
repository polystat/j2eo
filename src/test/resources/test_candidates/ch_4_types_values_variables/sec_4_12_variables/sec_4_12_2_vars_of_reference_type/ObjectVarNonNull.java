
class A {
    public String f() {
        return "a.f()";
    }
}

public class ObjectVarNonNull {
    public static void main(String[] args) {
        Object o = new A();
        System.out.println(((A) o).f());
        System.out.println("passed");
    }
}
