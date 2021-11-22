public class SimpleSynchronizedMethod {

	static synchronized void method() {}

	public static void main(String[] args) {
		method();
		System.out.println("passed");
	}
}
