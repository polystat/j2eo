
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

public class SisSuperTypeOfT {
    public static void main(String[] args) {
        S s = new T();
        T t = (T) s;
        System.out.println(t.f());
        System.out.println("passed");
    }
}
