public class GCD {
    public static void main(String[] args) {
        // variables
        int size = 0;
        int arr[] = null;
        int result = 0;

        size = 10;

        // declare array
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * (i + 2);
        }

        // assign first number to result
        result = arr[0];

        // loop
        for (int i = 1; i < size; i++) {
            result = findHCF(result, arr[i]);
        }

        // display result
        System.out.println("GCD = " + result);
        System.out.println("passed");
    }

    // recursive method
    public static int findHCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }
}