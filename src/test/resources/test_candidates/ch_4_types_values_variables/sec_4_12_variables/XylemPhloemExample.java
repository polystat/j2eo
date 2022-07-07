
public class XylemPhloemExample {
    public static void main(String args[]) {
        int num, extreme_sum = 0, mean_sum = 0, n;
        num = 376;
        num = Math.abs(num);
        n = num;
        while (n != 0) {
            if (n == num || n < 10)
                extreme_sum = extreme_sum + n % 10;
            else
                mean_sum = mean_sum + n % 10;
            n = n / 10;
        }
        System.out.println("The sum of extreme digits: " + extreme_sum);
        System.out.println("The sum of mean digits: " + mean_sum);
        if (extreme_sum == mean_sum)
            System.out.println(num + " is a xylem number.");
        else
            System.out.println(num + " is a phloem number.");
        System.out.println("passed");
    }
}
