public class SimpleFinalMethod {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.method();
		System.out.println("passed");
	}
}

class OuterClass {
	final void method () {}
}
