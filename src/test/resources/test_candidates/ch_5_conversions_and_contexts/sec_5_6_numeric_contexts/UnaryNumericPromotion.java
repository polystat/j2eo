public class UnaryNumericPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b]; // dimension expression promotion
		char c = '\u0001';
		a[c] = 1; // index expression promotion
		a[0] = -c; // unary - promotion
		System.out.println("a: " + a[0] + "," + a[1]);
		b = -1;
		int i = ~b; // bitwise complement promotion
		System.out.println("~0x" + Integer.toHexString(b)
				+ "==0x" + Integer.toHexString(i));
		i = b << 4L; // shift promotion (left operand)
		System.out.println("0x" + Integer.toHexString(b)
				+ "<<4L==0x" + Integer.toHexString(i));
		System.out.println("passed");
	}
}
