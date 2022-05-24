public class EmptyEnhancedFor {
    public static void main(String[] args) {
        int[] array = new int[] {};
        for (int a : array) {
            System.out.println(a / 2);
        }
        System.out.println("passed");
    }    
}
