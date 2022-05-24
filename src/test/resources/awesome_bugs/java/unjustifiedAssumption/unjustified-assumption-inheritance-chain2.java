class Parent {
    public int f(int x) {
        int t = x - 5;
        assert(t > 0);
        return x;
    }
    public int g(int y) {
        return y;
    }
    public int h(int z) {
        return z;
    }
}

class Child extends Parent {
    @Override
    public int g(int y) {
        return f(y);
    }
}

class GrandChild extends Child {
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
        int x = 15;

        Parent p = new Parent();
        p.g(x);
        x -= 5;
        p.h(x);

        p = new GrandChild();
        p.g(x);
        p.h(x);
    }
}
