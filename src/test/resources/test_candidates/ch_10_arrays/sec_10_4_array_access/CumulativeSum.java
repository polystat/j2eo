import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size N
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = i ^ 746534 + 255;
        }

        // calculate the cumulative sum of array
        int sum[] = cumulativeSum(numbers);

        // display result
        System.out.println("Cumulative sum = "
                + Arrays.toString(sum));
        System.out.println("passed");
    }

    // method to find cumulative sum of array
    public static int[] cumulativeSum(int[] numbers) {
        // variable
        int sum = 0;

        // traverse through the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // find sum
            numbers[i] = sum; // replace
        }

        // return
        return numbers;
    }
}