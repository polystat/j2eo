
public class LongArrayInitializer {
	public static void main(String[] args) {
		long[] a = {0L, 1L, 2L};
		for (long item: a) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
