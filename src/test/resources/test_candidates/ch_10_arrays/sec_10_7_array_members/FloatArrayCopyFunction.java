
public class FloatArrayCopyFunction {
	public static void main(String[] args) {
		float[] a1 = {0f, 1f, 2f};
		float[] a2 = a1.clone();
		a1[0] = -1f;
		for (float item: a1) {
			System.out.println(item);
		}
		for (float item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
