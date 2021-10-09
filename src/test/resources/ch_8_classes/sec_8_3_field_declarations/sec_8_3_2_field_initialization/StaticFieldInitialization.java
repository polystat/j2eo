package org.eolang.j2eo;

public class StaticFieldInitialization {

	public static void main(String[] args) {
		OuterClass obj = new OuterClass();
		obj.var = OuterClass.var2 + 2;
		System.out.println(obj.var);
		System.out.println("passed");
	}
}

class OuterClass {
	int var = var2;
	static int var2 = 5;
}