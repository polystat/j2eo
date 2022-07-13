public class ArrayBitwiseComplement {

	public static void main(String[] args) {
		int[] a = new int[] { 115 };
		int b = ~a[0];
		int c = (-a[0]) - 1;
		System.out.println(b == c);
		System.out.println("passed");
	}
}
