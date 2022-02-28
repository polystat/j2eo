public class PrivateFinalField {

	private static final int var = 2;

	public static void main(String[] args) {
		int a = var + 1;
		System.out.println("passed");
	}
}
