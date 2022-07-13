public class PrivateGenericMethod {

	private static <T> void method(T param) {}

	public static void main(String[] args) {
		method("param");
		System.out.println("passed");
	}
}
