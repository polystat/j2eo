
public class CheckPerfectSquareExample {
    static boolean checkPerfectSquare(double number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {
        double number = 9.0;
        if (checkPerfectSquare(number))
            System.out.print("Yes, the given number is perfect square.");
        else
            System.out.print("No, the given number is not perfect square.");
        System.out.println();
        System.out.println("passed");
    }
}
