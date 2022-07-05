public class DisplayMatrixNoSquare {
    public static void main(String[] args) {
        // declare and initialize a matrix or 2D array
        int matrix[][] = {{1, 2}, {4, 5}, {7, 8}};

        // display matrix using for loops
        // outer loop for row
        for (int i = 0; i < matrix.length; i++) {
            // inner loop for column
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line
        }
        System.out.println("passed");
    }
}