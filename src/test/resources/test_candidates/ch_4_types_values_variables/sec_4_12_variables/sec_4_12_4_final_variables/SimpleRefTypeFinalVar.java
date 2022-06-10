
class A {
    public int state = 0;
}

public class SimpleRefTypeFinalVar {
    public static void main(String[] args) {
        final A a = new A();
        a.state = 1;
        System.out.println(a.state);
        System.out.println("passed");
    }
}
