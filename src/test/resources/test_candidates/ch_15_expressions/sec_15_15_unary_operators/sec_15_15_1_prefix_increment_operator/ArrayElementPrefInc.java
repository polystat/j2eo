public class ArrayElementPrefInc {

	public static void main(String[] args) {
		int[] a = new int[] { 0 };
		int b = ++a[0];
		System.out.println(b);
		System.out.println("passed");
	}
}
