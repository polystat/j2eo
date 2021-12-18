public class ByteUnboxing {

	public static void main(String[] args) {
		Byte a = 100;
		byte b = a.byteValue();
		System.out.println("b = " + b);
		System.out.println("passed");
	}
}
