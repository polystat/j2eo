public class DoubleNarrowing {

	public static void main(String[] args) {
		double a = Double.MAX_VALUE;
		float b = (float) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
