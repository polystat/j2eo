
public class SunnyNumberExample {
    public static void main(String args[]) {
        int N = 31;
        isSunnyNumber(N);
        System.out.println("passed");
    }

    static boolean findPerfectSquare(double num) {
        double square_root = Math.sqrt(num);
        return ((square_root - Math.floor(square_root)) == 0);
    }

    static void isSunnyNumber(int N) {
        if (findPerfectSquare(N + 1)) {
            System.out.println("The given number is a sunny number.");
        } else {
            System.out.println("The given number is not a sunny number.");
        }
    }
}
