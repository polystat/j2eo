public class MethodConditionalOperator {
    public static void main(String[] args) {
        int b = methodBool() ? method1() : method2();
        System.out.println(b);
        System.out.println("passed");
    }    
	static boolean methodBool() {
		return false;
	}
	static int method1() {
		return 12;
	}
	static int method2() {
		return 25;
	}
}
