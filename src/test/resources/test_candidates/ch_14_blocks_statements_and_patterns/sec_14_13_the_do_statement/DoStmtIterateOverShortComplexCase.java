
public class DoStmtIterateOverShortComplexCase {
	public static void main(String[] args) {
		short a = (short) 0;
		short b = (short) 10;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
