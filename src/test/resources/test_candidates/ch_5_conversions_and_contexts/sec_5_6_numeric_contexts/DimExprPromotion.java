public class DimExprPromotion {

	public static void main(String[] args) {
		byte b = 2;
		int a[] = new int[b]; // dimension expression promotion
		System.out.println("passed");
	}
}
