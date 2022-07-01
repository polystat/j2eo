public class ConstBoolAssignAnd {
    public static void main(String[] args) {
        int k = 200;
		boolean b = (k &= 2) > 0;
		System.out.println(b);
		System.out.println(k);
        System.out.println("passed");
    }    
}
