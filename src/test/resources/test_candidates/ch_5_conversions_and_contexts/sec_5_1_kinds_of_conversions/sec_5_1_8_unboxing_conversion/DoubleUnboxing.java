public class DoubleUnboxing {

	public static void main(String[] args) {
		Double a = 100.0;
		double b = a.doubleValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
