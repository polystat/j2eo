
public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = i - 100;
        }

        // find of +ve, -ve, and zero
        checkNumbers(numbers);
        System.out.println("passed");
    }

    // method to count +ve, -ve, zero
    public static void checkNumbers(int[] numbers) {

        // variables
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // check each element
        for (int num : numbers) {
            if (num > 0) {        // +ve
                ++positive;
            } else if (num < 0) { // -ve
                ++negative;
            } else {              // 0
                ++zero;
            }
        }

        // display resultant values
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}