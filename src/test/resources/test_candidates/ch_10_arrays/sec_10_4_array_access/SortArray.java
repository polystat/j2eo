import java.util.Arrays;

public class SortArray {
    // main method
    public static void main(String[] args) {

        // declare and initialize arrays
        int arr[] = {50, 25, 30, 55, 15};

        // display array before sorting
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        // sort array
        Arrays.sort(arr);

        // display array after sorting
        System.out.println("After Sorting: " + Arrays.toString(arr));
        System.out.println("passed");
    }
}