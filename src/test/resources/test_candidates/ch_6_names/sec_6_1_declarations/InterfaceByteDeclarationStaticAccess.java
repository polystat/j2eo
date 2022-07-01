
interface ByteInterface {
	public static byte i = (byte) 127;
}

public class InterfaceByteDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(ByteInterface.i);
		System.out.println("passed");
	}
}

