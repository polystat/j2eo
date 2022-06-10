
interface A {
    public int state = 0;
}

class B implements A { }

public class FinalVarInterface {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.state);
        System.out.println("passed");
    }
}
