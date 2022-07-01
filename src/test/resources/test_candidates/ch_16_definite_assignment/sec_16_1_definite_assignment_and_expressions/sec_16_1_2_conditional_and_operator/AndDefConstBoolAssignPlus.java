public class AndDefConstBoolAssignPlus {
    public static void main(String[] args) {
        int k = 17;
        if (true && (k += 10) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
