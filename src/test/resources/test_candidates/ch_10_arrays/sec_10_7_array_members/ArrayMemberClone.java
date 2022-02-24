public class ArrayMemberClone {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        int[] arrCopy = arr.clone();
        for (int i : arrCopy) {
            System.out.println(i);
        }
        System.out.println("passed");
    }    
}
