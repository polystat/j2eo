
public class SimpleQualifiedThis {

	public static void main(String[] args) {
		new SomeClass().method();
	}
}
class SomeClass {
	void method() {
		System.out.println("passed");
	}
	class SomeOtherClass {
		void method() {
			SomeClass.this.method();
		}
	}
}
