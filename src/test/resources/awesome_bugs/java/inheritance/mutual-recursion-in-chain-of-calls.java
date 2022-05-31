class Base {
    private int x = 0;
    public int getX() { return x; }
    public void n(int v) {
        x = v;
    }
    public void o(int v) {
        n(v);
    }
    public void m(int v) { o(v); }
}

class Derived extends Base {
    @Override
    public void n(int v) {
        m(v);
    }
    public void l(int v) {
        n(v);
    }
}

public class Test {
    public static void main(String[] args) {
        Derived derivedInstance = new Derived();
        derivedInstance.l(10);
    }
}
