
public class BooleanArrayCopyFunction {
	public static void main(String[] args) {
		boolean[] a1 = {false, false, false};
		boolean[] a2 = a1.clone();
		a1[0] = true;
		for (boolean item: a1) {
			System.out.println(item);
		}
		for (boolean item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
