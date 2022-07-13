
public class IntArrayCopyFunction {
	public static void main(String[] args) {
		int[] a1 = {0, 1, 2};
		int[] a2 = a1.clone();
		a1[0] = -1;
		for (int item: a1) {
			System.out.println(item);
		}
		for (int item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
