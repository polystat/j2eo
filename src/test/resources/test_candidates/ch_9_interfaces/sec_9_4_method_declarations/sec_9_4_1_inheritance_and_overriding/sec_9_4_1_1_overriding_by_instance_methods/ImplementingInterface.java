
interface A {
    public int m();
}

class B implements A {
    public int m() {
        return 10;
    }
}

public class ImplementingInterface {
    public static void main(String[] args) {
        System.out.println(new B().m());
        System.out.println("passed");
    }
}
