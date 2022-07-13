class AFactory {
    static class GetA {
        protected int state = 0;
    }
}

class B extends AFactory.GetA {
    public int n(int x) {
        return state + x;
    }
}

public class Test {
    public static void main(String[] args) {
        var b = new B();
        System.out.println(b.n(3));
    }
}
