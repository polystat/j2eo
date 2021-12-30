public class SimpleAnnotationInterface {

	public static void main(String[] args) {
		method();
		System.out.println("passed");
	}

	@interface SimpleTest {
		int someVal();
	}

	@SimpleTest(someVal = 5)
	static void method() {
		System.out.println("working my work...");
	}

}