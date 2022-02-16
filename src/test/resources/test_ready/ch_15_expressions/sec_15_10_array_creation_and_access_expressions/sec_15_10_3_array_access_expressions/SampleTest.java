
public class ComplexArrayElementAccess {
	public static void main(String[] args) {
		int[] a = {0, 1};
		float[] b = {-0.5f, 0.5f};
		b[a[0]] = 1f;
		System.out.println(b[a[0]]);
		System.out.println("passed");
	}
}
