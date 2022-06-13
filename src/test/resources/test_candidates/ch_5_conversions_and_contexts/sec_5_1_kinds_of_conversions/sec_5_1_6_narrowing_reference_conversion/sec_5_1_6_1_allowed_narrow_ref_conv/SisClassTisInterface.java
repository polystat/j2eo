
interface T {
    public String t();
}

class S implements T {
    public String t() {
        return "s.t()";
    }
}

public class SisClassTisInterface {
    public static void main(String[] args) {
        S s = new S();
        T t = (T) s;
        System.out.println(t.t());
        System.out.println("passed");
    }
}
