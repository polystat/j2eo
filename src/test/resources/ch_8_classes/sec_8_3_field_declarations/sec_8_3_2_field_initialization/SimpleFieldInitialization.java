package org.eolang.j2eo;

public class SimpleFieldInitialization {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.var = obj.var2;
		System.out.println(obj.var);
		System.out.println("passed");
	}

	class InnerClass {
		int var = 2, var2 = 3;
	}
}
