
class A {
    class B {
        public void hello() {
            System.out.println("hello!");
        }
    }
}

public class InnerClassNonStatic {
    public static void main(String[] args) {
        A.B b = new A().new B();
        b.hello();
        System.out.println("passed");
    }
}
