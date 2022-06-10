
class A {}

class B {}

public class ObjectArrayVar {
    public static void main(String[] args) {
        Object[] array = { new A(), new B(), "String" };
        System.out.println(array[0] instanceof A);
        System.out.println(array[1] instanceof B);
        System.out.println(array[2] instanceof String);
        System.out.println("passed");
    }
}
