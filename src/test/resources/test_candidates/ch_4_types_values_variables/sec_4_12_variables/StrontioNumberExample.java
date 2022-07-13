
public class StrontioNumberExample {
    public static void main(String args[]) {
        int num = 18;
        int n = num;
        num = (num * 2 % 1000) / 10;
        if (num % 10 == num / 10)
            System.out.println(n + " is a strontio number.");
        else
            System.out.println(n + " is not a strontio number.");
        System.out.println("passed");
    }
}
