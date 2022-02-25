public class SimpleDo {
	public static void main(String[] args) {
		int a = 5, b = 0;
		do {
			System.out.println("a: " + a + ", b: " + b);
			if (b > a) {
				break;
			}
			b++;
		} while (true);
		System.out.println("passed");
	}
}
