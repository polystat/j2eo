import java.util.Arrays;

public class AddElement {
    // method to add element to array and return new array
    public static int[] addElement(int[] arr, int element) {
        // create new array of size n+1
        int temp[] = new int[arr.length + 1];

        // copy all existing element
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // insert last element
        temp[arr.length] = element;

        // return new array
        return temp;
    }

    public static void main(String[] args) {
        // original array
        int arr[] = {30, 50, 20, 40, 10};

        // new element to be added
        int element = 99;

        // display old array
        System.out.println("Original array: " + Arrays.toString(arr));

        // add element
        arr = addElement(arr, element);

        // display new array
        System.out.println("New array: " + Arrays.toString(arr));
        System.out.println("passed");
    }
}