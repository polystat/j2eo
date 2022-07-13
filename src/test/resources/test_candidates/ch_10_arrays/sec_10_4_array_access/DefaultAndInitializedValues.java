
public class DefaultAndInitializedValues {
    public static void main(String[] args) {
        // declaring and creating array objects
        int[] arr = new int[5];

        // displaying default values
        System.out.println("Default values of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // initializing array
        System.out.println("\n\n***Initializing Array***");

        for (int i = 0; i < arr.length; i++) {
            // read input
            arr[i] = (i * 15) & 1111;
        }

        //displaying initialized values
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("passed");
    }
}