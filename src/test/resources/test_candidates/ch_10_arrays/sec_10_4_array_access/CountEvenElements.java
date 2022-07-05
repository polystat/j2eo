import java.util.Arrays;

public class CountEvenElements {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = 2 * i - i * i + 10;
        }

        // display odd-even
        displayOddEven(numbers);
    }

    // method to display even or odd in array
    public static void displayOddEven(int[] numbers) {

        // variables
        int countEven = 0;
        int countOdd = 0;
        int even[] = null;
        int odd[] = null;

        // count even numbers
        for (int i : numbers) {
            if (i % 2 == 0)
                ++countEven;
        }
        // count odd numbers
        countOdd = numbers.length - countEven;

        // create array to store odd and even numbers
        even = new int[countEven];
        odd = new int[countOdd];

        // check each element and insert
        // them in appropriate array
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num % 2 == 0) { // even
                even[i++] = num;
            } else {
                odd[j++] = num;
            }
        }

        // display even & odd arrays
        System.out.println("Even numbers: "
                + Arrays.toString(even));
        System.out.println("Odd numbers: "
                + Arrays.toString(odd));
        System.out.println("passed");
    }
}