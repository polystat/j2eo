
class A {
    public void m() {
        System.out.println("a.m()");
    }
}

class B extends A {
    public void m() {
        System.out.println("b.m()");
    }
}

class C<T extends A> {
    public C(T t) {
        t.m();
    }
}

public class SimpleBoundGenericClass {
    public static void main(String[] args) {
        C<B> c1 = new C<B>(new B());
        C<A> c2 = new C<A>(new A());
        System.out.println("passed");
    }
}
