public class PrivateFinalMethod {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.methodPublic();
		System.out.println("passed");
	}
}

class OuterClass {
	private final void method () {}
	public final void methodPublic() {
		method();	
	}
}
