public class ConditionalDefConstBoolAssign {
    public static void main(String[] args) {
        int k;
		int some = !false ? k = 10 : 20;
		System.out.println(k);
        System.out.println("passed");
    }    
}
