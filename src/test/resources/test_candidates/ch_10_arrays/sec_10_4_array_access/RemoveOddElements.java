import java.util.Arrays;

public class RemoveOddElements {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = (i - 1) * (i + 2) * (i - 3);
        }

        // remove odd numbers
        int newArr[] = removeOdd(numbers);

        // display new array
        System.out.println("Array after removing odd numbers: "
                + Arrays.toString(newArr));
        System.out.println("passed");
    }

    // method to display even or odd in array
    public static int[] removeOdd(int[] numbers) {

        // variables
        int countEven = 0;
        int even[] = null;

        // count even numbers
        for (int i : numbers) {
            if (i % 2 == 0)
                ++countEven;
        }

        // create array to store even numbers
        even = new int[countEven];

        // check each element and insert
        int i = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // even
                even[i++] = num;
            }
        }

        // return
        return even;
    }
}