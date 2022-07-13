public class SimpleDefaultAnnotationInterface {
	public static void main(String[] args) {
		method();
	}
	@interface Some {
		int val1();
		String val2() default "[undefined]";
	}
	@Some(val1 = 2)
	static void method() {
		System.out.println("passed");
	}
}
