
public class LargestElement {
    // Java method to find largest number in array
    public static int largest(int[] array) {
        // declare a variable max
        // assign first element to max
        int max = array[0];

        // compare with remaining elements
        // loop
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }

        return max;
    }

    // main method
    public static void main(String[] args) {
        // declare variables
        int size = 10;
        int arr[] = null;

        // create array
        arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

        // method call
        System.out.println("Largest element = " + largest(arr));
        System.out.println("passed");
    }
}