
public class SumOfPositiveElements {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size N
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = i * (10 - i) * (5 + i);
        }

        // calculate the sum of positive numbers
        int sum = positiveSum(numbers);

        // display result
        System.out.println("Sum of positive numbers = " + sum);
        System.out.println("passed");
    }

    // method to display negative numbers
    public static int positiveSum(int[] numbers) {
        // variable
        int sum = 0;
        // traverse through the array
        for (int i : numbers) {
            if (i >= 0) sum += i;
        }
        // return
        return sum;
    }
}