
public class DoubleMatrixContent {
	public static void main(String[] args) {
		double[][] m = {{0d, 1d, 2d}, {3d, 4d, 5d}, {6d, 7d, 8d}};
		for (double[] row: m) {
			for (double item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
