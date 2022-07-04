
public class ShortArrayInitializer {
	public static void main(String[] args) {
		short[] a = {(short) 0, (short) 1, (short) 2};
		for (short item: a) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
