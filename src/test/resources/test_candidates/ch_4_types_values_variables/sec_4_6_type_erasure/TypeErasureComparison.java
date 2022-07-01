
class A<T> {}

public class TypeErasureComparison {
    public static void main(String[] args) {
        A<String> a = new A();
        A<Integer> b = new A();
        A<System> c = new A();

        System.out.println(a.getClass() == b.getClass());
        System.out.println(b.getClass() == c.getClass());
        System.out.println("passed");
    }
}
