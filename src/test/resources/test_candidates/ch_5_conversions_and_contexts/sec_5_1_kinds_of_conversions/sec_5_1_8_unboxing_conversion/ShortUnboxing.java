public class ShortUnboxing {

	public static void main(String[] args) {
		Short a = 100;
		short b = a.shortValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
