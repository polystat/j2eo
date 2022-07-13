public class ProtectedFinalMethod {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.method();
		System.out.println("passed");
	}
}

class OuterClass {
	protected final void method () {}
}
