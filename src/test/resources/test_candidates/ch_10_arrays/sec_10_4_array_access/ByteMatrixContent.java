
public class ByteMatrixContent {
	public static void main(String[] args) {
		byte[][] m = {{(byte) 0, (byte) 1, (byte) 2}, {(byte) 3, (byte) 4, (byte) 5}, {(byte) 6, (byte) 7, (byte) 8}};
		for (byte[] row: m) {
			for (byte item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
