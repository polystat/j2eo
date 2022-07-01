
interface BooleanInterface {
	public static boolean i = true;
}

public class InterfaceBooleanDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(BooleanInterface.i);
		System.out.println("passed");
	}
}

