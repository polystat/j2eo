
public class DoStmtIterateOverFloat {
	public static void main(String[] args) {
		float a = 0f;
		do {
			a++;
			System.out.println((int) a);
		} while (a < 10f);
		System.out.println("passed");
	}
}
