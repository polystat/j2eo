class VeryOuter {
    class Outer {
        class A {
            protected int state = 0;
        }

        class B extends A {
        }

        class C extends B {
        }

        class D extends C {
            public int n(int x) {
                return state + x;
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        var d = ((new VeryOuter()).new Outer()).new D();
        System.out.println(d.n(3));
    }
}
