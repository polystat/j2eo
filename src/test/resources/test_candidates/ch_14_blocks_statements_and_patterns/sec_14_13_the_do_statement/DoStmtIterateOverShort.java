
public class DoStmtIterateOverShort {
	public static void main(String[] args) {
		short a = (short) 0;
		do {
			a++;
			System.out.println((int) a);
		} while (a < (short) 10);
		System.out.println("passed");
	}
}
