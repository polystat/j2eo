public class OddEvenElementsSum {
    public static void main(String[] args) {
        int n = 10;

        // create an int array of size n
        int numbers[] = new int[n];

        for (int i = 0; i < n; ++i) {
            numbers[i] = (10 - i) * (15 + i);
        }

        // find of odd and even
        oddEvenSum(numbers);
        System.out.println("passed");
    }

    // method to find sum of even-odd in array
    public static void oddEvenSum(int[] numbers) {
        // variables
        int oddSum = 0;
        int evenSum = 0;

        // check each element and add
        for (int num : numbers) {
            if (num % 2 == 0) { // even
                evenSum += num;
            } else {            // odd
                oddSum += num;
            }
        }

        // display resultant values
        System.out.println("Odd numbers sum = " + oddSum);
        System.out.println("Even numbers sum = " + evenSum);
    }
}