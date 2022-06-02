public class MarkerAnnInt {
	public static void main(String[] args) {
		method();
	}
	@interface Some {}
	@Some
	static void method() {
		System.out.println("passed");
	}
}
