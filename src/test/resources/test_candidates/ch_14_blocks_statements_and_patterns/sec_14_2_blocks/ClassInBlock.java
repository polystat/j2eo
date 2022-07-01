
public class ClassInBlock {
    public static void main(String[] args) {
        {
            class A {
                public void a() {
                    System.out.println("a.a()");
                }
            }
            new A().a();
            System.out.println("passed");
        }
    }
}
