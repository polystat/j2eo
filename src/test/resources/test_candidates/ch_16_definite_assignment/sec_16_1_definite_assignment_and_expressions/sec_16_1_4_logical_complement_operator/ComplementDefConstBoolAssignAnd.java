public class ComplementDefConstBoolAssignAnd {
    public static void main(String[] args) {
        int k = 22;
		boolean lie = false;
        if (!lie && (k &= 10) > 0) {
            System.out.println(k);
        }
        System.out.println("passed");
    }    
}
