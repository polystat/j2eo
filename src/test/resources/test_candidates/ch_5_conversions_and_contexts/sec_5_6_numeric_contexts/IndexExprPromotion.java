public class IndexExprPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b];
		char c = '\u0001';
		a[c] = 1; // index expression promotion
		System.out.println("passed");
	}
}
