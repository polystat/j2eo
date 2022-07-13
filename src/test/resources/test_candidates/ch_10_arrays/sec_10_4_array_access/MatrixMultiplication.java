import java.util.Arrays;

public class MatrixMultiplication {
    // main method
    public static void main(String[] args) {
        // declare and initialize a matrix
        int a[][] = {{1, 3}, {7, 5}};
        int b[][] = {{6, 8}, {4, 2}};

        // find size of matrix
        // (Assuming both matrix is square matrix
        // of same size)
        int size = a.length; // 2

        // declare new matrix to store result (2x2)
        int c[][] = new int[size][size];

        // multiplication of matrix
        c = multiplyMatrix(a, b);

        // display all matrices
        System.out.println("A = " + Arrays.deepToString(a));
        System.out.println("B = " + Arrays.deepToString(b));
        System.out.println("C (Product) = " + Arrays.deepToString(c));
        System.out.println("passed");
    }

    // method to calculate product of two matrix
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        // find size of matrix
        // (Assuming both matrix is square matrix
        // of same size)
        int size = a.length;

        // declare new matrix to store result
        int product[][] = new int[size][size];

        // find product of both matrices
        // outer loop
        for (int i = 0; i < size; i++) {
            // inner-1 loop
            for (int j = 0; j < size; j++) {
                // assign 0 to the current element
                product[i][j] = 0;

                // inner-2 loop
                for (int k = 0; k < size; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return product;
    }
}