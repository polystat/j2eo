public class TwoDimEnhancedFor {
    public static void main(String[] args) {
        int[][] arr2 = new int[] { {2}, {4}, {8}, {16}, {32} };
        for (int[] a : arr2) {
            System.out.println(a[0]);
        }
        System.out.println("passed");
    }    
}
