public class ShortWidening {

	public static void main(String[] args) {
		short a = 101;
		int b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
