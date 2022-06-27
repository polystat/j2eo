
public class InterfaceInBlock {
    public static void main(String[] args) {
        {
            interface A {
                public static int a = 1;
            }
            System.out.println(A.a);
            System.out.println("passed");
        }
    }
}
