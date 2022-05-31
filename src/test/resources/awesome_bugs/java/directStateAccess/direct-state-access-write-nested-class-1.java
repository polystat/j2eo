class A {
    class Inner {
        static class VeryInner {
            protected int state = 0;
        }
    }
}

class B extends A.Inner.VeryInner {
    public void n(int x) {
        state = x + 2;
    }
}

public class Test {
    public static void main(String[] args) {
        var b = new B();
        b.n(3);
    }
}
