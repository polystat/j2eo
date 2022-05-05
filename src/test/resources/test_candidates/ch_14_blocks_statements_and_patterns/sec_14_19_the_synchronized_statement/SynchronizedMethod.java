public class SynchronizedMethod {

	public static void main(String[] args) {
		method();
	}

	public static synchronized void method() {
		System.out.println("passed");
	}

}
