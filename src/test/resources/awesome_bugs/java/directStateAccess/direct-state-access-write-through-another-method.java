class Data {
    public int value = 0;
}
class A {
    protected Data state = new Data();
}

class B extends A {
    public void m(Data x, int y) {
        x.value = y;
    }
    public void n(int y) {
        m(state, y);
    }
}

public class Test {
    public static void main(String[] args) {
        var b = new B();
        b.n(3);
    }
}
