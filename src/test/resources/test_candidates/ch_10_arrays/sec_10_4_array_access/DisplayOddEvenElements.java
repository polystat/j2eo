
public class DisplayOddEvenElements {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = i * i * i - 15 * i * i + 10 * i - 11;
        }

        // display odd-even
        displayOddEven(numbers);
        System.out.println("passed");
    }

    // method to display even or odd in array
    public static void displayOddEven(int[] numbers) {
        // traverse through the array
        for (int i : numbers) {
            if (i % 2 == 0)       // even
                System.out.println(i + ": Even");
            else               // odd
                System.out.println(i + ": Odd");
        }
    }
}