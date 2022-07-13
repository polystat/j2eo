public class FloatWidening {

	public static void main(String[] args) {
		float a = 105f;
		double b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
