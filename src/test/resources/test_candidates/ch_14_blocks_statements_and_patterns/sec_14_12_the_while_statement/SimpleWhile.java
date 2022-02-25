public class SimpleWhile {
	public static void main(String[] args) {
		int a = 5, b = 0;
		while (a > b) {
			System.out.println("a: " + a + ", b: " + b);
			b++;
		}
		System.out.println("passed");
	}
}