
public class LongMatrixContent {
	public static void main(String[] args) {
		long[][] m = {{0L, 1L, 2L}, {3L, 4L, 5L}, {6L, 7L, 8L}};
		for (long[] row: m) {
			for (long item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
