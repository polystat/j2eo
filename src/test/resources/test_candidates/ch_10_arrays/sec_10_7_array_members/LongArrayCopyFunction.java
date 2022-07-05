
public class LongArrayCopyFunction {
	public static void main(String[] args) {
		long[] a1 = {0L, 1L, 2L};
		long[] a2 = a1.clone();
		a1[0] = -1L;
		for (long item: a1) {
			System.out.println(item);
		}
		for (long item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
