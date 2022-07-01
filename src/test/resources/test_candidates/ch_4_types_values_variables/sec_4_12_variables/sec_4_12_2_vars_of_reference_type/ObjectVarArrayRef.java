
class A {}

class B {}

public class ObjectVarArrayRef {
    public static void main(String[] args) {
        Object[] array = { new A(), new B(), "String" };
        Object o = array;
        System.out.println(((Object[]) o)[0] instanceof A);
        System.out.println(((Object[]) o)[1] instanceof B);
        System.out.println(((Object[]) o)[2] instanceof String);
        System.out.println("passed");
    }
}
