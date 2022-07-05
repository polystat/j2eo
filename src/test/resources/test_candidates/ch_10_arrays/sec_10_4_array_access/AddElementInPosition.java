import java.util.Arrays;

public class AddElementInPosition {
    // method to add element to array and return new array
    public static int[] addElement(int[] arr,
                                   int element, int position) {

        // create new array
        int temp[] = new int[arr.length + 1];

        // add elements to new array
        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i == position) {
                temp[i] = element;
            } else {
                temp[i] = arr[j++];
            }
        }

        // return array
        return temp;
    }

    public static void main(String[] args) {
        // original array
        int arr[] = {10, 20, 30, 40, 50};

        // new element to be added
        int element = 99;

        // position to be inserted
        // Array index start from 0, not 1
        int position = 3;

        // display old array
        System.out.println("Original array: " + Arrays.toString(arr));

        // add element
        arr = addElement(arr, element, position);

        // display new array
        System.out.println("New array: " + Arrays.toString(arr));
        System.out.println("passed");
    }
}