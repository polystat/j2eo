
interface DoubleInterface {
	public static double i = 10d;
}

public class InterfaceDoubleDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(DoubleInterface.i);
		System.out.println("passed");
	}
}

