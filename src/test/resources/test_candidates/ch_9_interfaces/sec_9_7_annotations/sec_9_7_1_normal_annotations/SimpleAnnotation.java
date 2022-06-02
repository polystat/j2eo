public class SimpleAnnotation {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		int val1();
		String val2();
	}
	@Some(val1 = 8, val2 = "wow")
	static void method() {
		System.out.println("passed");
	}
}
