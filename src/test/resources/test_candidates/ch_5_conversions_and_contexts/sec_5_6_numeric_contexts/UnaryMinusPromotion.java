public class UnaryMinusPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b];
		char c = '\u0001';
		a[c] = 1;
		a[0] = -c; // unary - promotion
		System.out.println("a: " + a[0] + "," + a[1]);
		System.out.println("passed");
	}
}
