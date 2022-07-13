
public class SmallestElement {
    // Java method to find smallest number in array
    public static int smallest(int[] arr) {
        int min = 0;
        min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        return min;
    }

    // main method
    public static void main(String[] args) {
        // declare variables
        int length = 10;
        int numbers[] = null;

        // create array
        numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -i * i + i - 1;
        }

        // method call
        System.out.println("Smallest element = "
                + smallest(numbers));
        System.out.println("passed");
    }
}