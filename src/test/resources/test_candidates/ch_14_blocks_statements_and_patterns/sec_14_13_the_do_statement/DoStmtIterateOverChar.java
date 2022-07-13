
public class DoStmtIterateOverChar {
	public static void main(String[] args) {
		char a = '\u0000';
		do {
			a++;
			System.out.println((int) a);
		} while (a < '\u0010');
		System.out.println("passed");
	}
}
