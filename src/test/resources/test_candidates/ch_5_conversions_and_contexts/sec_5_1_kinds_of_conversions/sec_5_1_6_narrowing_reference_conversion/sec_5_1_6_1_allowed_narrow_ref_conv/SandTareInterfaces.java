
interface S {
    public String s();
}

interface T {
    public String t();
}

class A implements T, S {
    public String s() {
        return "a.s()";
    }

    public String t() {
        return "a.t()";
    }
}

public class SandTareInterfaces {
    public static void main(String[] args) {
        S s = new A();
        T t = (T) s;
        System.out.println(s.s());
        System.out.println(t.t());
        System.out.println("passed");
    }
}
