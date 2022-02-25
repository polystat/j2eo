public class SimpleArrayAccess {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sum;
            sum += i;
            System.out.println(arr[i]);
        }
        System.out.println("passed");
    }    
}
