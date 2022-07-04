public class MatrixDiagonalSum {
    // main method
    public static void main(String[] args) {
        // declare and initialize a matrix
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // find sum of diagonal elements
        int sum = diagonalSum(a);

        // display result
        System.out.println("Sum of diagonal elements = " + sum);
        System.out.println("passed");
    }
    // method to find sum of diagonal elements of matrix
    public static int diagonalSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) sum += a[i][j];
            }
        }
        return sum;
    }
}