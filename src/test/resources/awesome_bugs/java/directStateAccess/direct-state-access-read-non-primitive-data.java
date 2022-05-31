class Data {
    public int value = 0;
}
class A {
    protected Data state = new Data();
}

class B extends A {
    public int n(int x) {
        return state.value + x;
    }
}

public class Test {
    public static void main(String[] args) {
        var b = new B();
        System.out.println(b.n(3));
    }
}
