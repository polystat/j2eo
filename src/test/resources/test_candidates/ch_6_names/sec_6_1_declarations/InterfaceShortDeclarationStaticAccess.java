
interface ShortInterface {
	public static short i = (short) 32767;
}

public class InterfaceShortDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(ShortInterface.i);
		System.out.println("passed");
	}
}

