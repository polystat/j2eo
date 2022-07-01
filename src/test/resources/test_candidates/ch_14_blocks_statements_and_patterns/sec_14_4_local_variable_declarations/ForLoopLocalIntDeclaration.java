
public class ForLoopLocalIntDeclaration {
	public static void main(String[] args) {
		for (int i = 2147483647; i < 0; i++) {}
		System.out.println("passed");
	}
}
