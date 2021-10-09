package org.eolang.j2eo;

public class SimpleMethodThrows {

	static void method() throws Exception {}

	public static void main(String[] args) {
		method();
		System.out.println("passed");
	}
}
