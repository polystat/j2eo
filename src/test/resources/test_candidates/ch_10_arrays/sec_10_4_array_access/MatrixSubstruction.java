
public class MatrixSubstruction {
    public static void main(String[] args) {
        // declare variables
        int row = 0;
        int column = 0;
        int a[][] = null; // first matrix
        int b[][] = null; // second matrix
        int c[][] = null; // resultant matrix

        row = 3;
        column = 4;

        // initialize matrices
        a = new int[row][column];
        b = new int[row][column];
        c = new int[row][column];

        // get matrix A and B
        a = getMatrix(a, 1);
        b = getMatrix(b, 2);

        // Subtraction of matrix
        c = subMatrix(a, b);

        // display resultant matrix
        System.out.println("Subtraction (C): ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // new line
        }
        System.out.println("passed");
    }

    // method to read matrix elements as input
    public static int[][] getMatrix(int[][] temp, int factor) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                // read matrix elements
                temp[i][j] = factor * i * j - i - j + temp.length * temp[0].length / factor;
            }
        }
        return temp;
    }

    // method to calculate the subtraction of two matrix
    public static int[][] subMatrix(int[][] a, int[][] b) {
        // calculate row and column size
        int row = a.length;
        int column = a[0].length;

        // declare a matrix to store resultant
        int sub[][] = new int[row][column];

        // calculate subtraction of two matrices
        // outer loop for row
        for (int i = 0; i < row; i++) {
            // inner loop for column
            for (int j = 0; j < column; j++) {
                // formula
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        // return resultant matrix
        return sub;
    }
}