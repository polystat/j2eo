public class SimpleMethodThrows {

	static void method() throws Exception {}

	public static void main(String[] args) throws Exception {
		method();
		System.out.println("passed");
	}
}
