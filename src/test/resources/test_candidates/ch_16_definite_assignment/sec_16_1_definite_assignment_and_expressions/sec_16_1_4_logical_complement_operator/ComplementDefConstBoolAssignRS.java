public class ComplementDefConstBoolAssignRS {
    public static void main(String[] args) {
        int k = 33;
		boolean lie = false;
        if (!lie && (k >>= 5) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
