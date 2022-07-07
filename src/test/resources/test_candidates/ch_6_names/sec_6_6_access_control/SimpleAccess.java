
class A {
    public int a = 1;
}

public class SimpleAccess {
    public static void main(String[] args) {
        System.out.println(new A().a); // can get access to public var
        System.out.println("passed");
    }
}
