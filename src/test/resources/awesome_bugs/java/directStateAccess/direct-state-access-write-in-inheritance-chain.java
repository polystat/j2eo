class A {
    protected int state = 0;
}

class B extends A { }

class C extends B {
    public void n(int x) {
        state = x + 2;
    }
}

public class Test {
    public static void main(String[] args) {
        var c = new C();
        c.n(3);
    }
}
