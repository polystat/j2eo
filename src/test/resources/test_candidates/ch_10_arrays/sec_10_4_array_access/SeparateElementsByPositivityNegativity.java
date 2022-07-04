import java.util.Arrays;

public class SeparateElementsByPositivityNegativity {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = (i | 23423) * (i & 7465) - 10;
        }

        // display negative numbers
        seperate(numbers);
        System.out.println("passed");
    }

    // method to seperate +ve, -ve numbers
    public static void seperate(int[] numbers) {

        // variables
        int posCount = 0;
        int negCount = 0;
        int positive[] = null;
        int negative[] = null;

        // count positive and negative numbers
        for (int i : numbers) {
            if (i >= 0)
                ++posCount;
            else
                ++negCount;
        }

        // if array contains only positive or negative
        if (posCount == 0) {
            System.out.println("Array contains only negative numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        } else if (negCount == 0) {
            System.out.println("Array contains only positive numbers");
            // display array
            System.out.println("Array = " + Arrays.toString(numbers));
            return;
        }

        // create positive and negative array
        positive = new int[posCount];
        negative = new int[negCount];

        // check element and insert
        int i = 0;
        int j = 0;
        for (int num : numbers) {
            if (num >= 0) {
                positive[i++] = num;
            } else {
                negative[j++] = num;
            }
        }

        // both arrays
        System.out.println("Negative numbers = "
                + Arrays.toString(negative));
        System.out.println("Positive numbers = "
                + Arrays.toString(positive));
    }
}