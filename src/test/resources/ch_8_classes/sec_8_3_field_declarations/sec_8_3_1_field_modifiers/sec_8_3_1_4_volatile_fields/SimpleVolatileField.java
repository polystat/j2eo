package org.eolang.j2eo;

public class SimpleVolatileField {

	static volatile int var = 2;

	public static void main(String[] args) {
		int a = var + 1;
		System.out.println("passed");
	}
}
