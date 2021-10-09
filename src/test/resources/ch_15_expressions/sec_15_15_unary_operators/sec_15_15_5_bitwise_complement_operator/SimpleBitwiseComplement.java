package org.eolang.j2eo;

public class SimpleBitwiseComplement {

	public static void main(String[] args) {
		int a = 115;
		int b = ~a;
		int c = (-a) - 1;
		System.out.println(b == c);
		System.out.println("passed");
	}
}
