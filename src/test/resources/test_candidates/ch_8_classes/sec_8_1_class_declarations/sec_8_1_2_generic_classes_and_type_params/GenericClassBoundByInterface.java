
interface A {
    public void println(Object o);
}

class B implements A {
    public void println(Object o) {
        System.out.println(o);
    }
}

class C<T extends A> {
    public C(T t, Object o) {
        t.println(o);
    }
}

public class GenericClassBoundByInterface {
    public static void main(String[] args) {
        C<B> c = new C<B>(new B(), "printed");
        System.out.println("passed");
    }
}
