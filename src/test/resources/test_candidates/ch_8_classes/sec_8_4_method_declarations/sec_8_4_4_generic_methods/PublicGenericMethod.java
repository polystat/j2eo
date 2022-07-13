public class PublicGenericMethod {

	public static <T> void method(T param) {}

	public static void main(String[] args) {
		method("param");
		System.out.println("passed");
	}
}
