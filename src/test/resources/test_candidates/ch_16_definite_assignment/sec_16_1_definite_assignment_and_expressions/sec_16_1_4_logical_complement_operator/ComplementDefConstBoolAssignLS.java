public class ComplementDefConstBoolAssignLS {
    public static void main(String[] args) {
        int k = 33;
		boolean lie = false;
        if (!lie && (k <<= 3) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
