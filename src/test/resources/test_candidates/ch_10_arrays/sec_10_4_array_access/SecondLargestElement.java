
public class SecondLargestElement {
    // method to find second largest number in array
    public static int secondLargest(int[] arr) {
        // declare variables
        int fmax = 0;
        int smax = 0;

        // assign first element to fmax, smax
        fmax = arr[0];
        smax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if (smax < arr[i]) {
                smax = arr[i];
            }
        }

        return smax;
    }

    // main method
    public static void main(String[] args) {
        // declare variables
        int length = 10;
        int numbers[] = null;

        // create array
        numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i * i - 10 * i * i + 25 * i - 100;
        }

        // method call
        System.out.println("Second largest element = "
                + secondLargest(numbers));
        System.out.println("passed");
    }
}