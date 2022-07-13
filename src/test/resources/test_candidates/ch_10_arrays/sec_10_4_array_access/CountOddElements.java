
public class CountOddElements {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = i + i * i - 3 * i * i * i + 100;
        }

        // count odd-even
        countOddEven(numbers);
    }

    // method to count odd and even numbers
    // in a given array and display it
    public static void countOddEven(int[] arr) {
        // variables
        int oddCount = 0;
        int evenCount = 0;

        // traverse the array
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) // even
                ++evenCount;
            else                 // odd
                ++oddCount;
        }

        // display result
        System.out.println("Count of the Even numbers = "
                + evenCount);
        System.out.println("Count of the Odd numbers = "
                + oddCount);
        System.out.println("passed");
    }
}