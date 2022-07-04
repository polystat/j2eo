
public class ByteArrayCopyFunction {
	public static void main(String[] args) {
		byte[] a1 = {(byte) 0, (byte) 1, (byte) 2};
		byte[] a2 = a1.clone();
		a1[0] = (byte) -1;
		for (byte item: a1) {
			System.out.println(item);
		}
		for (byte item: a2) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
