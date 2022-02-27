public class SimpleArrayInitializer {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("passed");
    }    
}
