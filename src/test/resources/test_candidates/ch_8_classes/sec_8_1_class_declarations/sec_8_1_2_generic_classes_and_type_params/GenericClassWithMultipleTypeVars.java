
class A {
    public int add(int a, int b) {
        return a + b;
    }
}

class B {
    public void printInt(int v) {
        System.out.println(v);
    }
}

class C<T, E> {
    public T t;
    public E e;
    public C(T t, E e) {
        this.t = t;
        this.e = e;
    }
}

public class GenericClassWithMultipleTypeVars {
    public static void main(String[] args) {
        C<A, B> c = new C<A, B>(new A(), new B());
        c.e.printInt(c.t.add(1, 2));
        System.out.println("passed");
    }
}
