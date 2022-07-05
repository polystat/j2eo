
public class SwapTwoNumbersExample {
    public static void main(String args[]) {
        int a, b;
        a = 18;
        b = 182;
        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping:");
        System.out.print("a = " + a + ", b = " + b);
        System.out.println();
        System.out.println("passed");
    }
}
