
public class EmirpNumberExample {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static boolean isEmirp(int n) {
        if (isPrime(n) == false)
            return false;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return isPrime(reverse);
    }

    public static void main(String args[]) {
        int n = 338;
        if (isEmirp(n) == true)
            System.out.println("Yes, the given number is an emirp number.");
        else
            System.out.println("No, the given number is not an emirp number.");
        System.out.println("passed");
    }
}
