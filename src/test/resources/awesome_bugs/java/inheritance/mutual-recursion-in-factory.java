class BaseFactory {
    static class GetBase {
        private int x = 0;
        public int getX() {
            return x;
        }
        public void n(int v) {
            x = v;
        }
        public void m(int v) {
            n(v);
        }
    }
}

class Derived extends BaseFactory.GetBase {
    @Override
    public void n(int v) {
        m(v);
    }
}

public class Test {
    public static void main(String[] args) {
        Derived derivedInstance = new Derived();
        derivedInstance.m(10);
    }
}
