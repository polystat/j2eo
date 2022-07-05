
public class ShortArrayCopyFunction {
	public static void main(String[] args) {
		short[] a1 = {(short) 0, (short) 1, (short) 2};
		short[] a2 = a1.clone();
		a1[0] = (short) -1;
		for (short item: a1) {
			System.out.println(item);
		}
		for (short item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
