import java.util.Arrays;

public class TwoArraySum {
    public static void main(String[] args) {
        int array1size = 10;

        // declare three array with given size
        int array1[] = new int[array1size];
        int array2[] = new int[array1size];
        int array3[] = new int[array1size];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * i + 5 * i - 6;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * i - i + 6;
            ;
        }

        // loop to iterate through the array
        for (int i = 0; i < array3.length; i++) {
            // add array elements
            array3[i] = array1[i] + array2[i];
        }

        // display the third array
        System.out.println("Resultant Array: "
                + Arrays.toString(array3));
        System.out.println("passed");
    }
}