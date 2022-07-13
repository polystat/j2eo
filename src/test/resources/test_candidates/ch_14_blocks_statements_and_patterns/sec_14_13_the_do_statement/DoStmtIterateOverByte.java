
public class DoStmtIterateOverByte {
	public static void main(String[] args) {
		byte a = (byte) 0;
		do {
			a++;
			System.out.println((int) a);
		} while (a < (byte) 10);
		System.out.println("passed");
	}
}
