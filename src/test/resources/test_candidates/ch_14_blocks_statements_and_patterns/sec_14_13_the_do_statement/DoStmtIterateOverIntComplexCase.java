
public class DoStmtIterateOverIntComplexCase {
	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
