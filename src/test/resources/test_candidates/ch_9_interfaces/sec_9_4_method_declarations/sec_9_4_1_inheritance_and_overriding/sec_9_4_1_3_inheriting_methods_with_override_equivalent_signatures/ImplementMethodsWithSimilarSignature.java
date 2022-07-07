
interface A {
    public <T> T m(T t);
}

class B implements A {
    public int m(int a) {
        return 10;
    }
    public <T> T m(T t) {
        return t;
    }
}

public class ImplementMethodsWithSimilarSignature {
    public static void main(String[] args) {
        System.out.println(new B().m("hello!"));
        System.out.println(new B().m(0));
        System.out.println("passed");
    }
}

