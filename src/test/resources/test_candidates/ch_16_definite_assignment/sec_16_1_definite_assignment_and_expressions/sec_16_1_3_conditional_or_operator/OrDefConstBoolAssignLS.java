public class OrDefConstBoolAssignLS {
    public static void main(String[] args) {
        int k = 172;
        if (false || (k <<= 3) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
