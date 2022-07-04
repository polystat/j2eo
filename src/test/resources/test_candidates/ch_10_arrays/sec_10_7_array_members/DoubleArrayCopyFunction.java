
public class DoubleArrayCopyFunction {
	public static void main(String[] args) {
		double[] a1 = {0d, 1d, 2d};
		double[] a2 = a1.clone();
		a1[0] = -1d;
		for (double item: a1) {
			System.out.println(item);
		}
		for (double item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
