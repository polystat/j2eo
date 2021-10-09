package org.eolang.j2eo;

public class SimpleRecieverParameterMethod {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.method();
		System.out.println("passed");
	}

	class InnerClass
	{
		void method (InnerClass this) {}
	}

}
