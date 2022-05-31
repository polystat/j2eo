class ParentFactory {
    static class GetParent {
        public int f(int x) {
            int t = x - 5;
            assert (t > 0);
            return x;
        }

        public int g(int y) {
            return f(y);
        }

        public int h(int z) {
            return z;
        }
    }
}

class Child extends ParentFactory.GetParent {
    @Override
    public int f(int y) {
        return y;
    }
    @Override
    public int h(int z) {
        return g(z);
    }
};

public class Test {
    public static void main(String[] args) {
        int x = 10;

        var p = new ParentFactory.GetParent();
        p.g(x);
        x -= 5;
        p.h(x);

        p = new Child();
        p.g(x);
        p.h(x);
    }
}
