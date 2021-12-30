public class CharWidening {

	public static void main(String[] args) {
		char a = 102;
		int b = a; // Widening
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
