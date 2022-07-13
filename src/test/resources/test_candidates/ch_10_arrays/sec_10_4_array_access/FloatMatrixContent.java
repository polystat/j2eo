
public class FloatMatrixContent {
	public static void main(String[] args) {
		float[][] m = {{0f, 1f, 2f}, {3f, 4f, 5f}, {6f, 7f, 8f}};
		for (float[] row: m) {
			for (float item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
