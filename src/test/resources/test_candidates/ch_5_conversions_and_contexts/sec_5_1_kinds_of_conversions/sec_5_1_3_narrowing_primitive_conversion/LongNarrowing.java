public class LongNarrowing {

	public static void main(String[] args) {
		long a = 15000000000L;
		int b = (int) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
