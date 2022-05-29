class A {
    protected int state = 0;
}

class B extends A { }

class C extends B {
    public int n(int x) {
        return state + x;
    }
}

public class Test {
    public static void main(String[] args) {
        var c = new C();
        System.out.println(c.n(3));
    }
}
