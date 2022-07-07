
interface A {
    public static String field = "Hi!";
}

public class SimpleInterfaceMember {
    public static void main(String[] args) {
        System.out.println(A.field);
        System.out.println("passed");
    }
}
