
public class CharMatrixContent {
	public static void main(String[] args) {
		char[][] m = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}};
		for (char[] row: m) {
			for (char item: row) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
		System.out.println("passed");
	}
}
