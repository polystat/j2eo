public class FloatNarrowing {

	public static void main(String[] args) {
		float a = Float.MAX_VALUE;
		int b = (int) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
