
public class NeonNumberExample {
    public static void main(String args[]) {
        int sum = 0, n;
        n = 423;
        int square = n * n;
        while (square != 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }
        if (n == sum)
            System.out.println(n + " is a Neon Number.");
        else
            System.out.println(n + " is not a Neon Number.");
        System.out.println("passed");
    }
}
