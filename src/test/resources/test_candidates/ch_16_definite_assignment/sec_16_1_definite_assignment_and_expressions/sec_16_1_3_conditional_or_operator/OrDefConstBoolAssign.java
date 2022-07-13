public class OrDefConstBoolAssign {
    public static void main(String[] args) {
        int k;
        if (false || (k = 10) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
