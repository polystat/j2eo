
public class DoStmtIterateOverLongComplexCase {
	public static void main(String[] args) {
		long a = 0L;
		long b = 10L;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
