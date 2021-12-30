public class ByteWidening {

	public static void main(String[] args) {
		byte a = 100;
		short b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
