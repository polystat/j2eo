public class IntegerWidening {

	public static void main(String[] args) {
		int a = 103;
		float b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
