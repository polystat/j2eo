
class A {
    public String toString() {
        return "It is A's instance!";
    }
}

public class SuperClassIsObject {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        System.out.println("passed");
    }
}
