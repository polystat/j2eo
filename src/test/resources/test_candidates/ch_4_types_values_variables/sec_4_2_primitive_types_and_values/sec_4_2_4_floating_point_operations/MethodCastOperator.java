public class MethodCastOperator {
    public static void main(String[] args) {
        long b = (long) method();
        System.out.println(b);
        System.out.println("passed");
    }    
	static float method() {
		return 33.225f;
	}
}
