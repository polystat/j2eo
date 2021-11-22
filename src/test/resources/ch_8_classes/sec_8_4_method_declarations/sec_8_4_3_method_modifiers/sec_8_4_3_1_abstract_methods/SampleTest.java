public class SimpleAbstractMethod {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.method();
		System.out.println("passed");
	}

}

abstract class OuterAbstractClass {

	abstract void method ();

}

class OuterClass extends OuterAbstractClass {

	void method() {}

}
