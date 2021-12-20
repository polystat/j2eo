public class BooleanUnboxing {

	public static void main(String[] args) {
		Boolean a = false;
		boolean b = a.booleanValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
