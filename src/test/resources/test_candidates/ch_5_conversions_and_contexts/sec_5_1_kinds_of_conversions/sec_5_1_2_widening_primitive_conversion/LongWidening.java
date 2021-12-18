public class LongWidening {

	public static void main(String[] args) {
		long a = 104L;
		double b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
