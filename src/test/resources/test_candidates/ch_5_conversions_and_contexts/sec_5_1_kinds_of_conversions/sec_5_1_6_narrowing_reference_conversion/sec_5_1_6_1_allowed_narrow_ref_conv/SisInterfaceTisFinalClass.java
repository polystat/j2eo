
interface S {
    public String s();
}

final class T implements S {
    public String s() {
        return "t.s()";
    }
}

public class SisInterfaceTisFinalClass {
    public static void main(String[] args) {
        S s = new T();
        T t = (T) s;
        System.out.println(t.s());
        System.out.println("passed");
    }
}
