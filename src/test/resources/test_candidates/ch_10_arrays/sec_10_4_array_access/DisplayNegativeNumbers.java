
public class DisplayNegativeNumbers {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = (i >> 2) - 5;
        }

        // display negative numbers
        displayNegative(numbers);
        System.out.println("passed");
    }

    // method to display negative numbers
    public static void displayNegative(int[] numbers) {

        // variables
        boolean flag = false;
        int i = 0;

        // check is there any negative numbers?
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                flag = true;
                break;
            }
        }

        // -ve number is not available
        if (!flag) {
            System.out.println("Array doesn’t contain negative number.");
            return;
        }

        // display -ve numbers
        System.out.println("Negative numbers = ");
        for (; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}