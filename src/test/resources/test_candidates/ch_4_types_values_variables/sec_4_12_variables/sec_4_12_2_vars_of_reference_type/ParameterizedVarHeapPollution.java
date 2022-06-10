
class A<E> {
    public E identity(E input) {
        return input;
    }
}

public class ParameterizedVarHeapPollution {
    public static void main(String[] args) {
        A a = new A<String>();
        System.out.println(a.identity("It is danger"));
        System.out.println("passed");
    }
}
