
interface FloatInterface {
	public static float i = 10f;
}

public class InterfaceFloatDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(FloatInterface.i);
		System.out.println("passed");
	}
}

