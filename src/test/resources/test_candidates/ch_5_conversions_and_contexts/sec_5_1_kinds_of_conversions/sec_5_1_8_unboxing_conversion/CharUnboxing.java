public class CharUnboxing {

	public static void main(String[] args) {
		Character a = 100;
		char b = a.charValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
