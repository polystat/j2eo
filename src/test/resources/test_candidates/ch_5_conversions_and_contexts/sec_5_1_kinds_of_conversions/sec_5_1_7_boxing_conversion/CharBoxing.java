public class CharBoxing {

	public static void main(String[] args) {
		char a = '\u1234';
		Character b = a;
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
