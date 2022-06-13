
class S {
    public String f() {
        return "s.f()";
    }
}

class T extends S {
    public String f() {
        return "t.f()";
    }
}

public class TisTypeVariable {
    public static <O extends T> void foo() {
        S s = new T();
        O o = (O) s;
        System.out.println(o.f());
    }

    public static void main(String[] args) {
        foo();
        System.out.println("passed");
    }
}
