
interface A {
    public int add(int a, int b);
}

interface B {
    public void printInt(int v);
}

class C implements A, B {
    public int add(int a, int b) {
        return a + b;
    }
    public void printInt(int v) {
        System.out.println(v);
    }
}

class D<T extends A & B> {
    public D(T t, int a, int b) {
        t.printInt(t.add(a, b));
    }
}

public class GenericClassBoundByIntersection {
    public static void main(String[] args) {
        D<C> d = new D<>(new C(), 1, 2);
        System.out.println("passed");
    }
}
