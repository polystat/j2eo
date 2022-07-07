
public class PetersonNumberExample {
    static long[] factorial = new long[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    public static void main(String args[]) {
        int n = 474;
        if (isPeterson(n))
            System.out.println("The given number is a Peterson number.");
        else
            System.out.println("The given number is not a Peterson number.");
        System.out.println("passed");
    }

    static boolean isPeterson(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial[digit];
            n = n / 10;
        }
        return (sum == num);
    }
}
