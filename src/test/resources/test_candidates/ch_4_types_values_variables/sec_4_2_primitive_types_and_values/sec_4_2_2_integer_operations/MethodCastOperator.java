public class MethodCastOperator {
    public static void main(String[] args) {
        float b = (float) method();
        System.out.println(b);
        System.out.println("passed");
    }    
	static int method() {
		return 9;
	}
}
