
public class DoStmtIterateOverCharComplexCase {
	public static void main(String[] args) {
		char a = '\u0000';
		char b = '\u0010';
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
