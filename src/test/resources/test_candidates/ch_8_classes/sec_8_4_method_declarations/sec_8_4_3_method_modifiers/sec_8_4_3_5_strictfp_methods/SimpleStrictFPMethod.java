public class SimpleStrictFPMethod {

	static strictfp void method() {}

	public static void main(String[] args) {
		method();
		System.out.println("passed");
	}
}
