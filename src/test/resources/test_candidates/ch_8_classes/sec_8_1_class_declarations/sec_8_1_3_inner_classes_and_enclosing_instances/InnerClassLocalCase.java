
class A {
    public void local() {
        class Local {
            public void hello() {
                System.out.println("Local class hello!");
            }
        }
        new Local().hello();
    }
}

public class InnerClassLocalCase {
    public static void main(String[] args) {
        new A().local();
        System.out.println("passed");
    }
}
