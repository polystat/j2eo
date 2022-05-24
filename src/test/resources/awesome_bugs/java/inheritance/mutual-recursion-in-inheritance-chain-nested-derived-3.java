class Base {
    private int x = 0;
    public int getX() { return x; }
    public void n(int v) {
        x = v;
    }
}

class VeryOuter {
    class Outer {
        class Derived extends Base {
            public void m(int v) {
                n(v);
            }
        }

        class DerivedAgain extends Derived {
            @Override
            public void n(int v) {
                m(v);
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Base d = ((new VeryOuter()).new Outer()).new DerivedAgain();
        d.n(12);
    }
}
