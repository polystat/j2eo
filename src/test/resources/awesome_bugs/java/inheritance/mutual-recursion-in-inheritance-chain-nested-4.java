class VeryOuter {
    class Outer {
        class Base {
            private int x = 0;
            public int getX() { return x; }
            public void n(int v) {
                x = v;
            }
            public void m(int v) {
                n(v);
            }
        }

        class Derived extends Base {
            public void o(int v) {
                m(v);
            }
        }

        class DerivedAgain extends Derived {
            @Override
            public void n(int v) {
                o(v);
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Base d = ((new VeryOuter()).new Outer()).new DerivedAgain();
        d.m(12);
    }
}
