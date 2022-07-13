
public class DoStmtIterateOverFloatComplexCase {
	public static void main(String[] args) {
		float a = 0f;
		float b = 10f;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
