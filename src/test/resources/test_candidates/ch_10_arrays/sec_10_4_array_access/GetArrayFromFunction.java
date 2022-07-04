public class GetArrayFromFunction {
    // main method
    public static void main(String[] args) {
        // read array from a method
        int[] a = readArray();

        // display array elements
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println("passed");
    }

    // method to return array elements
    public static int[] readArray() {
        int[] arr = {10, 20, 30, 40};
        return arr;
    }

}