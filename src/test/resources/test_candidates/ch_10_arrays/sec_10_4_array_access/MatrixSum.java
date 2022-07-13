public class MatrixSum {
    // main method
    public static void main(String[] args) {
        // declare and initialize matrix
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // find sum of matrix elements
        int sum = matrixSum(a);

        // display result
        System.out.println("The sum of matrix elements = " + sum);
        System.out.println("passed");
    }
    // method to find sum of matrix elements
    public static int matrixSum(int[][] a) {
        // variable to store sum
        int sum = 0;

        // traverse through the matrix
        for (int[] row : a) {
            for (int element : row) {
                // add element
                sum += element;
            }
        }

        // return sum value
        return sum;
    }
}