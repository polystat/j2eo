public class WideningExample {

	public static void main(String[] args) {
		int big = 1234567890;
		float approx = big;
		System.out.println("(big - (int) approx) = " + (big - (int) approx));
		System.out.println("passed");
	}
}
