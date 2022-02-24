public class TwoDimArrayAccess {
    public static void main(String[] args) {
        int[][] arr2 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr2[i][j] = i * j - (i + j);
                System.out.println(arr2[i][j]);
            }
        }
        System.out.println("passed");
    }    
}
