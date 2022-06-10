
class A<E> {
    public E identity(E input) {
        return input;
    }
}

public class ParameterizedVarOmitted {
    public static void main(String[] args) {
        A<String> a = new A();
        System.out.println(a.identity("E is omitted, E is string"));
        System.out.println("passed");
    }
}
