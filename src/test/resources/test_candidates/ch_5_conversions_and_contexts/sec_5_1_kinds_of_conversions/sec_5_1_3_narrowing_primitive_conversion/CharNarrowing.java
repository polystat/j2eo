public class CharNarrowing {

	public static void main(String[] args) {
		char a = 15001;
		byte b = (byte) a; // Narrowing, possible information loss
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
