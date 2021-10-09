package org.eolang.j2eo;

public class SimpleTransientField {

	static transient int var = 2;

	public static void main(String[] args) {
		int a = var + 1;
		System.out.println("passed");
	}
}
