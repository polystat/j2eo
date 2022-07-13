
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

public class SandTareArray {
    public static void main(String[] args) {
        S[] s = new T[]{new T(), new T(), new T()};
        T[] t = (T[]) s;
        System.out.println(t[0].f());
        System.out.println(t[1].f());
        System.out.println(t[2].f());
        System.out.println("passed");
    }
}
