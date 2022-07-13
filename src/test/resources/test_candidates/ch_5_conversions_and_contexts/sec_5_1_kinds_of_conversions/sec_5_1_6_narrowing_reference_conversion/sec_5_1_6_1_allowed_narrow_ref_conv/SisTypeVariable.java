
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

public class SisTypeVariable {
    public static <O extends S> void foo(O o) {
        T t = (T) o;
        System.out.println(t.f());
    }

    public static void main(String[] args) {
        foo(new T());
        System.out.println("passed");
    }
}
