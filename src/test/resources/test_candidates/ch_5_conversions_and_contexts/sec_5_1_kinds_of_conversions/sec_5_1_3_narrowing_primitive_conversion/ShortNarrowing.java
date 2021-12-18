public class ShortNarrowing {

	public static void main(String[] args) {
		short a = 15000;
		byte b = (byte) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
