
public class ForLoopLocalCharDeclaration {
	public static void main(String[] args) {
		for (char i = '\uFFFF'; i < 0; i++) {}
		System.out.println("passed");
	}
}
