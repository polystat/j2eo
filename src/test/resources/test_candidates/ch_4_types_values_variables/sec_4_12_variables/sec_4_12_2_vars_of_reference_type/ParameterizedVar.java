
class A<E> {
    public E identity(E input) {
        return input;
    }
}

public class ParameterizedVar {
    public static void main(String[] args) {
        A<String> a = new A<String>();
        System.out.println(a.identity("E is String"));
        System.out.println("passed");
    }
}
