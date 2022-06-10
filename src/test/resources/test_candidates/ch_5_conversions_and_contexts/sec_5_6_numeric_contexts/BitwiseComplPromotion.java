public class BitwiseComplPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b];
		char c = '\u0001';
		a[c] = 1;
		a[0] = -c;
		System.out.println("a: " + a[0] + "," + a[1]);
		b = -1;
		int i = ~b; // bitwise complement promotion
		System.out.println("~0x" + Integer.toHexString(b)
				+ "==0x" + Integer.toHexString(i));
		System.out.println("passed");
	}
}
