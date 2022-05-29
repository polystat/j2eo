class Base {
    private int x = 0;
    public int getX() { return x; }
    public void n() {
        x = 0;
    }
    public void m() {
        n();
    }
    public void incrX() {
        x++;
    }
}

class Derived extends Base {
    @Override
    public void n() {
        if (true) {
            m();
        }
        else {
            incrX();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Base derivedInstance = new Derived();
        derivedInstance.n();
    }
}
