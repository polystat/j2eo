public class SimpleConditionalOR {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		if (a || b) {
			System.out.println("true block");
		}
		else {
			System.out.println("false block");
		}
		System.out.println("passed");
	}
}
