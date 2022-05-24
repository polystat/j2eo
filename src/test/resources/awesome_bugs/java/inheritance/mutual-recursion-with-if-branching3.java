class Base {
    private int x = 0;
    public int getX() { return x; }
    public void n(int v) {
        x = v;
    }
    public void m(int v) {
        n(v);
    }
    public void incrX() {
        x++;
    }
}

class Derived extends Base {
    @Override
    public void n(int v) {
        if (getX() < v) {
            m(v);
        }
        else {
            incrX();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Base derivedInstance = new Derived();
        derivedInstance.n(10);
    }
}
