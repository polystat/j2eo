
public class ByteArrayInitializer {
	public static void main(String[] args) {
		byte[] a = {(byte) 0, (byte) 1, (byte) 2};
		for (byte item: a) {
			System.out.println(item);
		}
		System.out.println("passed");
	}
}
