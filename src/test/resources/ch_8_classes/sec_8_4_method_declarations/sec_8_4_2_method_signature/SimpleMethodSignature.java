package org.eolang.j2eo;

public class SimpleMethodSignature {

	private static synchronized int method (float param1, long param2) {
		return 0;
	}

	public static void main(String[] args) {
		int a = method(1f, 2L);
		System.out.println("passed");
	}

}
