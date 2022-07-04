import java.util.Arrays;

public class ReverseArray {
    // method to reverse an array using another array
    public static int[] reverse(int[] realArr) {
        // declare variables
        int size = 0;
        int reverseArr[] = null;

        // find length of the given array
        size = realArr.length;

        // temporary array of the same size
        reverseArr = new int[size];

        // find reverse and store to temporary array
        // initialize iterator variables
        int i = 0;
        int j = size - 1;

        while (i < size) {
            // assign element
            reverseArr[i] = realArr[j];

            // update iterator variables
            i++;
            j--;
        }

        // return result
        return reverseArr;
    }

    public static void main(String[] args) {
        int size = 10;
        int numbers[] = null;
        int rev[] = null;

        // assign length to array
        numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i * i * i + i * i - 10 * i + 12;
        }

        // find reverse and store to rev
        rev = reverse(numbers);

        // display reverse of the array
        System.out.println("Reverse = " + Arrays.toString(rev));
        System.out.println("passed");
    }
}