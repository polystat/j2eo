
public class DoStmtIterateOverDouble {
	public static void main(String[] args) {
		double a = 0d;
		do {
			a++;
			System.out.println((int) a);
		} while (a < 10d);
		System.out.println("passed");
	}
}
