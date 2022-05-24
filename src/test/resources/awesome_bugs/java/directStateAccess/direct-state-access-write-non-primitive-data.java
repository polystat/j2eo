class Data {
    public int value = 0;
}
class A {
    protected Data state = new Data();
}

class B extends A {
    void n(int x) {
        state.value = x + 2;
    }
}

public class Test {
    public static void main(String[] args) {
        var b = new B();
        b.n(3);
    }
}
