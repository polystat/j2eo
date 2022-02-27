public class MethodInvocationViaSuper {
	public static void main(String[] args) {
		new T().run();
		System.out.println("passed");
	}
}

class S {
	void foo() { System.out.println("Hi"); }
}
class T extends S {
	void foo() {}
	void run() {
		T.super.foo();
	}
}