
public class SimpleImplicitLeftHandOperand {
    public static void main(String[] args) {
        int a = 9;
        a += (a = 3);
        System.out.println(a);
        int b = 9;
        b = b + (b = 3);
        System.out.println(b);
        System.out.println("passed");
    }
}
