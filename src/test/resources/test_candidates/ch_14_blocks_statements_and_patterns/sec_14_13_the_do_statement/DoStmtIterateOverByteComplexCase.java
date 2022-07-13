
public class DoStmtIterateOverByteComplexCase {
	public static void main(String[] args) {
		byte a = (byte) 0;
		byte b = (byte) 10;
		do {
			a++;
			b--;
			System.out.println((int) a);
		} while (a < b);
		System.out.println("passed");
	}
}
