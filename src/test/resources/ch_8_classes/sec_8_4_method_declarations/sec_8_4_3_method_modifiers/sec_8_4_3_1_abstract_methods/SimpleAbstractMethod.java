package org.eolang.j2eo;

public class SimpleAbstractMethod {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.method();
		System.out.println("passed");
	}

	abstract class InnerAbstractClass {

		abstract void method ();

	}

	class InnerClass extends InnerAbstractClass {

		void method() {}

	}
}


