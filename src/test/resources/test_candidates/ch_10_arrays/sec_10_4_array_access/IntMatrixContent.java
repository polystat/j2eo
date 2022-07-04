
public class IntMatrixContent {
	public static void main(String[] args) {
		int[][] m = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
		for (int[] row: m) {
			for (int item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
