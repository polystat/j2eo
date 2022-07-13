
interface LongInterface {
	public static long i = 9223372036854775807L;
}

public class InterfaceLongDeclarationStaticAccess {
	public static void main(String[] args) {
		System.out.println(LongInterface.i);
		System.out.println("passed");
	}
}

