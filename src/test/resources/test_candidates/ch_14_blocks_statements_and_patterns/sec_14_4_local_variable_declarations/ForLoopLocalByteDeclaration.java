
public class ForLoopLocalByteDeclaration {
	public static void main(String[] args) {
		for (byte i = (byte) 127; i < 0; i++) {}
		System.out.println("passed");
	}
}
