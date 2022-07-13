public class AndDefConstBoolAssignLS {
    public static void main(String[] args) {
        int k = 173;
        if (true && (k <<= 3) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
