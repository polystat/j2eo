
public class SmithNumberExample {
    static int findSumPrimeFactors(int n) {
        int i = 2, sum = 0;
        while (n > 1) {
            if (n % i == 0) {
                sum = sum + findSumOfDigit(i);
                n = n / i;
            } else {
                do {
                    i++;
                }
                while (!isPrime(i));
            }
        }
        return sum;
    }

    static int findSumOfDigit(int n) {
        int s = 0;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        return s;
    }

    static boolean isPrime(int k) {
        boolean b = true;
        int d = 2;
        while (d < Math.sqrt(k)) {
            if (k % d == 0) {
                b = false;
            }
            d++;
        }
        return b;
    }

    public static void main(String args[]) {
        int n = 373;
        int a = findSumOfDigit(n);
        int b = findSumPrimeFactors(n);
        System.out.println("Sum of Digits of the given number is = " + a);
        System.out.println("Sum of digits of its prime factors is = " + b);
        if (a == b)
            System.out.print("The given number is a smith number.");
        else
            System.out.print("The given number is not a smith number.");
        System.out.println();
        System.out.println("passed");
    }
}
