
public class LongDeclarationFieldAccess {
	long i = 9223372036854775807L;
	public static void main(String[] args) {
		System.out.println(new LongDeclarationFieldAccess().i);
		System.out.println("passed");
	}
}

