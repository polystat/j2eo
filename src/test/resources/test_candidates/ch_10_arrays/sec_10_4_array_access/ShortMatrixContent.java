
public class ShortMatrixContent {
	public static void main(String[] args) {
		short[][] m = {{(short) 0, (short) 1, (short) 2}, {(short) 3, (short) 4, (short) 5}, {(short) 6, (short) 7, (short) 8}};
		for (short[] row: m) {
			for (short item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
