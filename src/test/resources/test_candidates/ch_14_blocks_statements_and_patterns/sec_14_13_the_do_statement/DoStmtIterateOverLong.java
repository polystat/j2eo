
public class DoStmtIterateOverLong {
	public static void main(String[] args) {
		long a = 0L;
		do {
			a++;
			System.out.println((int) a);
		} while (a < 10L);
		System.out.println("passed");
	}
}
