class A {
    class Inner {
        static class VeryInner {
            protected int state = 0;
        }
    }
}

class B extends A.Inner.VeryInner { }

class C extends  B { }

class D extends C {
    public int n(int x) {
        return state + x;
    }
}

public class Test {
    public static void main(String[] args) {
        var d = new D();
        System.out.println(d.n(3));
    }
}
