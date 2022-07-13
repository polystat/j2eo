
interface IntInterface {
	public static int i = 2147483647;
}

public class InterfaceIntDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(IntInterface.i);
		System.out.println("passed");
	}
}

