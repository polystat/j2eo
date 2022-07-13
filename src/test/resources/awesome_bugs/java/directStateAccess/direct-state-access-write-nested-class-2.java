class VeryOuter {
    class Outer {
        class A {
            protected int state = 0;
        }

        class B extends A {
            public void n(int x) {
                state = x + 2;
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        var d = ((new VeryOuter()).new Outer()).new B();
        d.n(3);
    }
}
