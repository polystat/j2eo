public class ConditionalDefConstBoolAssignLS {
    public static void main(String[] args) {
        int k = 171;
		int some = !false ? k <<= 3 : 20;
		System.out.println(k);
        System.out.println("passed");
    }    
}
