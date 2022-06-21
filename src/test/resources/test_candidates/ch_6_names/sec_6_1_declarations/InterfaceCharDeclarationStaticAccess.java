
interface CharInterface {
	public static char i = 'A';
}

public class InterfaceCharDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(CharInterface.i);
		System.out.println("passed");
	}
}

