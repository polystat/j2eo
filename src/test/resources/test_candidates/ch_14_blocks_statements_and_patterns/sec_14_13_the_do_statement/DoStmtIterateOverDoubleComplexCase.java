
public class DoStmtIterateOverDoubleComplexCase {
	public static void main(String[] args) {
		double a = 0d;
		double b = 10d;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
