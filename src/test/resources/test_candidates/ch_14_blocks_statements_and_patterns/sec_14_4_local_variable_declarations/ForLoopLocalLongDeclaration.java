
public class ForLoopLocalLongDeclaration {
	public static void main(String[] args) {
		for (long i = 9223372036854775807L; i < 0; i++) {}
		System.out.println("passed");
	}
}
