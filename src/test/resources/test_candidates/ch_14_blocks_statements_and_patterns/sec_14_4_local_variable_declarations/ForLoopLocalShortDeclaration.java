
public class ForLoopLocalShortDeclaration {
	public static void main(String[] args) {
		for (short i = (short) 32767; i < 0; i++) {}
		System.out.println("passed");
	}
}
