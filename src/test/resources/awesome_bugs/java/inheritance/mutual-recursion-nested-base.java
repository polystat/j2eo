class VeryOuter {
    class Outer {
        static class Base {
            private int x = 0;
            public int getX() { return x; }
            public void n(int v) {
                x = v;
            }
            public void m(int v) {
                n(v);
            }
        }
    }
}

class Derived extends VeryOuter.Outer.Base {
    @Override
    public void n(int v) {
        m(v);
    }
}

public class Test {
    public static void main(String[] args) {
        Base d = new Derived();
        d.n(3);
    }
}
