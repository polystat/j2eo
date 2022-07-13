public class IntNarrowing {

	public static void main(String[] args) {
		int a = 15002;
		byte b = (byte) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
