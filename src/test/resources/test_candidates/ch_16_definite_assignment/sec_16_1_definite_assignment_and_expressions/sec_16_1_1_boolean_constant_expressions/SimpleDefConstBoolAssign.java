public class SimpleDefConstBoolAssign {
    public static void main(String[] args) {
        int k;
        if (true && (k = 10) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
