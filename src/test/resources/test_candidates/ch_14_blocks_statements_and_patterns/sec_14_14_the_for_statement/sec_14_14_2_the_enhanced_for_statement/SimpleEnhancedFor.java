public class SimpleEnhancedFor {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 4, 8, 16, 32 };
        for (int a : array) {
            System.out.println(a / 2);
        }
        System.out.println("passed");
    }    
}
