
public class SpyNumberExample {
    public static void main(String args[]) {
        int num, product = 1, sum = 0, lastdigit;
        num = 428;
        while (num > 0) {
            lastdigit = num % 10;
            sum = sum + lastdigit;
            product = product * lastdigit;
            num = num / 10;
        }
        if (sum == product)
            System.out.println("The given number is a spy number.");
        else
            System.out.println("The given number is not a spy number.");
        System.out.println("passed");
    }
}
