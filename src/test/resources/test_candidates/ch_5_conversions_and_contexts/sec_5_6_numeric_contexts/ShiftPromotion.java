public class ShiftPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b];
		char c = '\u0001';
		a[c] = 1;
		a[0] = -c;
		b = -1;
		int i = ~b;
		i = b << 4L; // shift promotion (left operand)
		System.out.println("0x" + Integer.toHexString(b)
				+ "<<4L==0x" + Integer.toHexString(i));
		System.out.println("passed");
	}
}
