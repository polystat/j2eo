
class E {
	void foo() { System.out.println("Hi"); }
}
class S extends E {
	void foo() { S.super.foo(); }
}
class T extends S {
	void foo() {}
	void run() {
		T.super.foo();
	}
}

public class MethodInvocationViaSuperChainCase {
	public static void main(String[] args) {
		new T().run();
		System.out.println("passed");
	}
}
