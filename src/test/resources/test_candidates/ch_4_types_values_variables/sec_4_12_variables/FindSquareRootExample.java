
public class FindSquareRootExample {
    public static void main(String[] args) {
        int n = 93;
        System.out.println("The square root of " + n + " is: " + squareRoot(n));
        System.out.println("passed");
    }

    public static double squareRoot(int num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}
