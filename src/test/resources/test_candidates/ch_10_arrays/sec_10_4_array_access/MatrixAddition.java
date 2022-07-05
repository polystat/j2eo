import java.util.Arrays;

public class MatrixAddition {
    // main method
    public static void main(String[] args) {
        // declare and initialize two matrices
        int a[][] = {{1, 3}, {7, 5}};
        int b[][] = {{6, 8}, {4, 2}};

        // find row and column size
        // (Assuming both matrix have same size)
        int row = a.length;
        int column = a[0].length;

        // declare new matrix to store result
        int c[][] = new int[row][column];

        // sum of matrix
        c = addMatrix(a, b);

        // display all matrices
        System.out.println("A = " + Arrays.deepToString(a));
        System.out.println("B = " + Arrays.deepToString(b));
        System.out.println("C = " + Arrays.deepToString(c));
        System.out.println("passed");
    }

    // method to calculate the addition of two matrix
    public static int[][] addMatrix(int[][] a, int[][] b) {
        // calculate row and column size
        int row = a.length;
        int column = a[0].length;

        // declare a matrix to store resultant
        int sum[][] = new int[row][column];

        // calculate sum of two matrices
        // outer loop for row
        for (int i = 0; i < row; i++) {
            // inner loop for column
            for (int j = 0; j < column; j++) {
                // formula
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // return resultant matrix
        return sum;
    }
}