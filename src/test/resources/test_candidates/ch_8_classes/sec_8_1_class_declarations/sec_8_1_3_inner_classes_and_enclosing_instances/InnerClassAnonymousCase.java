
interface Printable {
    public void print(Object o);
}

class B {
    public void m() {
        Printable p = new Printable() {
            public void print(Object o) {
                System.out.println(o);
            }
        };
        p.print("Hello, world!");
    }
}

public class InnerClassAnonymousCase {
    public static void main(String[] args) {
        new B().m();
        System.out.println("passed");
    }
}
